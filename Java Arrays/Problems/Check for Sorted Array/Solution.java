// Given an array arr[], check whether it is sorted in non-decreasing order. Return true if it is sorted otherwise false.

// Example 1:
// Input: arr[] = [10, 20, 30, 40, 50]
// Output: true
// Explanation: The given array is sorted.

// Example 2:
// Input: arr[] = [90, 80, 100, 70, 40, 30]
// Output: false
// Explanation: The given array is not sorted.

public class Solution {
    public boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i+1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Solution sorted = new Solution();
        int arr[] = {10, 20, 30, 40, 50};
        System.out.println(sorted.isSorted(arr));
        int arr_2[] = {90, 80, 100, 70, 40, 30};
        System.out.println(sorted.isSorted(arr_2));
    }
}
