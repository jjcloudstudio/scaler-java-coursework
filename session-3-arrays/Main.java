import java.util.*;

public class Solution {
    public int[][] solve(int[] A) {
        // This list will store all sub-arrays.
        ArrayList <ArrayList<Integer>> finalList = new ArrayList<>();

        // Iterate over the array. 'start' is the beginning index of sub-array.
        for(int start = 0; start < A.length; start++) {
            // 'end' is the ending index of sub-array. It goes from 'start' to end of the array.
            for(int end = start; end < A.length; end++) {
                // This list will store the current sub-array.
                ArrayList <Integer> sub_list = new ArrayList<>();
                // Iterate over the array from 'start' to 'end' and add all elements to 'sub_list'.
                for(int k = start; k <= end; k++) {
                    sub_list.add(A[k]);
                }
                // After the loop, 'sub_list' contains a sub-array of 'A', so add it to 'finalList'.
                finalList.add(sub_list);
            }
        }

        // After the above loops, 'finalList' contains all sub-arrays of 'A' as lists. 
        // Now we need to convert it into a 2D array.

        // Create an empty 2D array with number of rows equal to the size of 'finalList'.
        int[][] result = new int[finalList.size()][];

        // Iterate over 'finalList'.
        for (int i = 0; i < finalList.size(); i++) {
            // Get the i-th list.
            ArrayList<Integer> row = finalList.get(i);
            // Create a new row in 'result' with number of columns equal to the size of the list.
            result[i] = new int[row.size()];
            // Copy the elements of the list into the newly created row.
            for (int j = 0; j < row.size(); j++) {
                result[i][j] = row.get(j);
            }
        }

        // Return the resulting 2D array.
        return result;
    }
}
