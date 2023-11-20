//
// This program prompts a user to enter the lengths of
// the 3 sides of a triangle, checks if they form a triangle,
// and prints the triangle type: right, isosceles, equilateral,
// or scalene, as well as its perimeter and area.
//

#include <iostream>
#include <cmath>
#include <iomanip>

using namespace std;

bool isTriangle(double side1, double side2, double side3);
bool isIsosceles(double side1, double side2, double side3);
bool isEquilateral(double side1, double side2, double side3);
bool isRight(double side1, double side2, double side3);
double area(double side1, double side2, double side3);
double perimeter(double side1, double side2, double side3);
void perimeterArea(double sideA, double sideB, double sideC, double &perim, double &areaVal);

const double E = .0001;

int main()
{

    double side1, side2, side3;
    char message;
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

            double perim, areaVal;
            perimeterArea(side1, side2, side3, perim, areaVal);
            cout << fixed << setprecision(4);
            cout << "Its perimeter is " << perim << endl;
            cout << "Its area is " << areaVal << endl;
            
            cout << endl;
        }
        else

            cout << "This is not a triangle" << endl;

        cout << "Run again? (Y/N)";
        cin >> message;
        cout << endl;
    } while (message == 'y' || message == 'Y');
    cout << "Good bye!";
    return 0;
}

bool isTriangle(double sideA, double sideB, double sideC)
{
    return sideA + sideB > sideC &&
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

double perimeter(double sideA, double sideB, double sideC) {
    return sideA + sideB + sideC;
}

double area(double sideA, double sideB, double sideC) {
    double s = perimeter(sideA, sideB, sideC) / 2.0;
    return std::sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
}

void perimeterArea(double sideA, double sideB, double sideC, double &perim, double &areaVal) {
    perim = perimeter(sideA, sideB, sideC);
    areaVal = area(sideA, sideB, sideC);
}