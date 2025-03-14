import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(-5, 6, 9, 0, -10, 15, 43, 86, -20, 11, 3, -1);

        System.out.println("\nПроверка с помощью предиката через отдельных класс");
        NumberPredicate predicate = new NumberPredicate();
        for (Integer number : numbers) {
            if (predicate.test(number)) {
                System.out.println(number);
            }
        }

        System.out.println("\nПроверка с помощью предиката через анонимную функцию");
        numbers
                .stream()
                .filter(predicate)
                .forEach(System.out::println);
    }
}
