package Example1;


public class Curso {
    private int cantidadHoras;
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Curso(int cantidadHoras) {
        this.cantidadHoras = cantidadHoras;
    }

    public int getCantidadHoras() {
        return cantidadHoras;
    }

    public void setCantidadHoras(int cantidadHoras) {
        this.cantidadHoras = cantidadHoras;
    }


    @Override
    public String toString() {
        return "Curso{" +
                "cantidadHoras=" + cantidadHoras +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}



