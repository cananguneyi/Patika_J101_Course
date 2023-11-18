import java.util.Scanner;

public class Ters_ucgen {
    public void calistir() {
        Scanner input = new Scanner(System.in);
        System.out.println("basamak sayısını girin:");
        int x = input.nextInt();

        for(int y=x;y>=1;y--){

            System.out.println(" ");// Her satır atlatır

            for (int k = 1; k <= 2 * y - 1; k++) {  // Her satır için yıldızları yazdır
                System.out.print("*");
            }
        }

    }
}
