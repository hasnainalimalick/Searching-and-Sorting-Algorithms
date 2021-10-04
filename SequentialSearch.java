public class SequentialSearch {
    public static int findElement(int[] array, int tar){
        int i;
        for (i = 0; i < array.length; i++) {
            if (array[i] == tar)
            break;
        }
        return i;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int result = findElement(array, 4);
        System.out.println(result);
    }
}
