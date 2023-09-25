import java.util.Scanner;

public class Elmas {
    public void calistir(){
        Scanner input = new Scanner(System.in);
        System.out.println("Elmas'ın büyüklüğünü tek olacak şekilde gir?");
        int x;
        x = input.nextInt();
        int n = x/2+1; // Desenin yarı yüksekliği (orta satır hariç)

        // Yukarıdaki yıldızların üst kısmını yazdır
        for (int i = 1; i <= n; i++) {
            // Boşlukları yazdır
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Yıldızları yazdır
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            // Bir sonraki satıra geç
            System.out.println();
        }

        // Alt kısmı yazdır (orta satır hariç)
        for (int i = n - 1; i >= 1; i--) {
            // Boşlukları yazdır
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Yıldızları yazdır
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            // Bir sonraki satıra geç
            System.out.println();
        }
}}
/*
---*---
--***--
-*****-
*******
-*****-
--***--
---*---
*/