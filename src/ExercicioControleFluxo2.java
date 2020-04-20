import javax.swing.*;
import java.sql.SQLOutput;

public class ExercicioControleFluxo2 {
    public static void main(String[] args) {
        // crie um exercicio que dado um valor de 1 a 7
        // considerando 1 domingo se é dia util ou final de semana

        byte dia = 8;

        switch (dia) {
            case 1:
            case 7:
                System.out.println("fds");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("dia util");
                break;
            default:
                System.out.println("opção invalida");

        }
    }
}
