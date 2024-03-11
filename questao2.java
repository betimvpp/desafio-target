import java.util.Scanner;

public class questao2 {
    public static boolean verificaFibonacci(int numero) {
        int a = 0;
        int b = 1;
        while (a <= numero) {
            if (a == numero) {
                return true;
            }
            int temp = b;
            b = a + b;
            a = temp;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        scanner.close();

        if (verificaFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }
    }
}
