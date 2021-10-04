public class JumpSearch {
    public static void findElement(int[] array, int target) {
        int part = (int)Math.floor(Math.sqrt(array.length-1));
        int i;
        int length = array.length - 1;
        hasnain:
        for (i = 0; i < array.length; i++) {
            for (int j = i; j <= part; j++) {
                i ++;
                if (array[j] == target) {
                    System.out.println(j);
                    break hasnain;
                }
            }
            part = part * 2;
        }
    }

    public static void main(String[] args) {
        int[]array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        findElement(array, 7);
    }
}
