package Example1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TallerMecanico {

private String nombre;
private String direccion;
private int telefono;
private boolean estado;
private HashMap<String,Mecanico> mecanicoMap= new HashMap<>();

    public HashMap<String, Mecanico> getMecanicoMap() {
        return mecanicoMap;
    }

    public void setMecanicoMap(HashMap<String, Mecanico> mecanicoMap) {
        this.mecanicoMap = mecanicoMap;
    }

    public TallerMecanico(String nombre, String direccion, int telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }



    @Override
    public String toString() {
        return "TallerMecanico{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono=" + telefono +
                ", estado=" + estado +
                '}';
    }

    public boolean estaAbierto(){
        switch (LocalDate.now().getDayOfWeek().getValue()){
            case 6:{
                this.setEstado(false);
            }
            case 7:{
                this.setEstado(false);
            }
            default:
                this.setEstado(true);

        }
        return estado;
    }

    public void agregarMecanico() {
        mecanicoMap.put("juan",new Mecanico("juan","diaz","mecanico general",23445666));
    }

    public void atenderCliente(Cliente cliente){
        cliente.ayuda();
        System.out.println(this.getMecanicoMap().get("juan").getCursosRealizado().get(0).getNombre());
    }




}
