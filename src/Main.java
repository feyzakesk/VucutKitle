import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Kullanıcıdan boy ve kilo değerlerini alıp bir değere ata
        //Formül = kilo(kg) / Boy(m) * Boy(m)

        double boy, kilo ,vucutKitleİndex;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : " );
        boy = input.nextDouble();
        System.out.print(("Lütfen kilonuzu giriniz: "));
        kilo = input.nextDouble();

        vucutKitleİndex = kilo /(boy * boy);
        System.out.println("Vücut kitle endeksiniz : " + vucutKitleİndex);


    }
}
