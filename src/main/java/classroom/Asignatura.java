package classroom;

public class Asignatura {

    String nombre;
    String n = nombre;
    int codigoInterno;
    int codigoExterno;

    Asignatura() {
        this("Sin nombre");
    }

    Asignatura(int codigoExterno) {
        this("Sin nombre", 0, codigoExterno);
    }

    Asignatura(String nombre) {
        this(nombre, 0, 0);
    }

    Asignatura(String nombre, int codigoInterno, int codigoExterno) {
        this.nombre = nombre;
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
    }

    void cambiarDatos(int codigoInterno, int codigoExterno, String nombre) {
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.nombre = nombre;
    }


    void cambiarDatos(int codigoExterno) {
        this.codigoExterno = codigoExterno;
    }

    void cambiarDatos(String nombre) {
        this.nombre = nombre;
    }
    
    public void setCodigoInterno(double codigoInterno) {
        this.codigoInterno = (int) codigoInterno;
    }
}
