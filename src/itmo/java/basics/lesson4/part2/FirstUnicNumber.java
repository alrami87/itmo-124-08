package itmo.java.basics.lesson4.part2;

public class FirstUnicNumber {
    public static Integer getNumber(int[] array) {
        for (int i = 0; i < array.length; i++) {
            Boolean isUnic = Boolean.TRUE;
            for (int j = 0 ; j < i; j++) {
                if (array[i] == array[j]) isUnic = Boolean.FALSE;
            }
            for (int j = i + 1 ; j < array.length; j++) {
                if (array[i] == array[j]) isUnic = Boolean.FALSE;
            }
            if (isUnic)  return array[i];
        }
        return null;
    }
}
