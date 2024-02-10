public class Dikdortgen implements IIslem {
    private double uzunKenar;
    private double kisaKenar;

    public Dikdortgen(double uzunKenar, double kisaKenar) {
        this.uzunKenar = uzunKenar;
        this.kisaKenar = kisaKenar;
    }

    @Override
    public double alanHesapla() {
        return uzunKenar * kisaKenar;
    }

    @Override
    public double cevreHesapla() {
        return 2 * (uzunKenar + kisaKenar);
    }
}
