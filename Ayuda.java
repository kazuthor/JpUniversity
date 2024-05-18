
/**
 * Write a description of class Ayuda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
class Ayuda {
    TipoAyuda tipo;
    Estado estado;
    private Fecha fechaAsignacion;
    private Fecha fechaEntrega;

    public Ayuda() {
    }

    public Ayuda(TipoAyuda tipo, Estado estado, Fecha fechaAsignacion, Fecha fechaEntrega) {
        this.tipo = tipo;
        this.estado = estado;
        this.fechaAsignacion = fechaAsignacion;
        this.fechaEntrega = fechaEntrega;
    }

    public Ayuda(TipoAyuda tipo, Estado estado) {
        this.tipo = tipo;
        this.estado = estado;
    }

    public String imprimirInfoAyudas() {
        return tipo + ", " + estado + ", " + fechaAsignacion.obtenerFecha() + ", " + fechaEntrega.obtenerFecha();
    }

    public String imprimirInfoNoAyudas() {
        return tipo + ", " + estado;
    }

    public String imprimirAyudas() {
        return tipo + ", " + estado;
    }
}