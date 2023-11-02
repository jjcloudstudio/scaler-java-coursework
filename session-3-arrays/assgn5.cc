#include <iostream>

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

        int current_number = r;
        int step_count = 0;  // To count the steps needed to reach 1
        int max_val = r;  // To keep track of the maximum value
        int max_pos = 0;  // To keep track of the position of the maximum value
        int current_pos = 0;  // The current position in the sequence

        std::cout << "The sequence is: " << current_number;

        // Generate the sequence
        while (current_number != 1) {
            if (current_number % 2 == 0) {
                current_number /= 2;
            } else {
                current_number = 3 * current_number + 1;
            }

            std::cout << ", " << current_number;

            ++step_count;
            ++current_pos;

            // Check if the current number is the largest so far
            if (current_number > max_val) {
                max_val = current_number;
                max_pos = current_pos;
            }
        }

        std::cout << std::endl;
        
        // Output the results
        std::cout << "k = " << step_count << std::endl;
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
