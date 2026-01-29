import java.util.Scanner;

public class CPF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o CPF (com ou sem pontos/traço): ");
        String cpf = sc.nextLine().replaceAll("\\D", ""); // remove tudo que não é número

        if (isValidCPF(cpf)) {
            System.out.println("✅ CPF válido!");
        } else {
            System.out.println("❌ CPF inválido!");
        }

        sc.close();
    }

    // Metodo que valida o CPF
    public static boolean isValidCPF(String cpf) {
        if (cpf.length() != 11) return false; // precisa ter 11 dígitos

        // rejeita CPFs com todos os números iguais (ex: 11111111111)
        if (cpf.chars().allMatch(c -> c == cpf.charAt(0))) return false;

        try {
            int soma = 0;
            // calcula o primeiro dígito verificador
            for (int i = 0; i < 9; i++) {
                soma += (cpf.charAt(i) - '0') * (10 - i);
            }
            int resto = soma % 11;
            int digito1 = (resto < 2) ? 0 : 11 - resto;

            soma = 0;
            // calcula o segundo dígito verificador
            for (int i = 0; i < 10; i++) {
                soma += (cpf.charAt(i) - '0') * (11 - i);
            }
            resto = soma % 11;
            int digito2 = (resto < 2) ? 0 : 11 - resto;

            // confere se os dígitos calculados são iguais aos informados
            return digito1 == (cpf.charAt(9) - '0') && digito2 == (cpf.charAt(10) - '0');
        } catch (Exception e) {
            return false;
        }
    }
}
