
public class Interpolation {
    public static int interpolationSearch(int arr[], int x) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high &&  x >= arr[low] && x <= arr[high]) {
            if (low == high) {
                if (arr[low] == x) {
                    return low;
                }
                return -1;
            }

            int pos = low + ((x - arr[low]) * (high - low)) / (arr[high] - arr[low]);

            if (arr[pos] == x) {
                return pos;
            }

            if (arr[pos] < x) {
                low = pos + 1;
            } else {
                high = pos - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        Interpolation interpolation = new Interpolation();
        int arr[] = {10, 20, 30, 40, 50};
        System.out.println(interpolation.interpolationSearch(arr, 30));
        System.out.println(interpolation.interpolationSearch(arr, 50));
    }
}
