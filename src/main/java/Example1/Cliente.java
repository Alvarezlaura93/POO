package Example1;

public class Cliente extends Persona{
    public Cliente(String nombre, String apellido, String profesion, int dni) {
        super(nombre, apellido, profesion, dni);
    }

    public void ayuda(){
        System.out.println("se me rompio el auto");

    }

}
