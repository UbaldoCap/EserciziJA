public abstract class Dipendente {
    private String nome;
    private double salario;

    public Dipendente(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public abstract double calcolaSalarioAnnuo();

    @Override
    public String toString() {
        return "Dipendente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
