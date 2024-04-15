public class EX_2 {
    public static void main(String[] args) {

        // Definindo os gastos de cada mês
        int gastoJaneiro = 15000;
        int gastoFevereiro = 23000;
        int gastoMarco = 17000;


        // Calculando o gasto total no trimestre
        int gastoTotal = gastoJaneiro + gastoFevereiro + gastoMarco;


        // Calculando a média mensal de gastos
        double mediaMensal = gastoTotal / 3.0;


        // Exibindo os resultados
        System.out.println("Gasto total no trimestre: R$ " + gastoTotal);
        System.out.println("Média mensal de gastos: R$ " + mediaMensal);
    }
}
