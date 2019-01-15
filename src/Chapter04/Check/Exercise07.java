package Chapter04.Check;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        boolean run = true;
        int balance = 0;

        Scanner sc = new Scanner(System.in);

        while (run) {
            System.out.println("------------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고| 4. 종료");
            System.out.println("------------------------------------");
            System.out.print("선택> ");

            int flag = sc.nextInt();

            switch (flag) {
                case 1:
                    System.out.print("예금액> ");
                    int inValue = sc.nextInt();
                    if (inValue < 0) System.out.println("0원 미만은 입금할 수 없습니다.");
                    else balance += inValue;
                    break;
                case 2:
                    System.out.print("출금액> ");
                    int outValue = sc.nextInt();
                    if (outValue > balance) System.out.println("잔고 이상의 금액입니다.");
                    else if (outValue < 0) System.out.println("0원 미만은 출금할 수 없습니다.");
                    else balance -= outValue;
                    break;
                case 3:
                    System.out.println("잔고> " + balance);
                    break;
                case 4:
                    run = false;
                    break;
                default:
                    continue;
            }
            System.out.println();
        }
        System.out.println("Good Bye.");
    }
}
