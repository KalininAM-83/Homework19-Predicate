import java.util.function.Predicate;

public class NumberPredicate implements Predicate<Integer> {
    @Override
    public boolean test(Integer numbers) {
        //проверка числа на отрицательное значение
        if (numbers < 0) {
            return true;
        }
        //проверка числа, находится ли оно в диапазоне от - до
        return numbers >= -5 && numbers <= 15;

    }
}
