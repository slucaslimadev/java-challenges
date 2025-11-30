public class Pedagio{
    private double totalArrecadado = 0;
    public void cobrar(Veiculo v){
        double valor = v.calcularTarifa();
        totalArrecadado +=valor;
        System.out.println("Cobrando R$ "+valor+ " de um veículo.");
    }
    public void imprimirRelatorio() {
        System.out.println("=== RELATÓRIO DO DIA ===");
        System.out.println("Total no caixa: R$ " + totalArrecadado);
    }
}
