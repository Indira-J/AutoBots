package com.autobotes.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {

        List<List<String>> nestedList = List.of(
                List.of("A", "B"),
                List.of("C", "D"),
                List.of("E")
        );
        System.out.println(nestedList);

        List<String> nonNestedList = new ArrayList<>();
        for (List<String> list: nestedList){
            nonNestedList.addAll(list);
        }
        System.out.println(nonNestedList);
        System.out.println("______________________________");

        List<String> nonNestedListWishStream = nestedList.stream()
                .flatMap(List::stream).collect(Collectors.toList());
        System.out.println(nonNestedListWishStream);

        /*
        map:Этот метод применяется к каждому элементу потока и возвращает новый элемент.
         Если у вас есть поток из чисел, и вы хотите умножить каждый элемент на 2
         map создаст новый поток, содержащий удвоенные значения исходного потока
        при этом размер результирующего потока будет равен размеру исходного. 
        flatMap:Этот метод, помимо преобразования, также "сглаживает" результаты.
         Если вы хотите преобразовать каждый элемент в другой поток и затем объединить все эти потоки в один
         flatMap вам подходит. Например, если у вас есть поток списков чисел
         flatMap может объединить все числа из всех списков в один плоский поток.
         */

    }
}
