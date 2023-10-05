import java.util.Scanner;

public class RecursiveAsal {
    private void isAsal(int x) {
        int number = 0;
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                number += 1;

            }
        }
        if (number >= 1) {
            System.out.print("Asal sayı değildir");
        } else {
            System.out.print("Asal sayıdır");
        }
    }

    private boolean isAsal2(int x) {
        int i = 1;
        while (true) {
            i++;
            if (x % i == 0 && x != i) return false;
            else
                return true;
        }
    }
    private boolean isAsalRecur(int number, int counter) {
        boolean result;
        if(number == counter) return true;
        if (number % counter == 0) return false;
        else {
            result =isAsalRecur(number, ++counter);
            return  result;
        }
    }

    public void run() {
        Scanner input = new Scanner(System.in);
        System.out.print("sayıyı gir :");
        int x = input.nextInt();
        //isAsal(x);
        if (isAsalRecur(x, 2))
            System.out.print("Asal sayıdır");
        else System.out.print("Asal sayı değildir");
    }

}
