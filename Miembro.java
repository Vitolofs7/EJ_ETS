public class Miembro {
    private String nombre;
    private int mes;
    private int anio;

    public Miembro(String nombre, int mes, int anio) {
        this.nombre = nombre;
        this.mes = mes;
        this.anio = anio;
    }

    // Métodos getter y setter para nombre, edad y direccion

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    // Otros métodos de la clase Miembro
}
