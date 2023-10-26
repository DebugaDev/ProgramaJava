public class Main {
    public static void main(String[] args) {

        Integer idadePedro = 21;
        Integer idadeJoao = 21;
        String nome = "Pedro";

        if (nome.contains("ed")) {
            System.out.println("Contem");
        }

        if (nome.contains("edx") || nome.startsWith("X") || idadeJoao.equals(idadePedro)) {
            System.out.println("Bem Vindo Pedro");
        }

        int dia = 10;

        switch (dia) {
            case 1:
                System.out.println("Segunda");
                break;
            case 2:
                System.out.println("Terça");
                break;
            case 3:
                System.out.println("Quarta");
                break;
            case 4:
                System.out.println("Quinta");
                break;
            case 5:
                System.out.println("Sexta");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dia da semana inválido");
        }

        String diaSemana = "Pedro";

        switch (diaSemana) {
            case "Segunda":
                System.out.println("1");
                break;
            case "Terça":
                System.out.println("2");
                break;
            case "Quarta":
                System.out.println("3");
                break;
            case "Quinta":
                System.out.println("4");
                break;
            case "Sexta":
                System.out.println("5");
                break;
            case "Sabado":
                System.out.println("6");
                break;
            case "Domingo":
                System.out.println("7");
                break;
            default:
                System.out.println("Dia da semana inválido");
        }

    }
}
