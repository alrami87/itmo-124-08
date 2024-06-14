package itmo.java.basics.lesson4.part2;

public class FirstUnicNumber {
    public static Integer getNumber(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean isUnic = true;
            for (int j = 0 ; j < i; j++) {
                if (array[i] == array[j]) isUnic = false;
            }
            for (int j = i + 1 ; j < array.length; j++) {
                if (array[i] == array[j]) isUnic = false;
            }
            if (isUnic)  return array[i];
        }
        return null;
    }
}
