import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

class RandomNumberForFizzBuzzTest {
    private FizzBuzz fizzBuzz;

    @BeforeEach
    private void setup() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void should_fit_for_every_number_in_1000_when_can_be_divided_by_3() {
        int randomNumberCanBeDividedBy3 = getRandomNumberCanBeDividedBy(3);
        assertThat(fizzBuzz.say(randomNumberCanBeDividedBy3)).isEqualTo("Fizz");
    }

    @Test
    void should_fit_for_every_number_in_1000_when_can_be_divided_by_5() {
        int randomNumberCanBeDividedBy5 = getRandomNumberCanBeDividedBy(5);
        assertThat(fizzBuzz.say(randomNumberCanBeDividedBy5)).isEqualTo("Buzz");
    }

    @Test
    void should_fit_for_every_number_in_1000_when_can_be_divided_by_7() {
        int randomNumberCanBeDividedBy7 = getRandomNumberCanBeDividedBy(7);
        assertThat(fizzBuzz.say(randomNumberCanBeDividedBy7)).isEqualTo("Whizz");
    }

    @Test
    void should_fit_for_every_number_in_1000_when_can_be_divided_by_3_and_5() {
        int randomNumberCanBeDividedBy7 = getRandomNumberCanBeDividedBy(3, 5);
        assertThat(fizzBuzz.say(randomNumberCanBeDividedBy7)).isEqualTo("FizzBuzz");
    }

    @Test
    void should_fit_for_every_number_in_1000_when_can_be_divided_by_3_and_7() {
        int randomNumberCanBeDividedBy7 = getRandomNumberCanBeDividedBy(3, 7);
        assertThat(fizzBuzz.say(randomNumberCanBeDividedBy7)).isEqualTo("FizzWhizz");
    }

    @Test
    void should_fit_for_every_number_in_1000_when_can_be_divided_by_5_and_7() {
        int randomNumberCanBeDividedBy7 = getRandomNumberCanBeDividedBy(5, 7);
        assertThat(fizzBuzz.say(randomNumberCanBeDividedBy7)).isEqualTo("BuzzWhizz");
    }

    @Test
    void should_fit_for_every_number_in_1000_when_can_be_divided_by_3_and_5_and_7() {
        int randomNumberCanBeDividedBy7 = getRandomNumberCanBeDividedBy(3, 5, 7);
        assertThat(fizzBuzz.say(randomNumberCanBeDividedBy7)).isEqualTo("FizzBuzzWhizz");
    }

    private int getRandomNumberCanBeDividedBy(Integer... numbersCanBeDivided){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3, 5, 7));
        ArrayList<Integer> numberDividedList = new ArrayList<>(Arrays.asList(numbersCanBeDivided));
        list.removeAll(numberDividedList);

        return prepareExpectedResult(list, numbersCanBeDivided);
    }

    private int prepareExpectedResult(ArrayList<Integer> list, Integer[] numbersCanBeDivided) {
        Integer randRawData = new Random().nextInt(1000);
        for (Integer num : list) randRawData = randRawData % num;
        for(Integer num : numbersCanBeDivided) randRawData *= num;

        if(randRawData == 0){
            return prepareExpectedResult(list, numbersCanBeDivided);
        }else{
            return randRawData;
        }
    }
}
