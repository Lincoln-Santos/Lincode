public class ExercioControleFluxo3 {
    public static void main(String[] args) {
        // imprima todos os numeros pares de 0 a 100000
        int valor = 1000000;
        for(int i=0 ; i<=valor; i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}
