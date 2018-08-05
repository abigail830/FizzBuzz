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

    @Test
    void should_return_buzz_when_input_is_5() {
        assertThat(fizzBuzz.say(5)).isEqualTo("Buzz");
    }

    @Test
    void should_return_fizz_buzz_when_input_is_3_time_5() {
        assertThat(fizzBuzz.say(3 * 5)).isEqualTo("FizzBuzz");
    }

    @Test
    void should_return_whizz_when_input_is_7() {
        assertThat(fizzBuzz.say(7)).isEqualTo("Whizz");
    }

    @Test
    void should_return_fizz_whizz_when_input_is_3_times_7() {
        assertThat(fizzBuzz.say(3 * 7)).isEqualTo("FizzWhizz");
    }

    @Test
    void should_return_buzz_whizz_when_input_is_5_times_7() {
        assertThat(fizzBuzz.say(5 * 7)).isEqualTo("BuzzWhizz");
    }

    @Test
    void should_return_fizz_buzz_whizz_when_input_is_3_times_5_times_7() {
       assertThat(fizzBuzz.say(3 * 5 * 7)).isEqualTo("FizzBuzzWhizz");
    }
}
