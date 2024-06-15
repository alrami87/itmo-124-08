package itmo.java.basics.lesson4.part2;

public class ArrayHeadTailChange {
    public static int[] change(int[] array) {
        array[0] += array[array.length - 1];
        array[array.length - 1] = array[0] - array[array.length - 1];
        array[0] -= array[array.length - 1];
        return array;
    }
}
