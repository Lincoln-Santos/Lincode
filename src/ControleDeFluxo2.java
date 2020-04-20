

public class ControleDeFluxo2 {
    public static void main(String[] args) {
        int idade = 15;
        String status;

        status = idade < 15 ? "infantil" : idade>= 15 && idade <18 ? "juvenil" : "adulto";
        System.out.println(status);
    }
}
