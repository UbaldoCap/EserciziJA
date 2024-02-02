public class Elefante extends Animale{
    public Elefante(String nome, int eta) {
        super(nome, eta);
    }

    @Override
    public void emettiSuono() {
        System.out.println("frrr");
    }
}
