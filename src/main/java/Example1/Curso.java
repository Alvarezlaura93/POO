package Example1;


public class Curso {
    private double cantidadHoras;
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Curso(String nombre, double cantidadHoras) {
        this.nombre = nombre;
        this.cantidadHoras = cantidadHoras;
    }

    public Curso(double cantidadHoras) {
        this.cantidadHoras = cantidadHoras;
    }

    public double getCantidadHoras() {
        return cantidadHoras;
    }

    public void setCantidadHoras(double cantidadHoras) {
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



