// Purpose: Opens a file for reading.
// Inputs: None
// Outputs: The opened file
void openFile(ifstream &in){
    string filename = "grade.in"; // Define the file name to be opened
    in.open(filename.c_str());    // Open the file with the given filename
}

// Purpose: Closes an opened file.
// Inputs: Reference to ifstream object (in)
// Outputs: None
void closeFile(ifstream &in){
    in.close(); // Close the file associated with the ifstream object
}

// Purpose: Reads names and grades from a file into an array of studentType.
// Inputs: ifstream object (in) for file handling, array of studentType (students), reference to count of students
// Outputs: The students array filled with name and grade information, updated student count
void getData(ifstream &in, studentType students[], int &count){
    string name; // Temporary variable to hold student's name
    float grade, sum; // Temporary variables to hold grade and sum of grades
    int numberOfSubjects; // Temporary variable to count the number of subjects

    // Reading each student's data
    while (in >> name && count < MAX_NAMES){
        students[count].name = name; // Store the student's name
        sum = 0.0; // Initialize sum for this student
        numberOfSubjects = 0; // Initialize subject count for this student

        // Read grades and calculate the sum
        while(in >> grade && grade != -99){
            sum += grade; // Add the grade to sum
            numberOfSubjects++; // Increment the number of subjects
        }

        // Calculate average grade for the student
        if(numberOfSubjects > 0){
            students[count].grade = sum / numberOfSubjects;
        } else {
            students[count].grade = 0.0; // Set grade to 0 if no subjects were read
        }
        count++; // Increment the student count
    }
}

// Purpose: To calculate the total class average.
// Inputs: Array of studentType (students) with grades, count of students
// Outputs: The total class average
// Returns: float totalAverage - the average for the class
float classAvg(const studentType students[], int count){
    float sum = 0.0; // Variable to store the sum of all grades

    // Accumulate all grades
    for(int i = 0; i < count; i++){
        sum += students[i].grade;
    }
    return sum / count; // Return the average grade
}

// Purpose: To find the index of the student with the highest grade.
// Inputs: Array of studentType (student), start index for search, total count of students
// Outputs: Index of the student with the highest grade
// Returns: int highestIndex - index of the student with the highest grade
int findHighestGrade(const studentType student[], int start, int count) {
    int highestIndex = start; // Initialize the highest index to the start index

    // Loop to find the student with the highest grade
    for (int i = start + 1; i < count; i++) {
        if (student[highestIndex].grade < student[i].grade) {
            highestIndex = i; // Update the highest index
        }
    }
    return highestIndex; // Return the index of the highest grade
}

// Purpose: To swap two studentType elements.
// Inputs: References to two studentType elements (first and second)
// Outputs: The two elements swapped in place
void swap(studentType &first, studentType &second) {
    studentType temp = first; // Temporary storage for the first element
    first = second;           // Assign second element to the first
    second = temp;            // Assign the temporary element to the second
}

// Purpose: To sort the students by their grades in descending order.
// Inputs: Array of studentType (students), total count of students
// Outputs: The students array sorted by grades
void sortGrades(studentType students[], int count) {
    // Iterate over each student
    for (int i = 0; i < count - 1; i++) {
        // Find the index of the highest grade from the remaining students
        int highestGradeIndex = findHighestGrade(students, i, count);
        // Swap the current student with the student having the highest grade
        swap(students[i], students[highestGradeIndex]);
    }
}

// Purpose: To display the names of the students, their average grades, and the total class average.
// Inputs: Array of studentType (students) containing student data, count of students, total class average
// Outputs: Student name and grade averages, as well as the class average, displayed to standard output
void display(const studentType students[], int count, float totalAverage){
    cout << setw(20) << left << "Student Name  " << setw(20) << right << "Average" << endl; // Sets up column headers for display
    for(int i = 0; i < count; i++){
        // Print each student's name and grade, formatted to align in columns
        cout << setw(20) << left << students[i].name << setw(20) << right << fixed << showpoint << setprecision(2) << students[i].grade << endl;
    }
    // Print the total class average at the end
    cout << "Class Average -- " << fixed << showpoint << setprecision(2) << totalAverage;
}
