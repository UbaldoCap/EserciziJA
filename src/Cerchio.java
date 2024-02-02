public class Cerchio extends FormaGeometrica{
    private Double raggio;

    public Cerchio(String colore, Double raggio) {
        super(colore);
        this.raggio = raggio;
    }

    public Double getRaggio() {
        return raggio;
    }

    public void setRaggio(Double raggio) {
        this.raggio = raggio;
    }

    @Override
    public Double calcolaArea() {
        return raggio * Math.PI;
    }
}
