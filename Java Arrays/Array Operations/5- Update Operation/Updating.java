public class Updating {
    public static void main(String args[]) {
        int arr[] = new int[5];
        int n = arr.length;
        System.out.println("Inserting elements into the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
            System.out.println("arr[" + i + "]: " + arr[i]);
        }
        System.out.println("Updating the element at index 2 to 10:");
        arr[2] = 10;
        System.out.println("Updated array elements:");
        for (int i = 0; i < n; i++) {
            System.out.println("arr[" + i + "]: " + arr[i]);
        }
    }
}