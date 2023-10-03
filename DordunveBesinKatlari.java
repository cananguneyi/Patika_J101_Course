
//girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
import java.util.Scanner;

public class DordunveBesinKatlari {
    public void calistir() {

        Scanner input = new Scanner(System.in);
        int x;
        boolean y;
        System.out.print("Bir sayı girin:");
        x = input.nextInt();
        System.out.print(" DÖRDÜN KUVVETLERİ: ");
        for(int i=1;i<=x;i*=4){
                 System.out.print(" "+i);
            }
        System.out.print(" \n BEŞİN KUVVETLERİ: ");
        for(int i=1;i<=x;i*=5){
            System.out.print(" "+i);
        }
        }
    }

