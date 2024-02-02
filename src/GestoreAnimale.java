import java.util.ArrayList;

public class GestoreAnimale {
    private ArrayList<Animale> animaleArrayList;

    public GestoreAnimale() {
        this.animaleArrayList = new ArrayList<>();
    }

    public ArrayList<Animale> getAnimaleArrayList() {
        return animaleArrayList;
    }
    public void addAnimale(Animale animale) {
        animaleArrayList.add(animale);
    }

    public void visualizzaAnimali() {
        for (Animale animale : animaleArrayList) {
            System.out.println(animale);
        }
    }

    public void tuttiIversi() {
        for (Animale animale : animaleArrayList) {
            animale.emettiSuono();
        }
    }
}
