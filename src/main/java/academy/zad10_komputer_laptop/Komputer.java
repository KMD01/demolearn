package academy.zad10_komputer_laptop;

public class Komputer {
    private int moc;
    private String producent;
    private TypProcesora typProcesora;

    public Komputer(int moc, String producent, TypProcesora typProcesora) {
        this.moc = moc;
        this.producent = producent;
        this.typProcesora = typProcesora;
    }

    public int getMoc() {
        return moc;
    }

    public String getProducent() {
        return producent;
    }

    public TypProcesora getTypProcesora() {
        return typProcesora;
    }

    public void setMoc(int moc) {
        this.moc = moc;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    public void setTypProcesora(TypProcesora typProcesora) {
        this.typProcesora = typProcesora;
    }

    @Override
    public String toString() {
        return "Komputer{" +
                "moc=" + moc +
                ", producent='" + producent + '\'' +
                ", typProcesora=" + typProcesora +
                '}';
    }
}
