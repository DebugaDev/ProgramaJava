public class Main {
    public static void main(String[] args) {
        Byte b = Byte.valueOf((byte) 1);
        Short s = Short.valueOf((short) 2);
        Integer x = Integer.valueOf(3);
        Long l = Long.valueOf(4);

        Float f = Float.valueOf((float) 2.6);
        Double d = Double.valueOf(3.7);

        Boolean bo = Boolean.valueOf(true);
        Character c = Character.valueOf('D');

        float ii = x.floatValue();
        System.out.println(ii);

        int fi = f.intValue();
        System.out.println(fi);

        int i1 = 1000;
        int i2 = 2000;

        if (i1 == i2) {
            System.out.println("Iguais");
        } else {
            System.out.println("Diferentes");
        }

        Integer int1 = Integer.valueOf(1000);
        Integer int2 = Integer.valueOf(1000);

        if (int1.equals(int2)) {
            System.out.println("Iguais");
        } else {
            System.out.println("Diferentes");
        }

        Integer int3 = 2000;
        int i3 = int3;

        System.out.println(int3 + " " + i3);

        recebeInt(int3);
        recebeInteger(i3);
    }

    public static void recebeInt(int i) {
        System.out.println("int: " + i);
    }

    public static void recebeInteger(Integer i) {
        System.out.println("Integer: " + i);
    }
}
