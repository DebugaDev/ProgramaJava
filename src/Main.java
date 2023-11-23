public class Main {
    public static void main(String[] args) {

        int[] inteiros = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("Inicio FOREACH");

        for(int valor = 50; valor >= 0; valor--) {
            System.out.println("Valor: " + valor);

            if (valor == 10) {
                break;
            }
        }

        for (int inteiro : inteiros) {
            System.out.println("Int: " + inteiro);
        }

        for (int i = 0; i < inteiros.length; i++) {
            System.out.println("Int: " + inteiros[i]);
        }

        System.out.println("Fim FOREACH");
    }
}
