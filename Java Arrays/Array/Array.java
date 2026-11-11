public class Array {
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;

        System.out.println("Primitive Array -> ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
        System.out.println(arr[0]);
        System.out.println(arr[4]);
        arr[0] = 10;
        System.out.println(arr[0]);
        System.out.println("Primitive Array -> ");

        // Non-Primitive Array
        String[] names = {"John", "Jane", "Doe", "Smith"};
        int nameCount = names.length;
        System.out.println("Non-Primitive Array -> ");
        for (int i = 0; i < nameCount; i++) {
            System.out.println(names[i] + " ");
        }
    }
}
