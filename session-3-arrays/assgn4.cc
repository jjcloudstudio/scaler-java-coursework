#include <iostream>
#include <string>
#include <cctype>

using namespace std;

string getEmailAddress();
void extract(const string &email, string &firstName, string &lastName);
void capitalize(string &name);
void display(const string &firstName, const string &lastName);

int main() {
    char message;
    do {
        string firstName, lastName, email;
        email = getEmailAddress();
        extract(email, firstName, lastName);
        capitalize(firstName);
        capitalize(lastName);
        display(firstName, lastName);

        cout << "Run again? (Y/N): ";
        cin >> message;
    } while (message == 'y' || message == 'Y');
    cout << "Good bye!" << endl;
    return 0;
}

string getEmailAddress() {
    string email;
    cout << "Please enter an email address: ";
    cin >> email;
    return email;
}

void extract(const string &email, string &firstName, string &lastName) {
    int dotIndex = email.find('.');
    int atIndex = email.find('@');
    firstName = email.substr(0, dotIndex);
    lastName = email.substr(dotIndex + 1, atIndex - dotIndex - 1);
}

void capitalize(string &name) {
    if (!name.empty()) {
        name[0] = toupper(name[0]);
    }
}

void display(const string &firstName, const string &lastName) {
    cout << lastName << ", " << firstName << endl;
}
