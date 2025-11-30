public class App {
    public static void main(String[] args) throws Exception {
        Pedagio pedagio = new Pedagio();
        Carro carro = new Carro();
        Moto moto = new Moto();
        Caminhao caminhao = new Caminhao(4);

        pedagio.cobrar(carro);
        pedagio.cobrar(moto);
        pedagio.cobrar(caminhao);
        pedagio.imprimirRelatorio();
    }
}
