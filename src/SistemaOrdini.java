import java.util.ArrayList;

public class SistemaOrdini {
    private final ArrayList<Ordine> ordineArrayList;
    public SistemaOrdini() {
        this.ordineArrayList = new ArrayList<>();
    }

    public ArrayList<Ordine> getOrdineArrayList() {
        return ordineArrayList;
    }

    public void addOrdine(Ordine ordine){
        ordineArrayList.add(ordine);
    }

    public void removeOrdine(Ordine ordine) {
        ordineArrayList.add(ordine);
    }

    public void visualizzaOrdini() {
        for (Ordine ordine : ordineArrayList) {
            System.out.println(ordine);
        }
    }

    public void aggiornaStatoOrdine(Ordine ordine, String string) {
        for (Ordine ordine1 : ordineArrayList) {
            if (ordine.equals(ordine1)) {
                ordine1.setStatoElaborazione(string);
            }
        }
    }
}
