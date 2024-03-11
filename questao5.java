import java.util.Scanner;

public class questao5 {
    public static String inverteString(String texto) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = texto.length() - 1; i >= 0; i--) {
            stringBuilder.append(texto.charAt(i));
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String texto = scanner.nextLine();
        scanner.close();

        System.out.println("String invertida: " + inverteString(texto));
    }
}
