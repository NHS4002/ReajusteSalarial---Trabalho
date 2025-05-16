package ReajusteTrabalho;

public class Assalariado extends Funcionarios.Empregado {
    private double salarioSemanal;

    public Assalariado(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }

    @Override
    public double calcularSalario() {
        return salarioSemanal;
    }
}
