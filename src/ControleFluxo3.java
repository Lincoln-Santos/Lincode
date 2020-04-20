public class ControleFluxo3 {
    public static void main(String[] args) {
        byte dia = 5 ;
        // char, int, byte, short, enum e String
        switch (dia) {
            case 1 :
                System.out.println("domingo");
            case 2 :
                System.out.println("segunda");
            case 3 :
                System.out.println("terça");
            case 4 :
                System.out.println("quarta");
            case 5 :
                System.out.println("quinta");
                break;
            case 6 :
                System.out.println("sexta");
            case 7 :
                System.out.println("sábado");
        }
        String sexo = "FF";
        switch (sexo){
            case "F":
            System.out.println("feminino"); break;
            case "M":
                System.out.println("masculino");
                break;
            default:
                System.out.println("opção invalida");

        }
    }
}
