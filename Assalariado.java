package ReajusteTrabalho;

public class Assalariado extends Funcionarios.Empregado {
    private double salarioBase;

    public Assalariado(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSalario() {
        return salarioBase;
    }
}
