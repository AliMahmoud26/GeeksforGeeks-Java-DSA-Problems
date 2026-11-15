public class Searching {
    public static void main(String args[]) {
        int arr[] = new int[5];
        int n = arr.length;
        System.out.println("Inserting elements into the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
            System.out.println("arr[" + i + "]: " + arr[i]);
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] == 3) {
                System.out.println("Element 3 found at index: " + i);
                break;
            } else if (i == n - 1) {
                System.out.println("Element 3 not found in the array.");
            }
        }
    }
}