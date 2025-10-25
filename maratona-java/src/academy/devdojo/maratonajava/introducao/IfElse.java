package academy.devdojo.maratonajava.introducao;

public class IfElse {
    public static void main(String[] args) {
        String fruta = "melancia";

        if (fruta.equals("maçã")) {
            System.out.println("A maçã custa $2,19 o kg!");
        } else if (fruta.equals("melancia")) {
            System.out.println("A melancia custa $1,00 o kg!");
        } else if (fruta.equals("melão")) {
            System.out.println("O melão custa $4,99 o kg!");
        } else if (fruta.equals("banana")) {
            System.out.println("A banana custa $3,59 o kg!");
        } else if (fruta.equals("manga")) {
            System.out.println("A manga custa $4,19 o kg!");
        } else {
            System.out.println("Não temos " + fruta + ".");
        }

        System.out.println("Gostaria de mais alguma coisa?");
    }
}

