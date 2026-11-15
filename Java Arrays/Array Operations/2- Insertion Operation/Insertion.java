public class Insertion {
    public static void main(String args[]) {
        int arr[] = new int[5];
        System.out.println("Inserting elements into the array:");
        for (int i = 0; i < 5; i++) {
            arr[i] = i + 1;
            System.out.println("arr[" + i + "]: " + arr[i]);
        }
    }
}