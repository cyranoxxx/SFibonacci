import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("Bir Sayý giriniz?");

        int sayi = scan.nextInt();

        int a=0;
        int b=1;
        int c=0;
        int i=1;

        System.out.print(a+", "+b);
        while(c<sayi) {
        	a=b;
            b=c;
            c=a+b;
            System.out.print(", "+c);
            i++;
        }
    }

}
