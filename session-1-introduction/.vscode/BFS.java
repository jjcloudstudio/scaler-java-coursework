import java.util.*;

public class Solution {
    public int solve(int A, int[][] B) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= A; i++) {
            graph.add(new ArrayList<>()); // Initialize adjacency list for each node
        }

        for (int[] edge : B) {
            graph.get(edge[0]).add(edge[1]); // Create the directed edge
        }

        // Perform BFS
        boolean[] visited = new boolean[A + 1];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1); // Start from node 1
        visited[1] = true;

        while (!queue.isEmpty()) {
            int u = queue.poll();

            if (u == A) {
                return 1; // If we reach node A, return 1
            }

            for (int neighbor : graph.get(u)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }

        return 0; // If we never reach node A, return 0
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int A = 5;
        int[][] B = {
                {1, 2},
                {4, 1},
                {2, 4},
                {3, 4},
                {5, 2},
                {1, 3}
        };
        System.out.println(solution.solve(A, B)); // Output will be 0 for this input
    }
}
