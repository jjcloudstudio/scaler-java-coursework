//
// This program prompts a user to enter the lengths of
// the 3 sides of a triangle, check if they form a triangle,
// and prints the triangle type: right, isosceles, equilateral,
// or scalene
//

#include <iostream>
#include <cmath>

using namespace std;

bool isTriangle(double side1, double side2, double side3);
bool isIsosceles(double side1, double side2, double side3);
bool isEquilateral(double side1, double side2, double side3);
bool isRight(double side1, double side2, double side3);
double area(double side1, double side2, double side3);
double perimeter(double side1, double side2, double side3);
const double E = .0001;

int main()
{

    double side1, side2, side3;
    char message;
    //bool isTriangle, isRight, isEquilateral, isIsosceles;
    do
    {
        cout << "Enter the lengths of the 3 sides of a triangle -- ";
        cin >> side1 >> side2 >> side3;

        if (isTriangle(side1, side2, side3))
        {
            cout << "This is ";

            if (isEquilateral(side1, side2, side3))
                cout << "an equilateral ";
            else if (isIsosceles(side1, side2, side3))
                cout << "an isosceles ";
            else
                cout << "a scalene ";

            if (isRight(side1, side2, side3))
                cout << "and right ";

            cout << "triangle" << endl;

            cout << "Its perimeter is " << perimeter(side1, side2, side3) << endl;
            cout << "Its area is " << area(side1, side2, side3) << endl;
        }
        else

            cout << "This is not a triangle" << endl;

        cout << "Run again? (Y/N)";
        cin >> message;
    } while (message == 'y' || message == 'Y');
    cout << "Good bye!" ;
    return 0;
}

bool isTriangle(double sideA, double sideB, double sideC)
{
    return sideA + sideA > sideC &&
           sideA + sideC > sideB &&
           sideB + sideC > sideA;
}

bool isEquilateral(double sideA, double sideB, double sideC)
{
    return fabs(sideA - sideB) < E &&
           fabs(sideA - sideC) < E;
}
bool isIsosceles(double sideA, double sideB, double sideC)
{
    return fabs(sideA - sideB) < E ||
           fabs(sideA - sideC) < E ||
           fabs(sideB - sideC) < E;
}

bool isRight(double sideA, double sideB, double sideC)
{
    return fabs(pow(sideA, 2) - pow(sideB, 2) - pow(sideC, 2)) < E ||
           fabs(pow(sideB, 2) - pow(sideA, 2) - pow(sideC, 2)) < E ||
           fabs(pow(sideC, 2) - pow(sideA, 2) - pow(sideB, 2)) < E;
}

double perimeter(double sideA, double sideB, double sideC)
{
    return sideA + sideB + sideC;
}

double area(double sideA, double sideB, double sideC)
{

    double s = perimeter(sideA, sideB, sideC) / 2;
    return sqrt((s*(s - sideA)*(s - sideB)*(s - sideC)));
}