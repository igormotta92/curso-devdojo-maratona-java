package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {

        int idade = (int) 100000000000L;
        long numeroGrande = (long) 155.23;
        double salarioDouble = 2000.0D;
        float salarioFloat = 2500.0F;
        float salarioDoubleToFloat = (float) 2500.0D;
        byte idadeByte = 127;
        short idadeShort = 3200;
        boolean falso = false;
        boolean verdadeido = true;

        char caracter = 'A';
        char caracterAnsii = 49;
        char caracterUnicode = '\u0041';

        String nome = "Goku";

        System.out.println("idade = " + idade);
        System.out.println("numeroGrande = " + numeroGrande);
        System.out.println("salarioDouble = " + salarioDouble);
        System.out.println("salarioFloat = " + salarioFloat);
        System.out.println("salarioDoubleToFloat = " + salarioDoubleToFloat);
        System.out.println("idadeByte = " + idadeByte);
        System.out.println("idadeShort = " + idadeShort);
        System.out.println("falso = " + falso);
        System.out.println("verdadeido = " + verdadeido);
        System.out.println("caracter = " + caracter);
        System.out.println("caracterAnsii = " + caracterAnsii);
        System.out.println("caracterUnicode = " + caracterUnicode);
        System.out.println("nome = " + nome);
    }
}
