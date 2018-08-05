class FizzBuzz {
    String say(int input) {
        String result = "";

        if(input % 3 == 0){
            result += "Fizz";
        }

        if(input % 5 == 0){
            result += "Buzz";
        }

        if(input % 7 == 0){
            result += "Whizz";
        }

        return result.equals("") ? String.valueOf(input) : result;
    }
}