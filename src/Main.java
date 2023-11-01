public class Main {
    public static void main(String[] args) {

        /*
        ++ -> Pré-Fixado e o Pós-fixado
        -- -> Pré-Fixado e o Pós-fixado
        ! -> Operador complementar (boolean)
        * */

        int idade = 0;

        idade = idade + 1;

        System.out.println("Incremento Idade Pré-Fixado: " + ++idade);
        System.out.println("Incremento Idade: " + idade++);
        System.out.println("Incremento Idade Pós-Fixado: " + idade);
        System.out.println("----------------------------------------");
        System.out.println("Decremento Idade Pré-Fixado: " + --idade);
        System.out.println("Decremento Idade: " + idade--);
        System.out.println("Decremento Idade Pós-Fixado: " + idade);
        System.out.println("----------------------------------------");

        boolean condicao = false;
        System.out.println("Operador complementar: " + !condicao);
        System.out.println("----------------------------------------");

        idade += 3;
        System.out.println("Soma: " + idade);

        idade -= 2;
        System.out.println("Subtração: " + idade);

        idade *= 5;
        System.out.println("Multiplicação: " + idade);

        idade /= 2;
        System.out.println("Divisão: " + idade);
    }
}
