package Chapter04.Check;

import java.util.ArrayList;

public class Exercise04 {
    public static void main(String[] args) {
        while (true) {
            ArrayList<Integer> dice = new ArrayList<>();

            dice.add((int) (Math.random() * 10) % 6 + 1);
            dice.add((int) (Math.random() * 10) % 6 + 1);

            System.out.println("( " + dice.get(0) + ", " + dice.get(1) + " )");
            if (dice.get(0)+dice.get(1) == 5) break;
        }
    }
}
