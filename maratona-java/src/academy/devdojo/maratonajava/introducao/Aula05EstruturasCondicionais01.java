package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 10;
        boolean isAutorizadoComprarBebida = idade >= 18;
        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcólica");
        }else{
            System.out.println("Não autorizado");
        }
        if (!isAutorizadoComprarBebida) {
            System.out.println("Não autorizado");
        }
        boolean c = false;
            System.out.println("Dentro de algo que nunca deve ser feito");
            if(c == true) {
        }

        System.out.println("Fora do IF");
    }
}