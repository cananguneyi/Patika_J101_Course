import java.util.Scanner;

public class TotalBasNumber {
    public void calistir() {

            Scanner input = new Scanner(System.in);
            System.out.println("sayı girin:");
            int x = input.nextInt();
            int total=0;
        while (x != 0) {
            total+=x %10; //son basamağı ekler.
            x/=10; //sayıdan son sayıyı sildi.
        }
        System.out.println(total);

    }
}
