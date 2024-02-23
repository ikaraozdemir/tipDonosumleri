import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenleri tanımla.
        int Num1;
        double Num2;
        //Kullanıcıdan sayıyı al.
        Scanner input = new Scanner(System.in);
        System.out.print("Bir tam sayı giriniz :");
        Num1 = input.nextInt();
        System.out.print("Bir ondalıklı sayı giriniz :");
        Num2 = input.nextDouble();
        //İlk sayıyı double, ikinci sayıyı integer olarak ekrana bas.
        double convNum1 = Num1;
        int convNum2 = (int) Num2;
        System.out.println(convNum1);
        System.out.print(convNum2);
    }
}