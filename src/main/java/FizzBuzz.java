class FizzBuzz {
    String say(int input) {
        if(input % 3 == 0 && input % 5 == 0){
            return "FizzBuzz";
        }

        if(input % 3 == 0 && input % 7 == 0){
            return "FizzWhizz";
        }

        if(input % 5 == 0 && input % 7 == 0){
            return "BuzzWhizz";
        }

        if(input % 3 == 0){
            return "Fizz";
        }

        if(input % 5 == 0){
            return "Buzz";
        }

        if(input % 7 == 0){
            return "Whizz";
        }

        return String.valueOf(input);
    }
}
