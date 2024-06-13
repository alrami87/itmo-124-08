package itmo.java.basics.lesson4.part2;

public class CheckSortingOfArray {
    public static Boolean isItSorted(int[] array) {
        Boolean result = Boolean.TRUE;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1])  result = Boolean.FALSE;
        }
        return result;
    }
}
