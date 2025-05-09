package sistemapagamento;

public abstract class Funcionario {
    private String nome;
    private String cpf;

    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    // Método abstrato para cálculo de pagamento
    public abstract double calcularPagamento();

    // Exibe nome e CPF
    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
    }
}