package itmo.java.basics.lesson9;

import src.itmo.java.basics.lesson9.User;

import java.util.*;

import static java.lang.System.currentTimeMillis;

public class Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        strings.add("abc");
        strings.add("def");
        strings.add("ghi");
        strings.add("def");
        strings.add("jkl");

        System.out.println(strings);
        System.out.println(makeUnic(strings));

        var numberOfElementsOfList = 1000000;
        var numberOfReceivedElementsOfList = 100000;

        long start = currentTimeMillis();

        List<Integer> millStrings = new ArrayList<>();
        for (int i = 0; i < numberOfElementsOfList; i++) {
            millStrings.add(i);
        }

        System.out.println("Время заполнения списка составило " + (currentTimeMillis() - start) + " ms");

        start = currentTimeMillis();

        List<Integer> millLinkedStrings = new LinkedList<>();
        for (int i = 0; i < numberOfElementsOfList; i++) {
            millLinkedStrings.add(i);
        }

        System.out.println("Время заполнения двусвязанного списка составило " + (currentTimeMillis() - start) + " ms");

        start = currentTimeMillis();
        getRandomElements(millStrings, numberOfReceivedElementsOfList);
        System.out.println("Время время выбора " + numberOfReceivedElementsOfList + " элементов из списка составило " + (currentTimeMillis() - start) + " ms");

        start = currentTimeMillis();
        getRandomElements(millLinkedStrings, numberOfReceivedElementsOfList);
        System.out.println("Время время выбора " + numberOfReceivedElementsOfList + " элементов из двусвязанного списка составило " + (currentTimeMillis() - start) + " ms");

        Map<User, Integer> map = new HashMap<>();

        map.put(new User("John"), 10);
        map.put(new User("Tom"), 3);
        map.put(new User("Lisa"), 6);
        map.put(new User("Bob"), 12);
        map.put(new User("Kate"), 1);

        getPointsOfUser(map);
    }

    public static Set<String> makeUnic(List<String> list) {
        Set<String> set = new HashSet<>(list);
        return set;
    }

    public static List<Integer> getRandomElements(List<Integer> list, int number) {
        List<Integer> newList = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < number; i++) {
            newList.add(list.get(rnd.nextInt(list.size())));
        }
        return newList;
    }

    public static void getPointsOfUser(Map<User, Integer> map) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя игрока");
        Integer points = map.get(new User(scanner.nextLine()));

        if (points != null) {
            System.out.println("У игрока " + points + " очков");
        } else {
            System.out.println("Такого игрока не существует");
        }
    }
}