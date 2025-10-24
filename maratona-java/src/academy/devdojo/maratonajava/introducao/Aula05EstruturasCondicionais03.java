package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // doação de 500 reais, mas só posso se meu salario for maior quei 5000
        double salario = 5000;
        //(Ccondicao) ? verdadeiro : falso
        String resultado = salario > 5000 ? "Eu vou doar 500" : "Ainda não tenho condições, mas vou ter!";
        System.out.println(resultado);
    }
}
