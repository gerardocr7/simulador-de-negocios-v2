package include;



public class TipoUsuario{
    private int idtipoUsuario;
    private String nombre;
    private int no_empresas;

    public TipoUsuario(int idtipoUsuario, String nombre, int no_empresas) {
        this.idtipoUsuario = idtipoUsuario;
        this.nombre = nombre;
        this.no_empresas = no_empresas;
    }

    public int getIdtipoUsuario() {
        return idtipoUsuario;
    }

    public void setIdtipoUsuario(int idtipoUsuario) {
        this.idtipoUsuario = idtipoUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNo_empresas() {
        return no_empresas;
    }

    public void setNo_empresas(int no_empresas) {
        this.no_empresas = no_empresas;
    }
}
