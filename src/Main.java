public class Main {
    public static void main(String[] args) {
        /*
        String canal = "Canal";
        String canal2 = "DebugaDev";

        String newCanal = new String("Debugadev");

        System.out.println(canal);
        System.out.println(newCanal);

        if (canal == canal2) {
            System.out.println("Iguais");
        }

        if (canal.equals(canal2)) {
            System.out.println("Iguais com equals");
        }

        if (canal.equalsIgnoreCase(newCanal)) {
            System.out.println("Iguais com equals newEquals");
        }

        String concatStrings = canal + " " + canal2;

        System.out.println(concatStrings);

        String concatMethodStrings = canal.concat(canal2);

        System.out.println(concatMethodStrings);

        System.out.println(canal);
         */

        int numero = 10;
        boolean condicao = true;

        String numeroValueOf =  String.valueOf(numero);
        String condicaoValueOf =  String.valueOf(condicao);
        String canal = "DebugaDev";
        String canalTrim = " Debuga Dev ";
        String canalEmpty = "";

        System.out.println(numeroValueOf);
        System.out.println(condicaoValueOf);
        System.out.println(condicaoValueOf.length());
        System.out.println(condicaoValueOf.charAt(2));
        System.out.println(canal.indexOf("D", 1));
        System.out.println(canal.lastIndexOf("D", 5));
        System.out.println(canal.substring(5));
        System.out.println(canal.substring(5, 7));
        System.out.println(canal.toUpperCase());
        System.out.println(canal.toLowerCase());
        System.out.println(canalTrim.trim());
        System.out.println(canalEmpty.isEmpty());
        System.out.println(canal.startsWith("Debi"));
        System.out.println(canal.endsWith("tev"));
        System.out.println(canal.replace("De", "Ra"));
        System.out.println(canal.replaceAll("De[b,v]", "Rai"));
    }
}
