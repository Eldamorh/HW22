import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Random random = new Random();
            return random.nextInt(10);
        };

        Stream.generate(supplier).map(i -> i = i*i*i).filter(i -> i > 100).limit(100).forEach(System.out::println);
    }
}
