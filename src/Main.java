public class Main {
    public static void main(String[] args) {

        RandomNumber randomNumber = new RandomNumber();

        int randomNum = randomNumber.generateRandomNumber(1, 100);

        System.out.println("Bilangan acak antara 1 dan 100: " + randomNum);
    }
}
