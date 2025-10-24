package academy.devdojo.maratonajava.introducao;

public class SwitchCase {
    public static void main(String[] args) {
        String fruta = "kiwi";
        switch (fruta) {
            case "maçã":
                System.out.println("A maça custa $2,19 o kg!");
                break;
            case "melancia":
                System.out.println("A melancia custa $1,00 o kg!");
                break;
            case "melão":
                System.out.println("A melão custa $4,99 o kg!");
                break;
            case "banana":
                System.out.println("A banana custa $3,59 o kg!");
                break;
            case "manga":
                System.out.println("A manga custa $4,19 o kg!");
                break;
            default:
                System.out.println("Não temos "+fruta+".");
                break;
        }
        System.out.println("Gostaria de mais alguma coisa?");
    }
}
