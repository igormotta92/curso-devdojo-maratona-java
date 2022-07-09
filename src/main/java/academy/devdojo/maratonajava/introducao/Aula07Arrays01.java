package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        /**
         * tipo de referência
         * somente tipos de referência podem ser inicializados como null
         */
        int[] idadesNull = null;
        int[] idades = new int[3]; // é obrigatório dizer o tamanho do array
        idades[0] = 21;
        idades[1] = 15;
        idades[2] = 11;
        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);
    }
}
