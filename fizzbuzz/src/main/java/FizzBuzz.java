import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {
    public String say(int input) {

        if (input % 15 == 0) {
            return "FizzBuzz";
        } else if (input % 3 == 0) {
            return "Fizz";
        } else if (input % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(input);
    }
}
