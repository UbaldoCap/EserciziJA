import java.util.ArrayList;

public class GestoreDipendenti {
    private final ArrayList<Dipendente> dipendenteArrayList;

    public GestoreDipendenti() {
        this.dipendenteArrayList = new ArrayList<>();
    }

    public ArrayList<Dipendente> getDipendenteArrayList() {
        return dipendenteArrayList;
    }

    public void addDipendente(Dipendente dipendente) {
        dipendenteArrayList.add(dipendente);
    }

    public void visualizzaDipendenti() {
        for (Dipendente dipendente : dipendenteArrayList) {
            System.out.println(dipendente);
        }
    }

    public double sommaSalari() {
        double sum = 0.0;
        for (Dipendente dipendente : dipendenteArrayList) {
            sum += dipendente.calcolaSalarioAnnuo();
        }
        return sum;
    }
}
