import java.util.function.Predicate;

public class NumberPredicate implements Predicate<Integer> {
    @Override
    public boolean test(Integer numbers) {
        return numbers < 0;

    }
}
