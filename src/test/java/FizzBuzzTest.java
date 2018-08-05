import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    private void setup() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void should_return_1_when_input_is_1() {
        assertThat(fizzBuzz.say(1)).isEqualTo("1");
    }

    @Test
    void should_return_fizz_when_input_is_3() {
        assertThat(fizzBuzz.say(3)).isEqualTo("Fizz");
    }

    @Test
    void should_return_fizz_when_input_is_6() {
        assertThat(fizzBuzz.say(6)).isEqualTo("Fizz");
    }
}
