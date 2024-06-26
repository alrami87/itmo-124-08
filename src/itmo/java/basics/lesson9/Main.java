package itmo.java.basics.lesson9;

import src.itmo.java.basics.lesson9.User;

import java.util.*;

import static java.lang.System.currentTimeMillis;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();

        strings.add("abc");
        strings.add("def");
        strings.add("ghi");
        strings.add("def");
        strings.add("jkl");

        System.out.println(strings);
        System.out.println(makeUnic(strings));

        var numberOfElementsOfList = 1000000;
        var numberOfReceivedElementsOfList = 100000;

//        long start = currentTimeMillis();
//
//        ArrayList<String> millStrings = new ArrayList<>();
//        for (int i = 0; i < numberOfElementsOfList; i++) {
//            millStrings.add(String.valueOf(i));
//        }
//
//        System.out.println("Время заполнения списка составило " + (currentTimeMillis() - start) + " ms");
//
//        start = currentTimeMillis();
//
//        LinkedList<String> millLinkedStrings = new LinkedList<>();
//        for (int i = 0; i < numberOfElementsOfList; i++) {
//            millLinkedStrings.add(String.valueOf(i));
//        }
//
//        System.out.println("Время заполнения двусвязанного списка составило " + (currentTimeMillis() - start) + " ms");
//
//        start = currentTimeMillis();
//        getRandomElements(millStrings, numberOfReceivedElementsOfList);
//        System.out.println("Время время выбора " + numberOfReceivedElementsOfList + " элементов из списка составило " + (currentTimeMillis() - start) + " ms");
//
//        start = currentTimeMillis();
//        getRandomElements(millLinkedStrings, numberOfReceivedElementsOfList);
//        System.out.println("Время время выбора " + numberOfReceivedElementsOfList + " элементов из двусвязанного списка составило " + (currentTimeMillis() - start) + " ms");
/*Время заполнения списка составило 133 ms
Время заполнения двусвязанного списка составило 244 ms
Время время выбора 100000 элементов из списка составило 27 ms
Время время выбора 100000 элементов из двусвязанного списка составило 289956 ms*/

        Map<User, Integer> map = new HashMap<>();

        map.put(new User("John"), 10);
        map.put(new User("Tom"), 3);
        map.put(new User("Lisa"), 6);
        map.put(new User("Bob"), 12);
        map.put(new User("Kate"), 1);

        System.out.println(getPointsOfUser(map));

    }

    public static Set makeUnic(List list) {
        java.util.Set set = new HashSet<>(list);
        return set;
    }

    public static List getRandomElements(List list, int number) {
        List newList = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < number; i++) {
            newList.add(list.get(rnd.nextInt(list.size())));
        }
        return newList;
    }

    public static int getPointsOfUser(Map<User, Integer> map) {
        String string;
        int points = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя игрока");

        string =  scanner.nextLine();

        for (Map.Entry<User, Integer> pair : map.entrySet()) {
            String key = pair.getKey().getName();
            Integer pairValue = pair.getValue();

            if (key.equals(string)) {
                points = pairValue;
            }
        }

        return points;
    }
}