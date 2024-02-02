import java.util.ArrayList;

public class Biblioteca {
    private final ArrayList<Libro> libroArrayList;
    public Biblioteca() {
        this.libroArrayList = new ArrayList<>();
    }

    public ArrayList<Libro> getLibroArrayList() {
        return libroArrayList;
    }

    public void addLibro(Libro libro) {
        libroArrayList.add(libro);
    }

    public void removeLibro(Libro libro) {
        libroArrayList.remove(libro);
    }

    public void visualizzaElencoLibri() {
        for (Libro libro : libroArrayList) {
            System.out.println(libro);
        }
    }

    public void cercaLibroPerAutore(String string) {
        for (Libro libro : libroArrayList) {
            if (libro.getAutore().equals(string)) {
                System.out.println(libro);
            }
        }
    }

    public void cercaLibroPerGenere(String string) {
        for (Libro libro : libroArrayList) {
            if (libro.getGenere().equals(string)) {
                System.out.println(libro);
            }
        }
    }
}
