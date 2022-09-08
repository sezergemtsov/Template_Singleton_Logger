package ru.netology;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        logger.log("Просим пользователя ввести данные для списка");
        System.out.println("Введите размер списка");
        int size = scanner.nextInt();
        System.out.println("Введите верхнее значение для элементов списка");
        int maxValue = scanner.nextInt();
        logger.log("Создается список...");
        for (int i = 0; i < size; i++) {
            double d = Math.random()*maxValue;
            list.add((int)d);
        }
        System.out.println("Создан случайный список: " + printList(list));
        logger.log("Просим пользователя ввести данные для фильтрации");
        System.out.println("Введите нижнюю границу фильтра");
        int f = scanner.nextInt();
        Filter filter = new Filter(f);
        List<Integer> filteredList = filter.filterOut(list);
        System.out.println("Отфильтрованный список: " + printList(filteredList));
        logger.log("завершаем программу");
    }

    public static String printList(List<Integer> list) {
        StringBuilder stb = new StringBuilder();
        stb.append(" ");
        list.stream()
                .forEach(x-> stb.append(x.toString()+ " "));
        return stb.toString();
    }
}