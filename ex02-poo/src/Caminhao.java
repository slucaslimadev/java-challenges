public class Caminhao implements Veiculo {
    private int eixos;

    public Caminhao(int eixos){
        this.eixos = eixos;
    }

    @Override
    public double calcularTarifa(){
        return eixos * 2.00;
    }

    
}
