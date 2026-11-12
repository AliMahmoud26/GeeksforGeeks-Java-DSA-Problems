// Given an array arr[]. The task is to find the largest element and return it.

// Example 1:
// Input: arr[] = [1, 8, 7, 56, 90]
// Output: 90
// Explanation: The largest element of the given array is 90.

// Example 2:
// Input: arr[] = [5, 5, 5, 5]
// Output: 5
// Explanation: The largest element of the given array is 5.

public class Solution {
    public static int largest(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String args[]) {
        int arr[] = {1, 8, 7, 56, 90};
        System.out.println(largest(arr));
        int arr_2[] = {5, 5, 5, 5};
        System.out.println(largest(arr_2));
    }
}
