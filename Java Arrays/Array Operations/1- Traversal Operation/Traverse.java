public class Traverse {
    public static void main(String args[]) {
        int arr[] = new int[5];
        System.out.println("Traversing the array elements:");
        for (int i = 0; i < 5; i++) {
            arr[i] = i + 1;
            System.out.println("arr[" + i + "]: " + arr[i]);
        }
        System.out.println("Traversing the array elements in reverse order:");
        for (int i = 4; i >= 0; i--) {
            System.out.println("arr[" + i + "]: " + arr[i]);
        }
    }
}
