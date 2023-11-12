import java.util.Scanner;

public class EBOB_EKOK {
    public void calistir() {
        Scanner input = new Scanner(System.in);
        System.out.println("n1 sayısını girin:");
        int n1 = input.nextInt();
        System.out.println("n2 sayısını girin:");
        int n2 = input.nextInt();
        int little;
        int EBOB=1;
        int EKOK=1;
        if(n1<=n2){
            little=n1;
        }
        else little=n2;
        int i=1;

        while(i<little){i++;
            if(n1%i==0 && (n2%i==0) ){
                EBOB=i;
            }}
        System.out.println("EBOB:"+EBOB);

        EKOK= (n1*n2)/EBOB;
        System.out.println("EKOK:"+EKOK);

    }
}
