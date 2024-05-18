import java.util.ArrayList;

/**
 * Write a description of class Estudiante here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
class Estudiante {
    private String codigo;
    private String documento;
    private String nombre;
    private Fecha fechaNacimiento;
    private String estrato;
    private String email;
    TipoDocumento tdocumento;
    ArrayList<Ayuda> ayudas = new ArrayList();

    public Estudiante() {
    }

    public Estudiante(String codigo, String documento, String nombre, Fecha fechaNacimiento, String estrato, String email, TipoDocumento tdocumento, Ayuda ayuda) {
        this.codigo = codigo;
        this.documento = documento;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.estrato = estrato;
        this.email = email;
        this.tdocumento = tdocumento;
        this.ayudas = new ArrayList<Ayuda>();
        ayudas.add(ayuda);
    }

    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setEstrato(String estrato) {
        this.estrato = estrato;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTdocumento(TipoDocumento tdocumento) {
        this.tdocumento = tdocumento;
    }

    public void setAyudas(ArrayList<Ayuda> ayudas) {
        this.ayudas = ayudas;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDocumento() {
        return documento;
    }

    public String getNombre() {
        return nombre;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getEstrato() {
        return estrato;
    }

    public String getEmail() {
        return email;
    }

    public TipoDocumento getTdocumento() {
        return tdocumento;
    }

    public ArrayList<Ayuda> getAyudas() {
        return ayudas;
    }

    public void addAyuda(Ayuda ayuda) {
        ayudas.add(ayuda);
    }

    public int getCantidadAyudas() {
        return this.ayudas.size();
    }

    public void imprimirRelacionAyudas() {
        System.out.println("\n ****** RELACION DE " + this.getCantidadAyudas());
        for (Ayuda ayuda : this.ayudas) {
            System.out.println(ayuda.imprimirInfoAyudas());
        }
    }

    public void imprimirRelacionNoAyudas() {
        System.out.println("\n ****** RELACION DE " + this.getCantidadAyudas());
        for (Ayuda ayuda : this.ayudas) {
            System.out.println(ayuda.imprimirInfoNoAyudas());
        }
    }

    public String mostrarInfoEstudiante() {
        String informacion = "";
        informacion = "codigo del estudiante: " + codigo + "\n" + "el nombre del estudiante es: " + nombre + "\n";
        informacion = informacion + "el documento del estudiante es: " + documento + "\n" + "el tipo de documento del estudiante es: " + tdocumento + "\n";
        informacion = informacion + "su ayuda es: " + this.ayudas.toString();
        return informacion;
    }
}