package com.autobotes.streamAPI;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;


public class StreamApiLesson {
    public static void main(String[] args) {

        List<String> names = List.of("Anna", "Bob", "Alex", "Bella", "Andrew");

//        for (String name : names){
//            if (name.startsWith("A")){
//                System.out.println(name.toUpperCase());
//            }
//        }

        // Вытаскиваем имена которые начинаются на "A" b верхнего регистра

        List<String> result = names.stream()
                .filter(name -> name.startsWith("A"))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(result);

        // общую сумму выводит
        List<Integer> numbers = List.of(1 , 2 , 3, 4, 5, 6);
        int r1 = 0;
        for (int num : numbers){
            r1+=num;
        }
        System.out.println(r1);


        int totalSum = numbers.stream()// от открывает поток и берет доступ к элементам
                .mapToInt(num -> num) // большой Integer в маленький int
                .sum();                // получаем общую сумму чисел
        System.out.println(totalSum);

        int totalElements = (int) numbers.stream()
                      .count();         // посчитал сколько элементов (6)
        System.out.println(totalElements);

        // вытаскивает минимальное число
        numbers.stream()
                .min(Integer::compareTo)
                .ifPresent(System.out::println);

        //  Вывести тот элемент где длинна больше 3-х символов, самый первый вывести
        List<String> list = List.of("one", "two", "three", "Hello", "four", "five");
        list.stream()
                .filter(s -> s.length()>3)
                .findFirst()
                .ifPresent(System.out::println);

    }
}
