package Example1;

import Example1.BasedeDatos.Conexion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Mecanico extends Persona {
    private List<Curso> cursosRealizado= new ArrayList<>();
    public Mecanico(String nombre, String apellido, String profesion, int dni) {
        super(nombre, apellido, profesion, dni);
        Curso curso1 = new LimpizaInyectoresImpl(123);
        Curso curso2 = new CursoReparaciondeBombaImpl(1255);
        curso1.setNombre("bienvenida");
        cursosRealizado.add(curso1);
        cursosRealizado.add(curso2);
        Conexion.connect();
    }

    public List<Curso> getCursosRealizado() {
        return cursosRealizado;
    }

    public void setCursosRealizado(List<Curso> cursosRealizado) {
        this.cursosRealizado = cursosRealizado;
    }

    public void YoArreglo(){
        System.out.println("yo arreglo tu auto");
    }

    public void agregarCurso( Curso curso){
        cursosRealizado.add(curso);
    }
    public Curso traer(){
       return cursosRealizado.get(0);

    }


}
