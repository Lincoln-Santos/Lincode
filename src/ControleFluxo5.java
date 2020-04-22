public class ControleFluxo5 {
    public static void main(String[] args) {
        //dado um valor de um carro descubra em quantas vezes e pode ser pacelado
        // porem as parcelas não podem ser menores do que 1000

        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela >= 1000) {
                System.out.println("Parcela " + parcela + " R$" + valorParcela);
            }
            System.out.println("");
        }
    }
}