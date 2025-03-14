import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(-5, 6, 9, 0, -10, 15, 43, 86, -20, 11, 3, -1);

        System.out.println("\nПроверим есть ли в списке отрицательные числа с помощью предиката через отдельный класс");
        NumberPredicate predicate = new NumberPredicate();
        for (Integer number : numbers) {
            if (predicate.test(number)) {
                System.out.println(number);
            }
        }
//      тоже самое через stream
        System.out.println("\nПроверим есть ли в списке отрицательные числа с помощью Stream + Predicate");
        numbers
                .stream()
                .filter(predicate)
                .forEach(System.out::println);

        System.out.println("\nПроверим есть ли в списке числа в диапазоне от - до через анонимную функцию");
        numbers
                .stream()
                .filter(number -> number >= -5 && number <= 15)
                .forEach(System.out::println);
    }
}
