package Example1;

public class MecanicoGas extends Mecanico {
    public MecanicoGas(String nombre, String apellido, String profesion, int dni) {
        super(nombre, apellido, profesion, dni);
    }

    @Override
    public void YoArreglo() {
        System.out.println("Tenes un problema de gas ");
    }
}
