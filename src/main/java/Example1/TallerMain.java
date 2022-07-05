package Example1;

import java.util.HashMap;

public class TallerMain {
    public static void main(String[] args) {
        TallerMecanico taller = new TallerMecanico("Taller AYI", "Algun lugar 1234", 35176549);
        System.out.println(taller);

        System.out.println("Estado del taller: " + taller.estaAbierto());
        taller.agregarMecanico();

        Cliente matu = new Cliente("Matu", "D", "Desarollador", 238541868);


        if(taller.isEstado()) {

           taller.atenderCliente(matu);

        }else {
            System.out.println("Noooo llamo a la grua");
        }



    }


    }


