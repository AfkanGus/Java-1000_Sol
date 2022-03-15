package src.stream;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class CollectorClass {
    public static List<Integer> collect(List<Integer> list) {
        Supplier<List<Integer>> supplier = LinkedList::new;
        BiConsumer<List<Integer>, Integer> biConsumer = List::add;
        BinaryOperator<List<Integer>> operator = (left, right) -> {
            left.addAll(right);
            return left;
        };
        return list.stream()
                .collect(Collector.of(supplier, biConsumer, operator));
    }

    public static void main(String[] args) {
        Supplier<Deque<Integer>> supplier = LinkedList::new;
        BiConsumer<Deque<Integer>, Integer> biConsumer = Deque::addFirst;
        BinaryOperator<Deque<Integer>> operator = (left, right) -> {
            right.forEach(left::addFirst);
            return left;
        };
        Deque<Integer> result = List.of(1, 2, 3).stream()
                .collect(Collector.of(
                        supplier,
                        biConsumer,
                        operator)
                );
        result.forEach(System.out::println);
    }
}
