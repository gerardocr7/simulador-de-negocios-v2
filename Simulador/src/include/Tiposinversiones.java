package include;

public class Tiposinversiones {
    private int idtiposInversiones;
    private  String concepto;

    public Tiposinversiones(int idtiposInversiones, String concepto) {
        this.idtiposInversiones = idtiposInversiones;
        this.concepto = concepto;
    }

    public int getIdtiposInversiones() {
        return idtiposInversiones;
    }

    public void setIdtiposInversiones(int idtiposInversiones) {
        this.idtiposInversiones = idtiposInversiones;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }
}
