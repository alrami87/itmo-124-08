package itmo.java.basics.lesson4.part2;

public class CheckSortingOfArray {
    public static boolean isItSorted(int[] array) {
        Boolean result = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1])  result = false;
        }
        return result;
    }
}
