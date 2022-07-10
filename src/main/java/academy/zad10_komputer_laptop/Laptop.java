package academy.zad10_komputer_laptop;

public class Laptop extends Komputer{

    private double wielkośćMatrycy;
    private boolean czyPosiadaRetine;

    public Laptop(int moc, String producent, TypProcesora typProcesora) {
        super(moc, producent, typProcesora);
    }

    public Laptop(int moc, String producent, TypProcesora typProcesora, double wielkośćMatrycy, boolean czyPosiadaRetine) {
        super(moc, producent, typProcesora);
        this.wielkośćMatrycy = wielkośćMatrycy;
        this.czyPosiadaRetine = czyPosiadaRetine;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "wielkośćMatrycy=" + wielkośćMatrycy +
                ", czyPosiadaRetine=" + czyPosiadaRetine +
                ", " + super.toString() + ""+
                '}';
    }
}
