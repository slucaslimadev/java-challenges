import java.util.Scanner;

public class CalculadoraSalario {

    public void calcularDesconto(){
        Scanner scanner = new Scanner(System.in);

        // Recebendo dados do salario
        System.out.println("Digite seu salario bruto: ");
        double salarioBruto = scanner.nextDouble();

        // Alterando scanner para receber texto
        scanner.nextLine();

        System.out.println("Digite seu cargo: ");
        String cargo = scanner.nextLine().toLowerCase();

        // Variaveis para calculos de descontos
        double descontoInss = 0;
        double descontoRenda = 0;
        double salarioLiquido = salarioBruto;

        // Calculo inss
        if (salarioBruto <= 2000) {
            descontoInss = salarioBruto * 0.10;
        }else{
            descontoInss = salarioBruto * 0.15;
        }
        salarioLiquido -= descontoInss;

        // Calculo Imposto de Renda
        if (salarioBruto > 5000 && salarioBruto <= 5500) {
            descontoRenda = salarioBruto * 0.05;
        } else if (salarioBruto > 5500) {
            descontoRenda = salarioBruto * 0.10;
        }
        salarioLiquido -= descontoRenda;

        // Bônus se o cargo for gerente
        if (cargo.equals("gerente")) {
            salarioLiquido += 1000;
            System.out.println(">>> Bônus de Gerente aplicado!");
        }

        // Mostrando dados para usuário
        //
        System.out.println("-----------------------------");
        System.out.println("RESUMO DO PAGAMENTO");
        System.out.println("Salário Bruto: R$ " + salarioBruto);
        System.out.println("Desconto INSS: - R$ " + descontoInss);
        System.out.println("Desconto IR:   - R$ " + descontoRenda);
        System.out.println("-----------------------------");
        System.out.println("SALÁRIO LÍQUIDO: R$ " + salarioLiquido);
        
        scanner.close();

    }
}
