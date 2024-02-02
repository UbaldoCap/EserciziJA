public class Leone extends Animale{
    public Leone(String nome, int eta) {
        super(nome, eta);
    }

    @Override
    public void emettiSuono() {
        System.out.println("grrrrr");
    }
}
