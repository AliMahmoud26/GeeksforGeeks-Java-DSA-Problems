public class Deletion {
    public static void main(String args[]) {
        int arr[] = new int[3];
        int n = arr.length;
        System.out.println("Inserting elements into the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = i + 3;
            System.out.println("arr[" + i + "]: " + arr[i]);
        }
        // Simulate deletion of element at index 1
        int deleteIndex = 1;
        for (int i = deleteIndex; i < n - 1; i++) {
            arr[i] = arr[i + 1];
            n = n - 1;
        }
        System.out.println("After deletion, the array elements are:");
        for (int i = 0; i < n; i++) {
            System.out.println("arr[" + i + "]: " + arr[i]);
        }
    }
}