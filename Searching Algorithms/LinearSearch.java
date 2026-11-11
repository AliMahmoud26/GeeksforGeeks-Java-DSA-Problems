
public class LinearSearch {
    public static int linearSearch(int arr[], int x) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        LinearSearch linear = new LinearSearch();
        int arr[] = {10, 20, 30, 40, 50};
        System.out.println(linear.linearSearch(arr, 30));
        System.out.println(linear.linearSearch(arr, 50));
    }
}
