import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n;

        System.out.println("Digite um número: ");
        n = scan.nextInt();

        for(int i = 1; i <= 10; i++) {
            System.out.println("Tabuada do " + i + " = " + (n*i));
        }
    }
}
