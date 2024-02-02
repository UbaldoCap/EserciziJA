import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //1
        System.out.println("1");
        Cerchio cerchio1 = new Cerchio("Giallo", 4.0);
        Quadrato quadrato = new Quadrato("Blu", 6.0);
        System.out.println(cerchio1.calcolaArea());
        System.out.println(quadrato.calcolaArea());

        GestoreForme gestoreForme = new GestoreForme();
        gestoreForme.addForma(cerchio1);
        gestoreForme.addForma(quadrato);
        gestoreForme.visualizzaForme();
        System.out.println(gestoreForme.calcolaAreaTotale());
        System.out.println();

        //1a
        System.out.println("1a");
        Film film1 = new Film("asa", "aa", 23, 1.0);
        Film film2 = new Film("fff", "vv", 55, 3.0);

        CatalogoFilm catalogoFilm = new CatalogoFilm();
        catalogoFilm.addFilm(film1);
        catalogoFilm.addFilm(film2);
        catalogoFilm.stampaDettagliFilm();
        catalogoFilm.cercaFilmPerRegista("aa");
        catalogoFilm.cercaFilmPerAnno(55);

        //2
        System.out.println("2");
        Manager manager = new Manager("nm", 1200.0);
        Sviluppatore sviluppatore = new Sviluppatore("ss", 900.0);
        GestoreDipendenti gestoreDipendenti = new GestoreDipendenti();
        gestoreDipendenti.addDipendente(manager);
        gestoreDipendenti.addDipendente(sviluppatore);
        gestoreDipendenti.visualizzaDipendenti();
        System.out.println(gestoreDipendenti.sommaSalari());

        //2a
        System.out.println("2a");
        Contatto contatto1 = new Contatto("nn", "kkk", "878", "m@l.c");
        Contatto contatto2 = new Contatto("pp", "hhh", "362", "k@l.b");
        RubricaTelefonica rubricaTelefonica = new RubricaTelefonica();
        rubricaTelefonica.addContatto(contatto1);
        rubricaTelefonica.addContatto(contatto2);
        rubricaTelefonica.visualizzaContatti();
        rubricaTelefonica.cercaContattoPerNome("nn");
        rubricaTelefonica.cercaContattoPerNumTelefono("362");

        //3
        System.out.println("3");
        Leone leone = new Leone("palla", 44);
        Elefante elefante = new Elefante("schizzo", 33);
        GestoreAnimale gestoreAnimale = new GestoreAnimale();
        gestoreAnimale.addAnimale(leone);
        gestoreAnimale.addAnimale(elefante);
        gestoreAnimale.visualizzaAnimali();
        gestoreAnimale.tuttiIversi();

        //1
        System.out.println("1");
        Libro libro1 = new Libro("jj", "po", "vyu", true);
        Libro libro2 = new Libro("ll", "cd", "xadd3w", true);
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.addLibro(libro1);
        biblioteca.addLibro(libro2);
        biblioteca.visualizzaElencoLibri();
        biblioteca.cercaLibroPerAutore("po");
        biblioteca.cercaLibroPerGenere("xadd3w");

        //2
        Prodotto prodotto1 = new Prodotto("slp", 4, 6.0);
        Prodotto prodotto2 = new Prodotto("sad", 2, 3.5);
        Prodotto prodotto3 = new Prodotto("pll", 4, 6.0);
        Prodotto prodotto4 = new Prodotto("klo", 2, 3.5);
        Ordine ordine1 = new Ordine(3, "12/04/2023", new ArrayList<>(), "por");
        Ordine ordine2 = new Ordine(6, "19/04/2023", new ArrayList<>(), "por");
        ordine1.getProdottiOrdinati().add(prodotto1);
        ordine1.getProdottiOrdinati().add(prodotto2);
        ordine2.getProdottiOrdinati().add(prodotto3);
        ordine2.getProdottiOrdinati().add(prodotto4);
        SistemaOrdini sistemaOrdini = new SistemaOrdini();
        sistemaOrdini.addOrdine(ordine1);
        sistemaOrdini.addOrdine(ordine2);
        sistemaOrdini.visualizzaOrdini();
        sistemaOrdini.aggiornaStatoOrdine(ordine2, "lll");
        sistemaOrdini.visualizzaOrdini();
    }
}
