#include <iostream>      // Includes the standard I/O library for input and output operations.
#include <fstream>       // Includes the file stream library for file handling.
#include <string>        // Includes the string library to use the string data type.
#include <iomanip>       // Includes the input/output manipulation library for formatting output.
#include <cmath>         // Includes the C math library for any mathematical operations, if needed.
using namespace std;     // Allows the use of entities in the standard namespace.

// STRUCTURES
struct studentType {     // Defines a structure named studentType.
    string name;         // Member of studentType to store the student's name.
    float grade;         // Member of studentType to store the student's grade average.
};

// FUNCTION PROTOTYPES
void openFile(ifstream &);           // Prototype for a function to open a file.
void closeFile(ifstream &);          // Prototype for a function to close a file.
void getData(ifstream &, studentType[], int &); // Prototype for a function to read data from the file.
float classAvg(const studentType[], int);       // Prototype for a function to calculate the class average.
int findHighestGrade(const studentType[], int, int); // Prototype for a function to find the student with the highest grade.
void swap(studentType &, studentType &);        // Prototype for a function to swap two studentType elements.
void sortGrades(studentType[], int);            // Prototype for a function to sort student grades.
void display(const studentType[], int, float);  // Prototype for a function to display the data.

const int MAX_NAMES = 100; // Constant for the maximum number of student names.

int main() {
    ifstream in;           // Creates an input file stream object.
    studentType students[MAX_NAMES]; // Array of studentType to store student data.
    int count = 0;         // Variable to keep track of the number of students.

    openFile(in);          // Calls function to open a file.
    getData(in, students, count);  // Calls function to read data from the file.
    float totalAverage = classAvg(students, count); // Calculates the class average.
    sortGrades(students, count);   // Sorts the students by their grades.
    display(students, count, totalAverage); // Displays the sorted data.
    closeFile(in);         // Calls function to close the file.

    return 0;              // Ends the main function.
}

// Function to open a file for reading.
void openFile(ifstream &in) {
    string filename = "grade.in"; // Specifies the filename.
    in.open(filename.c_str());    // Opens the file with the given filename.
}

// Function to close an opened file.
void closeFile(ifstream &in) {
    in.close(); // Closes the input file stream.
}

// Function to read names and grades from a file into an array.
void getData(ifstream &in, studentType students[], int &count) {
    string name;         // Variable to store the student's name.
    float grade, sum;    // Variables to store grades and their sum.
    int numberOfSubjects; // Variable to count the number of subjects.
    while (in >> name && count < MAX_NAMES) { // Reads a name and checks if the array limit is not exceeded.
        students[count].name = name; // Stores the read name in the array.
        sum = 0.0;          // Initializes sum for this student.
        numberOfSubjects = 0; // Resets the number of subjects for this student.
        while (in >> grade && grade != -99) { // Reads grades until -99 is encountered.
            sum += grade;    // Adds the grade to the sum.
            numberOfSubjects++; // Increments the number of subjects.
        }
        if (numberOfSubjects > 0) { // Checks if there were any subjects.
            students[count].grade = sum / numberOfSubjects; // Calculates the average grade.
        } else {
            students[count].grade = 0.0; // Sets average grade to 0 if no subjects were read.
        }
        count++; // Increments the student count.
    }
}

// Function to calculate the total class average.
float classAvg(const studentType students[], int count) {
    float sum = 0.0; // Variable to hold the sum of all grades.
    for (int i = 0; i < count; i++) {
        sum += students[i].grade; // Adds each student's grade to the sum.
    }
    return sum / count; // Returns the average (total sum divided by the number of students).
}

// Function to find the index of the student with the highest grade.
int findHighestGrade(const studentType student[], int start, int count) {
    int highestIndex = start;  // Initializes the highestIndex to the start index.

    for (int i = start + 1; i < count; i++) { // Loops through the students, starting from start + 1 to the end.
        if (student[highestIndex].grade < student[i].grade) { // Compares the current highest grade with the grade of the student at index i.
            highestIndex = i;  // If student at index i has a higher grade, update highestIndex.
        }
    }
    return highestIndex;  // Returns the index of the student with the highest grade found in the range.
}

// Function to swap two studentType elements.
void swap(studentType &first, studentType &second) {
    studentType temp = first; // Creates a temporary studentType variable and assigns it the value of the first element.
    first = second;           // Assigns the value of the second element to the first element.
    second = temp;            // Assigns the value of the temporary variable (original first element) to the second element.
}

// Function to sort the students by their grades in descending order.
void sortGrades(studentType students[], int count) {
    for (int i = 0; i < count - 1; i++) { // Loop over each element in the array, except the last one.
        int highestGradeIndex = findHighestGrade(students, i, count); // Find the index of the highest grade from the current position to the end.
        swap(students[i], students[highestGradeIndex]); // Swap the current element with the element having the highest grade.
    }
}

// Function to display the student names, their grade averages, and the class average.
void display(const studentType students[], int count, float totalAverage) {
    cout << setw(20) << left << "Student Name" << setw(20) << right << "Average" << endl; // Sets up column headers for display.
    for (int i = 0; i < count; i++) { // Loop through each student.
        // Print each student's name and grade, formatted to align in columns.
        cout << setw(20) << left << students[i].name << setw(20) << right << fixed << showpoint << setprecision(2) << students[i].grade << endl;
    }
    // Print the total class average at the end.
    cout << "Class Average -- " << fixed << showpoint << setprecision(2) << totalAverage << endl;
}
