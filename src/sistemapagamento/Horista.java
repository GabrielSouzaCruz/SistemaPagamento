package sistemapagamento;

public class Horista extends Funcionario {
    private double horasTrabalhadas;
    private double valorHora;

    public Horista(String nome, String cpf, double horasTrabalhadas, double valorHora) {
        super(nome, cpf);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularPagamento() {
        return horasTrabalhadas * valorHora;
    }
}