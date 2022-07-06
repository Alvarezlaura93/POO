package Example1;

import Example1.BasedeDatos.Conexion;
import Example1.BasedeDatos.ConsultasDb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Mecanico extends Persona {
    private List<Curso> cursosRealizado= new ArrayList<>();
    public Mecanico(String nombre, String apellido, String profesion, int dni) {
        super(nombre, apellido, profesion, dni);


       cursosRealizado=ConsultasDb.selectAll();
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
