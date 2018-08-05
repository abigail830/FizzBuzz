import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FizzBuzzTest {
    @Test
    void should_return_1_when_input_is_1() {
       FizzBuzz fizzBuzz = new FizzBuzz();
       assertThat(fizzBuzz.say(1)).isEqualTo("1");
    }
}
