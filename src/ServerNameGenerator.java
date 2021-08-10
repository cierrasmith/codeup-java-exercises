import java.util.Random;

public class ServerNameGenerator {

    public static String getRandom(String[] randomWord) {
        int rnd = new Random().nextInt(randomWord.length);
        return randomWord[rnd];
    }


    public static void main(String[] args) {

        String[] withAdjectives = {"adorable", "angry", "brave", "clever", "clean", "dull", "friendly", "good", "hungry", "healthy"};
        String[] withNouns = {"animal", "alarm", "goose", "duck", "sister", "brother", "tiger", "bread", "cat", "dog"};

        System.out.println("Here is your server name:");
        System.out.println(getRandom(withAdjectives) + "-" + getRandom(withNouns));
    }
}
