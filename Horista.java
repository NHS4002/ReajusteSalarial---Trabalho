package ReajusteTrabalho;

public class Horista extends Funcionarios.Empregado {
    private double horas;
    private double valorHora;

    public Horista(double horas, double valorHora) {
        this.horas = horas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSalario() {
        if (horas <= 40) {
            return horas * valorHora;
        } else {
            return 40 * valorHora + (horas - 40) * valorHora * 1.5;
        }
    }
}
