package Example1;

public class CursoReparaciondeBombaImpl extends Curso implements CursoReparaciondeBomba{
    public CursoReparaciondeBombaImpl(int cantidadHoras) {
        super(cantidadHoras);
    }

    @Override
    public void repararBomba() {
        System.out.println("reparando bomba");
    }
}
