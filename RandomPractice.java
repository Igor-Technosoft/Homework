import java.util.Random;
public class RandomPractice {
    public static void main(String[] args) {

        Random rand = new Random();
        int randomValue = rand.nextInt(100) + 1;
        String userName = "John";
        System.out.print(userName + " " + randomValue);

    }
}

