import java.util.ArrayList;

public class CatalogoFilm {
    private final ArrayList<Film> filmArrayList;

    public CatalogoFilm() {
        this.filmArrayList = new ArrayList<>();
    }

    public ArrayList<Film> getFilmArrayList() {
        return filmArrayList;
    }

    public void addFilm(Film film) {
        filmArrayList.add(film);
    }

    public void removeFilm(Film film) {
        filmArrayList.remove(film);
    }

    public void stampaDettagliFilm() {
        for (Film film : filmArrayList) {
            System.out.println(film);
        }
    }

    public void cercaFilmPerRegista(String string) {
        for (Film film : filmArrayList) {
            if (film.getRegista().equals(string)) {
                System.out.println(film);
            }
        }
    }

    public void cercaFilmPerAnno(int string) {
        for (Film film : filmArrayList) {
            if (film.getAnnoUscita() == string) {
                System.out.println(film);
            }
        }
    }
}
