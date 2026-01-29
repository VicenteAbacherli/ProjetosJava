import java.util.Scanner;
import meuPacote.validaCPF;

public class Exemplo {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        String CPF;

        System.out.print("Informe um CPF (somente números): ");
        CPF = ler.next();

        System.out.print("\nResultado; ");
        if (validaCPF.isCPF(CPF)) {
            System.out.println(validaCPF.imprimeCPF(CPF));
        } else {
            System.out.println("Erro, CPF inválido!");
        }
    }
}
