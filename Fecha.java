
/**
 * Write a description of class Fecha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
class Fecha {
    String dia;
    String mes;
    String año;

    public Fecha() {
    }

    public Fecha(String dia, String mes, String año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public String obtenerFecha() {
        return dia + ", " + mes + ", " + año;
    }
}
