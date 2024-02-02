import java.util.ArrayList;

public class GestoreForme {
    ArrayList<FormaGeometrica> formaGeometricaArrayList;

    public GestoreForme() {
        this.formaGeometricaArrayList = new ArrayList<>();
    }

    public ArrayList<FormaGeometrica> getFormaGeometricaArrayList() {
        return formaGeometricaArrayList;
    }

    public void addForma(FormaGeometrica formaGeometrica) {
        formaGeometricaArrayList.add(formaGeometrica);
    }

    public void removeForma(FormaGeometrica formaGeometrica) {
        formaGeometricaArrayList.remove(formaGeometrica);
    }

    public void visualizzaForme() {
        for (FormaGeometrica formaGeometrica : formaGeometricaArrayList){
            System.out.println(formaGeometrica);
        }
    }

    public Double calcolaAreaTotale() {
        Double sum = 0.0;
        for (FormaGeometrica formaGeometrica : formaGeometricaArrayList) {
            sum += formaGeometrica.calcolaArea();
        }
        return sum;
    }
}
