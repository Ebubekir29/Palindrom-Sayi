import java.util.Scanner;

public class Main {
    static boolean isPalindrom()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi giriniz : ");
        int sayi = scan.nextInt();
        int gecici=sayi,geciciSayi=0,sonSayi,i=0;
        while (gecici!=0)
        {
            sonSayi = gecici % 10;
            geciciSayi = (geciciSayi * 10)+sonSayi;
            gecici = gecici / 10;
        }
        if(sayi == geciciSayi)
        return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(isPalindrom());
    }
}
