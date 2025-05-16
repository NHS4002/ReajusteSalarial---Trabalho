package ReajusteTrabalho;

public class Comissionado extends Funcionarios.Empregado {
    private double vendas;
    private double percentual;

    public Comissionado(double vendas, double percentual) {
        this.vendas = vendas;
        this.percentual = percentual;
    }

    @Override
    public double calcularSalario() {
        return vendas * percentual;
    }
}
