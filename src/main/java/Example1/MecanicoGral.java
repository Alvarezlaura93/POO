package Example1;

public class MecanicoGral extends Mecanico {
    public MecanicoGral(String nombre, String apellido, String profesion, int dni) {
        super(nombre, apellido, profesion, dni);
    }

    @Override
    public void YoArreglo() {
        System.out.println("tenes problemas en el motor");
    }
}