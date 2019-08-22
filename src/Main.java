
import java.util.Scanner;


public class Main {
    
    public static void main (String[] args ){
        
         Scanner scanner = new Scanner(System.in);
         System.out.println("İdman Programına Hoşgeldiniz");
         String idmanlar = "Geçerli Hareketler \n"
                            +"Burpee\n"
                            +"Pushup\n"
                            +"Situp\n"
                            +"Squat";
         System.out.println(idmanlar);
         System.out.println("Bir idman oluşturun.");
         System.out.println("Burpee sayısı : ");
         int burpee = scanner.nextInt();
         System.out.println("Pushup sayısı : ");
         int pushup = scanner.nextInt();
         System.out.println("Situp sayısı : ");
         int situp = scanner.nextInt();
         System.out.println("Squat sayısı : ");
         int squat = scanner.nextInt();
         
         scanner.nextLine();
         System.out.println("İdmanınız Başlıyor");
         Idman idman = new Idman(burpee, pushup, situp, squat);
         
         while (idman.idmanBittiMi() == false ){
             System.out.println("Hareket Türü ( Burpee , Pushup , Situp , Squat) : ");
             String tur = scanner.nextLine();
             System.out.println("Hareket Sayısı : ");
             int sayi = scanner.nextInt();
             scanner.nextLine();
             idman.hareketYap(tur, sayi);
             
         }
            
    }
    
}
