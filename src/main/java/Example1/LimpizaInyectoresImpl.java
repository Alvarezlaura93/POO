package Example1;

public class LimpizaInyectoresImpl extends Curso implements CursodeInyeccionElectronica{
    public LimpizaInyectoresImpl(int cantidadHoras) {
        super(cantidadHoras);
    }

    @Override
    public void limpiezadeInyectores() {
        System.out.println("Limpiando Inyectores con una maquina genial");
    }
}
