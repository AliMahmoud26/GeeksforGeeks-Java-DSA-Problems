// You are given an array arr[], the task is to return a list elements of arr in alternate order (starting from index 0).

// Example 1:
// Input: arr[] = [1, 2, 3, 4]
// Output: 1 3
// Explanation:
// Take first element: 1
// Skip second element: 2
// Take third element: 3
// Skip fourth element: 4

// Example 2:
// Input: arr[] = [1, 2, 3, 4, 5]
// Output: 1 3 5
// Explanation:
// Take first element: 1
// Skip second element: 2
// Take third element: 3
// Skip fourth element: 4
// Take fifth element: 5

import java.util.*;

class Solution {
    public ArrayList<Integer> getAlternates(int arr[]) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i += 2) {
            result.add(arr[i]);
        }
        return result;
    }

    public static void main(String args[]) {
        Solution solution = new Solution();
        int arr[] = {1, 2, 3, 4, 5};
        int arr_2[] = {1, 2, 3};
        System.out.println(solution.getAlternates(arr));
        System.out.println(solution.getAlternates(arr_2));
    }
}
