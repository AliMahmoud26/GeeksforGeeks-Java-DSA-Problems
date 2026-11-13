public class JumpSearch {
    public static int jumpSearch(int[] arr, int x) {
        int n = arr.length;
        int step = (int) Math.floor(Math.sqrt(n)); // block size = √n
        int prev = 0;

        // Jump ahead in blocks until arr[min(step, n)-1] >= x
        while (arr[Math.min(step, n) - 1] < x) {
            prev = step;
            step += (int) Math.floor(Math.sqrt(n));
            if (prev >= n) return -1; // overshot array
        }

        // Linear search within the block
        while (arr[prev] < x) {
            prev++;
            if (prev == Math.min(step, n)) return -1; // not in block
        }

        // Found
        if (arr[prev] == x) return prev;
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17};
        int x = 11;

        int index = jumpSearch(arr, x);
        if (index != -1)
            System.out.println("Element " + x + " found at index: " + index);
        else
            System.out.println("Element " + x + " not found.");
    }
}