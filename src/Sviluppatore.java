public class Sviluppatore extends Dipendente{
    public Sviluppatore(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcolaSalarioAnnuo() {
        return getSalario() * 12;
    }
}
