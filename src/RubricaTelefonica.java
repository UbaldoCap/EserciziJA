import java.util.ArrayList;

public class RubricaTelefonica {
    private final ArrayList<Contatto> contattoArrayList;

    public RubricaTelefonica() {
        this.contattoArrayList = new ArrayList<>();
    }

    public ArrayList<Contatto> getContattoArrayList() {
        return contattoArrayList;
    }

    public void addContatto(Contatto contatto) {
        contattoArrayList.add(contatto);
    }

    public void removeContatto(Contatto contatto) {
        contattoArrayList.remove(contatto);
    }

    public void visualizzaContatti() {
        for (Contatto contatto : contattoArrayList) {
            System.out.println(contatto);
        }
    }

    public void cercaContattoPerNome(String string) {
        for (Contatto contatto : contattoArrayList) {
            if (contatto.getNome().equals(string)) {
                System.out.println(contatto);
            }
        }
    }

    public void cercaContattoPerNumTelefono(String string) {
        for (Contatto contatto : contattoArrayList) {
            if (contatto.getNumeroTelefono().equals(string)) {
                System.out.println(contatto);
            }
        }
    }
}
