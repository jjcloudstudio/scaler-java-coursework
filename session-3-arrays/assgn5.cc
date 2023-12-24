#include <iostream>  // For standard I/O operations
#include <fstream>   // For file I/O operations
#include <string>    // For using string data type
#include <iomanip>   // For manipulating I/O formatting
using namespace std;

// Structure for student data
struct studentType {
    string name;  // Student's name
    float grade;  // Student's grade
};

// Function prototypes
void openFile(ifstream &);  // Opens a file
void closeFile(ifstream &);  // Closes a file
void getData(ifstream &, studentType[], int &);  // Reads data from file into array of students
double classAvg(const studentType[], int);  // Calculates class average
void sortData(studentType[], int);  // Sorts data based on grades
void display(const studentType[], int, double);  // Displays the data

const int MAX_NAMES = 100;  // Maximum number of students

int main() {
    ifstream in;  // Input file stream
    studentType students[MAX_NAMES];  // Array of students
    int count = 0;  // Number of students
    
    openFile(in);  // Open the file
    getData(in, students, count);  // Read data from file
    double totalAverage = classAvg(students, count);  // Calculate class average
    sortData(students, count);  // Sort the data
    display(students, count, totalAverage);  // Display the data
    closeFile(in);  // Close the file

    return 0;
}

void openFile(ifstream &in) {
    string filename = "grade.in";  // File name
    in.open(filename.c_str());  // Open the file
    if (!in) {  // If file couldn't be opened
        cerr << "Error opening file." << endl;
        exit(1);  // Exit the program
    }
}

void closeFile(ifstream &in) {
    in.close();  // Close the file
}

void getData(ifstream &in, studentType students[], int &count) {
    string name;  // Student's name
    float grade, sum;  // Grade and sum of grades
    int numberOfSubjects;  // Number of subjects
    while (in >> name && count < MAX_NAMES) {  // While there's more data and array isn't full
        students[count].name = name;  // Store the name
        sum = 0.0;  // Initialize sum
        numberOfSubjects = 0;  // Initialize number of subjects
        while (in >> grade && grade != -99) {  // While there's more data and grade isn't -99
            sum += grade;  // Add grade to sum
            numberOfSubjects++;  // Increment number of subjects
        }
        students[count].grade = numberOfSubjects > 0 ? sum / numberOfSubjects : 0.0;  // Calculate average grade
        count++;  // Increment count
    }
}

double classAvg(const studentType students[], int count) {
    double sum = 0.0;  // Initialize sum
    for (int i = 0; i < count; i++) {  // For each student
        sum += students[i].grade;  // Add student's grade to sum
    }
    return count > 0 ? sum / count : 0.0;  // Calculate average grade
}

void sortData(studentType students[], int count) {
    for (int i = 0; i < count - 1; i++) {  // For each student except the last
        for (int j = i + 1; j < count; j++) {  // For each student after the i-th student
            if (students[i].grade < students[j].grade) {  // If i-th student's grade is less than j-th student's grade
                swap(students[i], students[j]);  // Swap i-th and j-th students
            }
        }
    }
}

void display(const studentType students[], int count, double classAverage) {
    cout << "Student Name\tAverage\n";  // Print header
    for (int i = 0; i < count; i++) {  // For each student
        cout << students[i].name << "\t" << fixed << setprecision(2) << students[i].grade << "\n";  // Print student's name and grade
    }
    cout << "\nClass Average " << fixed << setprecision(2) << classAverage << "\n";  // Print class average
}