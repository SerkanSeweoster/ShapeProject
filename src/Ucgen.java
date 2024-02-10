public class Ucgen implements IIslem{
    private double a;
    private double b;
    private double c;

    public Ucgen(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double alanHesapla() {
        double u = (a + b + c) / 2;
        return Math.sqrt(u * (u - a) * (u - b) * (u - c));
    }

    @Override
    public double cevreHesapla() {
        return a + b + c;
    }
}
