public class Main {
    public static void main(String[] args) {

        int valor = 50;

        System.out.println("Inicio While");

        while(valor >= 0) {
            System.out.println("Valor: " + valor);

            valor--;
        }

        do {
            System.out.println("Valor: " + valor);

            valor--;
        } while(valor >= 0);

        System.out.println("Fim While");
    }
}
