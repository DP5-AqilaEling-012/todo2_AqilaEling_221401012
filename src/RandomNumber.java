import java.util.Random;

public class RandomNumber {
    private Random random;

    public RandomNumber() {
        random = new Random();
    }

    public int generateRandomNumber(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }
}
