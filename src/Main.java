import java.util.Scanner;
import sistemapagamento.Assalariado;
import sistemapagamento.Funcionario;
import sistemapagamento.Horista;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos funcionários deseja inserir? ");
        int n = sc.nextInt();
        sc.nextLine(); // consumir newline

        Funcionario[] equipe = new Funcionario[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Funcionário #" + (i + 1));
            System.out.print("Tipo (1 - Assalariado, 2 - Horista): ");
            int tipo = sc.nextInt();
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("CPF: ");
            String cpf = sc.nextLine();

            if (tipo == 1) {
                System.out.print("Salário semanal: ");
                double salario = sc.nextDouble();
                sc.nextLine();
                equipe[i] = new Assalariado(nome, cpf, salario);
            } else if (tipo == 2) {
                System.out.print("Horas trabalhadas: ");
                double horas = sc.nextDouble();
                System.out.print("Valor por hora: ");
                double valorHora = sc.nextDouble();
                sc.nextLine();
                equipe[i] = new Horista(nome, cpf, horas, valorHora);
            } else {
                System.out.println("Tipo inválido. Assalariado por padrão.");
                System.out.print("Salário semanal: ");
                double salario = sc.nextDouble();
                sc.nextLine();
                equipe[i] = new Assalariado(nome, cpf, salario);
            }
            System.out.println();
        }

        System.out.println("\n--- Folha de Pagamento ---");
        for (Funcionario f : equipe) {
            f.exibirInfo();
            String tipo = f instanceof Assalariado ? "Assalariado" : "Horista";
            System.out.println("Tipo: " + tipo);
            System.out.printf("Pagamento: R$%.2f%n%n", f.calcularPagamento());
        }
        sc.close();
    }
}