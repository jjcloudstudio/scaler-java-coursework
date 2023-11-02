#include <iostream>

// Assuming the sequence won't exceed 1000 numbers for this example.
// You might need to increase this for actual use.
const int MAX_SEQUENCE_LENGTH = 1000;

int main() {
    while (true) {
        // Ask the user for the initial value of the sequence
        std::cout << "Enter the starting number (positive integer) of the sequence: ";
        int r;
        std::cin >> r;

        // Validate input
        if (r <= 0) {
            std::cout << "Please enter a non-zero positive integer." << std::endl;
            continue;
        }

        int sequence[MAX_SEQUENCE_LENGTH];
        sequence[0] = r;
        int length = 1;  // Current length of the sequence
        int max_val = r;  // The maximum value encountered in the sequence
        int max_pos = 0;  // The position at which the maximum value is encountered

        // Generate the sequence
        while (r != 1 && length < MAX_SEQUENCE_LENGTH) {
            if (r % 2 == 0) {
                r /= 2;
            } else {
                r = 3 * r + 1;
            }

            sequence[length] = r;

            // Check if the current number is the largest so far
            if (r > max_val) {
                max_val = r;
                max_pos = length;
            }

            ++length;
        }

        // Output the results
        std::cout << "k = " << (length - 1) << std::endl;
        std::cout << "The sequence is: ";
        for (int i = 0; i < length; ++i) {
            std::cout << sequence[i];
            if (i != length - 1) {
                std::cout << ", ";
            }
        }
        std::cout << std::endl;
        std::cout << "The largest number is " << max_val << " at position " << max_pos << "." << std::endl;

        // Check if the user wants to compute another sequence
        std::cout << "Do you want to compute another sequence? (yes/no): ";
        std::string response;
        std::cin >> response;
        if (response != "yes") {
            break;
        }
    }

    return 0;
}
