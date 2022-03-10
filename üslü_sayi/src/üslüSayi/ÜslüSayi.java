package üslüSayi;
import java.util.Scanner;
public class ÜslüSayi {

    public static void main(String[]args){
        int a,b;
        Scanner input=new Scanner(System.in);
        System.out.println("Üssü alınacak sayi:");
        a= input.nextInt();
        System.out.println("Üs olacak sayi:");
        b= input.nextInt();
        int sonuc=1;

            for (int i=1;i<=b;i++){
                sonuc*=a;
            }

        System.out.println("sonuç:"+sonuc);

    }




    }

