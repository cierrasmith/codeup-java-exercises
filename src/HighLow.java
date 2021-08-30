public class HighLow {

    public static int getUserToGuessNum(){
        System.out.println("Let's guess the number. Pick a number between 1 and 100.");
        int usersGuessedNum = MethodsExercises.getInteger(1,100);
        return  usersGuessedNum;
    }

    public static void giveHint(int guessedNum, int actualNum){

        if (guessedNum > actualNum){
            System.out.println("Nope, go LOWER!");
        } else if (guessedNum < actualNum){
            System.out.println("Nope, go HIGHER!");
        }
    }

    public static void highLowGame() {

        int randomNumber = MethodsExercises.getRandomNumber(1,100);
        int usersLastGuess;
        int numberOfTries = 0;

        do {

            usersLastGuess = getUserToGuessNum();
            giveHint(usersLastGuess,randomNumber);
            numberOfTries++;

        } while (usersLastGuess != randomNumber);

        System.out.println("Hey you guessed right in " + numberOfTries + " tries!");

    }

    public static void main(String[] args) {

        highLowGame();

    }

}
