import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner wpisz = new Scanner(System.in);
        int h;
        String znak;
        System.out.print("Podaj z czego stworzyc choinke: ");
        znak = wpisz.next();
        System.out.println();
        System.out.print("Podaj wysokosc choinki: ");
        h = wpisz.nextInt();

        for (int i = 0; i <= h; i++) {
            System.out.println();
            for (int j = 0; j <= i; j++)
                System.out.print(znak);

        }
    }
}