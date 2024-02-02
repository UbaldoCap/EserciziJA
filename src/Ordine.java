import java.util.ArrayList;

public class Ordine {
    private int numeroOrdine;
    private String dataCreazione;
    private ArrayList<Prodotto> prodottiOrdinati;
    private String statoElaborazione;

    public Ordine(int numeroOrdine, String dataCreazione, ArrayList<Prodotto> prodottiOrdinati, String statoElaborazione) {
        this.numeroOrdine = numeroOrdine;
        this.dataCreazione = dataCreazione;
        this.prodottiOrdinati = prodottiOrdinati;
        this.statoElaborazione = statoElaborazione;
    }

    public int getNumeroOrdine() {
        return numeroOrdine;
    }

    public String getDataCreazione() {
        return dataCreazione;
    }

    public ArrayList<Prodotto> getProdottiOrdinati() {
        return prodottiOrdinati;
    }

    public String getStatoElaborazione() {
        return statoElaborazione;
    }

    public void setNumeroOrdine(int numeroOrdine) {
        this.numeroOrdine = numeroOrdine;
    }

    public void setDataCreazione(String dataCreazione) {
        this.dataCreazione = dataCreazione;
    }

    public void setStatoElaborazione(String statoElaborazione) {
        this.statoElaborazione = statoElaborazione;
    }

    @Override
    public String toString() {
        return "Ordine{" +
                "numeroOrdine=" + numeroOrdine +
                ", dataCreazione='" + dataCreazione + '\'' +
                ", prodottiOrdinati=" + prodottiOrdinati +
                ", statoElaborazione='" + statoElaborazione + '\'' +
                '}';
    }
}
