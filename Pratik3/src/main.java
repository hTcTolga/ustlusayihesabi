import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int n,k;
        int toplam =1;
        System.out.print("Üstü alınacak sayıyı giriniz: ");
        n=girdi.nextInt();
        System.out.print("Kuvveti giriniz: ");
        k=girdi.nextInt();
        for (int i = 1; i<=k; i++){
            toplam *= n;
        }
        System.out.print("İşleminizin sonucu: "+ toplam);
    }
}
