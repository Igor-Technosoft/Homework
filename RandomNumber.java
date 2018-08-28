public class RandomNumber {
    public static void main(String[] args) {
        double min = 0.0d;
        for(int i=0; i<500;i++) {
            double x = Math.random();
            min = Math.min(min,x);
            System.out.println(x);
        }
        System.out.println("The minimum is " + min);
    }
}
