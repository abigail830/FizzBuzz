import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void convert_return_1_when_input_1() {
        assertInputConversion("1", "1");
    }

    @Test
    void convert_return_Fizz_when_input_6() {
        assertInputConversion("6", "Fizz");
    }

    @Test
    void convert_return_Buzz_when_input_10() {
        assertInputConversion("10", "Buzz");
    }

    @Test
    void convert_return_FizzBuzz_when_input_15() {
        assertInputConversion("15", "FizzBuzz");
    }

    @Test
    void convert_return_Whizz_when_input_14() {
        assertInputConversion("14", "Whizz");
    }

    @Test
    void convert_return_FizzWhizz_when_input_21() {
        assertInputConversion("21", "FizzWhizz");
    }

    @Test
    void convert_return_BuzzWhizz_when_input_35() {
        assertInputConversion("35", "BuzzWhizz");
    }

    @Test
    void convert_return_FuzzBuzzWhizz_when_input_105() {
        assertInputConversion("105", "FizzBuzzWhizz");
    }

    private void assertInputConversion(String input, String expected) {
        String result = fizzBuzz.convert(input);
        assertThat(result).isEqualTo(expected);
    }
}
