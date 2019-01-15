package Chapter04.Check;

public class Exercise03 {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 1; i <= 100; i++) {
            if ((i % 3) == 0) {
                total += i;
            }
        }
        System.out.println("3의 배수의 합 ==  " + total);
    }
}
