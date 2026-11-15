public class Display {
    public static void main(String args[]) {
        int arr[] = new int[5];
        int n = arr.length;
        System.out.println("Displaying the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
            System.out.println("arr[" + i + "]: " + arr[i]);
        }
    }
}