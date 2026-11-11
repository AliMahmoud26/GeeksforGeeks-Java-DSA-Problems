import java.util.*;

public class Solution_2 {
    public ArrayList<Integer> getAlternates(int arr[]) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                result.add(arr[i]);
            }
        }
        return result;
    }

    public static void main(String args[]) {
        Solution_2 solution = new Solution_2();
        int arr[] = {1, 2, 3, 4, 5};
        int arr_2[] = {1, 2, 3};
        System.out.println(solution.getAlternates(arr));
        System.out.println(solution.getAlternates(arr_2));
    }
}
