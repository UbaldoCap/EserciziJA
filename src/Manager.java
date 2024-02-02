public class Manager extends Dipendente{
    public Manager(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcolaSalarioAnnuo() {
        return getSalario() * 12;
    }
}
