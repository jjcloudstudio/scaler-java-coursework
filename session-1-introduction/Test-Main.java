import java.util.*; // Importing all classes from java.util package

public class Solution { // Defining a public class named Solution

    public int solve(int A, ArrayList<ArrayList<Integer>> B) { // Defining a public method named solve which takes an integer and a 2D ArrayList as parameters
        // Create graph from adjacency list
        List<List<Integer>> graph = new ArrayList<>(); // Creating an adjacency list to represent the graph
        for (int i = 0; i <= A; i++) { // Looping from 0 to A
            graph.add(new ArrayList<>()); // Initializing an empty list for each node in the graph
        }

        for (ArrayList<Integer> edge : B) { // Looping through each edge in the input ArrayList B
            graph.get(edge.get(0)).add(edge.get(1)); // Adding an edge in the graph from edge[0] to edge[1]
        }

        // Perform BFS
        boolean[] visited = new boolean[A + 1]; // Creating a visited array to keep track of visited nodes
        Queue<Integer> queue = new LinkedList<>(); // Creating a queue to keep track of nodes to be visited
        queue.add(1); // Adding the first node to the queue
        visited[1] = true; // Marking the first node as visited

        while (!queue.isEmpty()) { // While there are still nodes to visit
            int u = queue.poll(); // Removing the first node from the queue

            if (u == A) { // If the current node is the target node
                return 1; // Return 1 indicating a path exists
            }

            for (int neighbor : graph.get(u)) { // For each neighbor of the current node
                if (!visited[neighbor]) { // If the neighbor has not been visited
                    visited[neighbor] = true; // Mark the neighbor as visited
                    queue.add(neighbor); // Add the neighbor to the queue
                }
            }
        }

        return 0; // If no path to the target node was found, return 0
    }

    // This main method is just for your local testing
    public static void main(String[] args) { // Defining the main method which is the entry point of the program
        Solution solution = new Solution(); // Creating an instance of the Solution class
        int A = 5; // Defining the number of nodes in the graph
        ArrayList<ArrayList<Integer>> B = new ArrayList<>(); // Defining the edges in the graph
        B.add(new ArrayList<>(Arrays.asList(1, 2)));
        B.add(new ArrayList<>(Arrays.asList(4, 1)));
        B.add(new ArrayList<>(Arrays.asList(2, 4)));
        B.add(new ArrayList<>(Arrays.asList(3, 4)));
        B.add(new ArrayList<>(Arrays.asList(5, 2)));
        B.add(new ArrayList<>(Arrays.asList(1, 3)));
        
        System.out.println(solution.solve(A, B)); // Calling the solve method and printing the result
    }
}