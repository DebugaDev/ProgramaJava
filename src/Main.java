public class Main {
    public static void main(String[] args) {
        System.out.printf("byte: min: %d - max: %d\n", Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("short: min: %d - max: %d\n", Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("int: min: %d - max: %d\n", Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("long: min: %d - max: %d\n", Long.MIN_VALUE, Long.MAX_VALUE);
        System.out.printf("float: min: %f - max: %f\n", Float.MIN_VALUE, Float.MAX_VALUE);
        System.out.printf("double: min: %f - max: %f\n", Double.MIN_VALUE, Double.MAX_VALUE);

        Pessoa pessoa = new Pessoa();
        pessoa.idade = 39;
        pessoa.altura = 1.86F;

        int idadeRetornada = pessoa.informarIdade();
        float alturaRetornada = pessoa.informarAltura();

        System.out.println("Idade: " + pessoa.informarIdade());
        System.out.println("Altura: " + pessoa.informarAltura());

        pessoa.andar();
    }
}
