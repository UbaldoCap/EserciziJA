public class Libro {
    private String titolo;
    private String autore;
    private String genere;
    private boolean disponiilta;

    public Libro(String titolo, String autore, String genere, boolean disponiilta) {
        this.titolo = titolo;
        this.autore = autore;
        this.genere = genere;
        this.disponiilta = disponiilta;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public void setDisponiilta(boolean disponiilta) {
        this.disponiilta = disponiilta;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titolo='" + titolo + '\'' +
                ", autore='" + autore + '\'' +
                ", genere='" + genere + '\'' +
                ", disponiilta=" + disponiilta +
                '}';
    }
}
