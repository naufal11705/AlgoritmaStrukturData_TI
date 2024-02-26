import java.util.Scanner;

public class Perulangan {

    public static void main(String[] args) {
        Scanner sc04 = new Scanner(System.in);

        System.out.print("Masukkan NIM: ");
        String NIM = sc04.next();

        int n = Integer.parseInt(NIM.substring(NIM.length() - 2));

        if (n < 10) {
            n += 10;
        }

        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            }

            if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
        }

        sc04.close();
        
    }
}