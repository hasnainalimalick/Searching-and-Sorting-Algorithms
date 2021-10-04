public class BinarySearch {
    public static int findElement(int[] array, int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;


            if (array[mid] == x) {
                return mid;
            }

            if (array[mid] > x)
                return findElement(array, l, mid - 1, x);
            else return findElement(array, mid + 1, r, x);
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = array.length;
        int x = 7;
        System.out.println(findElement(array, 0, n - 1, x));

    }
}