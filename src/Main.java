public class Main {
    public static void main(String[] args) {

        /*
        == Iguais;
        != Diferente;
        >  Maior;
        >= Maior ou Igual;
        <  Menor;
        <= Menor ou Igual;
        */

        boolean condicao = 1 <= 1;
        int idade = 16;

        if (idade >= 65) {
            System.out.println("Idoso");
        } else if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
    }
}
