public class Daire implements IIslem{
    private double yaricap;

    public Daire(double yaricap) {
        this.yaricap = yaricap;
    }

    @Override
    public double alanHesapla() {
        return Math.PI * yaricap * yaricap;
    }

    @Override
    public double cevreHesapla() {
        return 2 * Math.PI * yaricap;
    }
}
