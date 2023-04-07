import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double maiorSalario = 0.0;
        double salario;
        double somatorioSalario = 0.0;
        int filhos;
        double somatorioFilhos = 0.0;

        System.out.println("Digite a quantidade de habitantes");
        int quantidadeHabitantes = scanner.nextInt();

        for(int i = 0; i < quantidadeHabitantes ; i++){
            System.out.println("Digite seu salário: ");
            salario = scanner.nextDouble();

            if (salario > maiorSalario){
                maiorSalario = salario;
            }
            somatorioSalario = somatorioSalario + salario;

            System.out.println("Digite quantos filhos você tem: ");
            filhos = scanner.nextInt();
            somatorioFilhos = somatorioFilhos + filhos;
        }
        double mediaSalarial = somatorioSalario/ quantidadeHabitantes;
        System.out.println("A média salarial é R$" + mediaSalarial);

        double mediaFilhos = somatorioFilhos/ quantidadeHabitantes;
        System.out.println("A média de filhos é de " + mediaFilhos);

        System.out.println("O maior salário é de R$ " + maiorSalario);
    }
}