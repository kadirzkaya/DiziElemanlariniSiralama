import java.util.Arrays;
import java.util.Scanner;

public class DiziElemanlariniSiralama {
    public static void main(String[] args) {
        int size;
        int[] siralanacakDizi;
        Scanner sc=new Scanner(System.in);

        System.out.print("Dizinin boyutu n : ");
        size=sc.nextInt();
        siralanacakDizi=new int[size];

        System.out.println("Dizinin elemanlarını giriniz : ");
        for (int i=0;i<size;i++){
            System.out.print((i+1)+". Elemanı : ");
            siralanacakDizi[i]=sc.nextInt();
        }

        Arrays.sort(siralanacakDizi);
        System.out.print("Sıralama : ");
        for (int i:siralanacakDizi){
            System.out.print(i+" ");
        }
    }
}
