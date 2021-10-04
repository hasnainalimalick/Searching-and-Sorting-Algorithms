import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] array) {
        int bubble = array[0];
        int length = array.length;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < length; j++) {
                if (bubble > array[j]){
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                    bubble = array[j];

                }
                else if (bubble < array[j]){
                    bubble = array[j];
                    if (j == array.length - 1){
                        int temp = array[j - 1];
                        array[j - 1] = array[j];
                        array[j] = temp;
                        bubble = array[j];
                    }

                }


            }
            length --;

        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] array = {10, 9, 11, 6, 15, 2};
        bubbleSort(array);
    }
}
