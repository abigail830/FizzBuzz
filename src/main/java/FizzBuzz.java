public class FizzBuzz {
    public String convert(String input) {

        String result = "";

        int inputNumber = Integer.parseInt(input);

        if (inputNumber % 3 == 0) {
            result += "Fizz";
        }

        if (inputNumber % 5 == 0) {
            result += "Buzz";
        }

        if (inputNumber % 7 == 0) {
            result += "Whizz";
        }

        return result.isEmpty() ? input : result;
    }
}
