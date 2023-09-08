import java.util.Scanner;

public class Kitle {
    public void calistir() {
        /*Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

Formül
Kilo (kg) / Boy(m) * Boy(m)*/
        System.out.println("önce boyunu (metre cinsi) gir \n sonra kilonu (kilogram cinsi) gir\n" );
        Scanner input = new Scanner(System.in);
        double boy = input.nextDouble();
        double kilo = input.nextDouble();
        double index = kilo/(boy*boy);
        System.out.println("önce boyunu (metre cinsi) sonra kilonu (kilogram cinsi) gir \n"+index);
    }
}
