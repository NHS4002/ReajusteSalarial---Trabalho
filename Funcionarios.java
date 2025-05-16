package ReajusteTrabalho;

public class Funcionarios {
    public static abstract class Empregado {
        public abstract double calcularSalario();
    }

    public static void main(String[] args) {
        Empregado emp1 = new Assalariado(1200.0);
        Empregado emp2 = new Horista(45, 20.0);
        Empregado emp3 = new Comissionado(8000.0, 0.05);
        Empregado emp4 = new AssalariadoComissionado(1200.0, 5000.0, 0.05);

        System.out.println("Folha de Pagamento\n--------------------------------------");
        System.out.println("Assalariado: R$ " + emp1.calcularSalario() + "              |");
        System.out.println("Horista: R$ " + emp2.calcularSalario() + "                   |");
        System.out.println("Comissionado: R$ " + emp3.calcularSalario() + "              |");
        System.out.println("Assalariado Comissionado: R$ " + emp4.calcularSalario() + " |");
        System.out.println("--------------------------------------");
    }
}
