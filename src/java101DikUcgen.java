import java.util.Scanner;

public class java101DikUcgen {
    public static void main(String[] args) {
        int a, b, c;
        double u, ucgenincevresi ;

        Scanner input =new Scanner(System.in);
        System.out.print("1.kenarı giriniz:");
        a = input.nextInt();
        System.out.print("2.kenarı giriniz:");
        b = input.nextInt();
        System.out.print("3.kenarı giriniz:");
        c = input.nextInt();
        u = (a+b+c)/2;
        ucgenincevresi = 2*u;
        System.out.println("Üçgenin Çevresi :" + ucgenincevresi ) ;

        double alan =Math.sqrt(u* (ucgenincevresi -a) * (ucgenincevresi - b) *(ucgenincevresi -c));
        System.out.print("Alan :" + alan );
    }
}
