package ReajusteTrabalho;

public class AssalariadoComissionado extends Funcionarios.Empregado {
    private double salarioBase;
    private double vendas;
    private double percentual;

    public AssalariadoComissionado(double salarioBase, double vendas, double percentual) {
        this.salarioBase = salarioBase;
        this.vendas = vendas;
        this.percentual = percentual;
    }

    @Override
    public double calcularSalario() {
        double salarioComBonus = salarioBase * 1.10;
        return salarioComBonus + vendas * percentual;
    }
}
