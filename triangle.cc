//
// This program reads names from a file into an array of student struct type, sorts the names using selection sort
//
#include <iostream>
#include <fstream>
#include <string>
#include <cctype>

using namespace std;

// Struct definitions
struct personType
{
    string name;
    int age;
};

// Function Prototypes
void openFile(ifstream &);
void closeFile(ifstream &);
void readData(ifstream &, personType[], int &);
int findSmallestName(const personType[], int, int);
int findSmallestAge(const personType[], int, int);
void swap(personType &, personType &);
void sortNames(personType[], int);
void sortAges(personType[], int);
void print(const personType[], int);

// Constant Declarations
const int MAX_NAMES = 100;

int main()
{
    ifstream in;
    int numberOfNames;
    personType persons[MAX_NAMES];

    openFile(in);

    readData(in, persons, numberOfNames);

    cout << "Sorted by age" << endl
         << "--------------" << endl;
    sortAges(persons, numberOfNames);
    print(persons, numberOfNames);

    cout << endl
         << "Sorted by name" << endl
         << "-------------" << endl;
    sortNames(persons, numberOfNames);
    print(persons, numberOfNames);

    closeFile(in);

    return 0;
}

// Purpose    -- Prompts a user to enter a file name and opens it
// Parameters -- Inputs --
//               Outputs --
//               Inputs/Outputs -- ifstream i -- input file stream
// Return     --
void openFile(ifstream &i)
{
    string filename;
    do
    {
        cout << "Enter a filename -- ";
        cin >> filename;
        i.open(filename.c_str());
    } while (!i);
}

// Purpose    -- Closes a file
// Parameters -- Inputs --
//               Outputs --
//               Inputs/Outputs -- ifstream file -- input file stream
// Return     --
void closeFile(ifstream &file)
{
    file.close();
}

// Purpose    -- Reads names from a file into an array of persons records.
// Parameters -- Inputs -- ifstream file -- input file stream.
//               Outputs -- personType persons[] -- array of persons records.
//                          int &count -- number of names in the array.
//               Inputs/Outputs --
// Return     --
void readData(ifstream &file, personType persons[], int &count)
{
    count = 0;
    file >> persons[count].name >> persons[count].age;
    while (!file.eof())
    {
        count++;
        file >> persons[count].name >> persons[count].age;
    }
}

// Purpose    -- Finds the index of the smallest name in an array of persons records.
// Parameters -- Inputs --  personType persons[] -- array of persons records.
//                          int start -- starting index of the search.
//                          int n -- number of names in the array.
//               Outputs -- int -- index of the smallest name in the array.
//               Inputs/Outputs --
// Return     -- int -- index of the smallest name in the array.
int findSmallestName(const personType persons[], int start, int n)
{
    int smallestIndex = start;
    for (int i = start + 1; i < n; i++)
    {
        if (persons[smallestIndex].name > persons[i].name)
        {
            smallestIndex = i;
        }
    }
    return smallestIndex;
}

// Purpose    -- Finds the index of the smallest age in an array of persons records.
// Parameters -- Inputs --  personType persons[] -- array of persons records.
//                          int start -- starting index of the search.
//                          int n -- number of names in the array.
//               Outputs -- int -- index of the smallest age in the array.
//               Inputs/Outputs --
// Return     -- int -- index of the smallest age in the array.
int findSmallestAge(const personType persons[], int start, int n)
{
    int smallestIndex = start;
    for (int i = start + 1; i < n; i++)
    {
        if (persons[smallestIndex].age > persons[i].age)
        {
            smallestIndex = i;
        }
    }
    return smallestIndex;
}

// Purpose    -- Swaps two persons records.
// Parameters -- Inputs --
//               Outputs --
//               Inputs/Outputs --  personType &first -- first persons record.
//                                  personType &second -- second persons record.
// Return     --
void swap(personType &first, personType &second)
{
    personType temp = first;
    first = second;
    second = temp;
}

// Purpose    -- Sorts an array of persons records by name.
// Parameters -- Inputs -- int n -- number of names in the array.
//               Outputs --
//               Inputs/Outputs -- personType persons[] -- array of persons records.
// Return     --
void sortNames(personType persons[], int n)
{
    for (int i = 0; i < n - 1; i++)
    {
        int smallestNameIndex = findSmallestName(persons, i, n);
        swap(persons[i], persons[smallestNameIndex]);
    }
}

// Purpose    -- Sorts an array of persons records by age.
// Parameters -- Inputs -- int n -- number of names in the array.
//               Outputs --
//               Inputs/Outputs -- personType persons[] -- array of persons records.
// Return     --
void sortAges(personType persons[], int n)
{
    for (int i = 0; i < n - 1; i++)
    {
        int smallestAgeIndex = findSmallestAge(persons, i, n);
        swap(persons[i], persons[smallestAgeIndex]);
    }
}

// Purpose    -- Prints an array of persons records.
// Parameters -- Inputs -- personType persons[] -- array of persons records.
//                          int n -- number of names in the array.
//               Outputs --
//               Inputs/Outputs --
// Return     --
void print(const personType persons[], int n)
{
    for (int i = 0; i < n; i++)
    {
        cout << persons[i].name << " " << persons[i].age << endl;
    }
}