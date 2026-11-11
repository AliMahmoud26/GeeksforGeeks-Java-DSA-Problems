import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String args[]) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);

        System.out.println(arr);

        arr.remove(1);
        System.out.println(arr);
    }
}
