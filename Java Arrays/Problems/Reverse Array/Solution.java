// Given an array of integers arr[], reverse the array in place.

// Example 1:
// Input: arr = [1, 4, 3, 2, 6, 5]
// Output: [5, 6, 2, 3, 4, 1]
// Explanation: The elements of the array are [1, 4, 3, 2, 6, 5]. After reversing the array, the first element goes to the last position, the second element goes to the second last position and so on. Hence, the answer is [5, 6, 2, 3, 4, 1].

import java.util.Arrays;

public class Solution {
    public void reverseArray(int arr[]) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            --end;
        }
    }

    public static void main(String args[]) {
        Solution solution = new Solution();
        int arr[] = {1, 4, 3, 2, 6, 5};
        solution.reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
