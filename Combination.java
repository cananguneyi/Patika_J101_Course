import java.util.Scanner;
//C(n,r) = n! / (r! * (n-r)!)
public class Combination {
    public void calistir() {
        Scanner input = new Scanner(System.in);
        int n,r;
        int last;
        int totaln=1;
        int totalr=1;
        int totalnr=1;
        System.out.println("Kombinasyon işlemi için C(n,r)'deki n ve r değerlerini sırasıyla girin: ");
        n = input.nextInt();
        r = input.nextInt();

        for(int i=1;i<=n;i++)
        {
            totaln=totaln * i;
        }

        for(int i=1;i<=r;i++)
        {
            totalr=totalr* i;
        }

        for(int i=1;i<=n-r;i++) {
            totalnr = totalnr * i;
        }
        last= (totaln / (totalr * totalnr));
        System.out.print("Kombinasyon " +n + "'nin" + r + " lisi = " + last);


    }
}
