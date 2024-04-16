package linguagem_programacao;

import java.util.Scanner;

public class EX_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite a sua idade em anos: ");
        int anos = scanner.nextInt();


        System.out.println("Digite a quantidade de meses: ");
        int meses = scanner.nextInt();

        System.out.println("Digite a quantidade de dias: ");
        int dias = scanner.nextInt();


        int idadeEmDias = calcularIdadeEmDias(anos, meses, dias);


        System.out.println("Sua idade expressa em dias é: " + idadeEmDias + "dias. " );


        scanner.close();


    }

    private static int calcularIdadeEmDias(int anos, int meses, int dias) {

        int idadeEmDias = (anos * 365) + (meses *30) + dias;
        return idadeEmDias;
    }

}
