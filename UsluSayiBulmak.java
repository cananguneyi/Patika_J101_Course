import java.util.Scanner;

public class UsluSayiBulmak {
    public void calistir() {
        Scanner input = new Scanner(System.in);
        int total=1;
        System.out.print("tabandaki sayıyı girin :");
        int x = input.nextInt();
        System.out.print("üsteki sayıyı girin :");
        int y = input.nextInt();
        for(int i=1;i<=y;i++){
            total*=x;
        }
        System.out.print("Sonuç: "+total);






    }
}
