
/**
 * Write a description of class JPuniversity here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JPuniversity {
    Estudiante informacion;
    Fecha dateNaci;
    Fecha dateNaci2;
    Fecha dateNaci3;
    Fecha dateAsig;
    Fecha dateAsig2;
    Fecha dateAsig3;
    Fecha dateEntre;
    Fecha dateEntre2;
    Fecha dateEntre3;
    Ayuda ayuda1;
    Ayuda ayuda2;
    Ayuda ayuda3;
    Estudiante estudiante1;
    Estudiante estudiante2;
    Estudiante estudiante3;

    public static void main(String[] args) {
        JPuniversity jpuniversity = new JPuniversity();
        jpuniversity.init();
        jpuniversity.printEstudiantes();
        jpuniversity.printAyudas();
    }

    public void init() {
        // fechas de nacimiento
        dateNaci = new Fecha("08", "10", "2004");
        dateNaci2 = new Fecha("09", "09", "2003");
        dateNaci3 = new Fecha("02", "12", "2001");
        // fecha de asignacion de las ayudas
        dateAsig = new Fecha("11", "08", "2022");
        dateAsig2 = new Fecha("12", "08", "2022");
        dateAsig3 = new Fecha("23", "09", "2022");
        // fechas de entrega de las ayudas
        dateEntre = new Fecha("18", "09", "2022");
        dateEntre2 = new Fecha("20", "09", "2022");
        dateEntre3 = new Fecha("30", "07", "2022");
        // ayudas
        ayuda1 = new Ayuda(TipoAyuda.INTERNET, Estado.ASIGNADO, dateAsig, dateEntre);
        ayuda2 = new Ayuda(TipoAyuda.INTERNET, Estado.RECHAZADO);
        ayuda3 = new Ayuda(TipoAyuda.INTERNET, Estado.ENTREGADO, dateAsig3, dateEntre3);
        // estudiantes
        estudiante1 = new Estudiante("148781749", "81874829", "Juan", dateNaci, "2", "juan@ufps.edu.co", TipoDocumento.CC, ayuda1);
        estudiante2 = new Estudiante("148786346", "1152498745", "Felipe", dateNaci2, "3", "felipe@ufps.edu.co", TipoDocumento.TI, ayuda2);
        estudiante3 = new Estudiante("1487992156", "1090508832", "Carolina", dateNaci3, "4", "carolina@ufps.edu.co", TipoDocumento.CE, ayuda3);
    }

    public void printEstudiantes() {
        System.out.println(estudiante1.mostrarInfoEstudiante());
        System.out.println("**************************************************************");
        System.out.println(estudiante2.mostrarInfoEstudiante());
        System.out.println("**************************************************************");
        System.out.println(estudiante3.mostrarInfoEstudiante());
    }

    public void printAyudas() {
        System.out.println("**************************************************************");
        estudiante1.imprimirRelacionAyudas();
        System.out.println("**************************************************************");
        estudiante2.imprimirRelacionNoAyudas();
        System.out.println("**************************************************************");
        estudiante3.imprimirRelacionAyudas();
    }
}