
import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Aracınız kilometrede kaç kuruş yakıyor? ");
        double kuruş = scanner.nextDouble();
        
        System.out.print("Aracınızla kaç kilometre gittiniz? ");
        int km = scanner.nextInt();
        
        System.out.println("Toplam ödemeniz gereken tutar: " + (kuruş * km) + " tl'dir... ");
        
    }
}
