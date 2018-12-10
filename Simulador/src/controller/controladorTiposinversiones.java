package controller;

import include.Tiposinversiones;
import model.modeloTiposinversiones;
import java.util.ArrayList;


public class controladorTiposinversiones {
    public boolean insertTiposinversiones(Tiposinversiones tiposinversiones){
        modeloTiposinversiones tiposinversiones1 = new modeloTiposinversiones();
        return tiposinversiones1.insertTiposinversiones(tiposinversiones);

    }
    public ArrayList<Tiposinversiones> obtenerTiposinversiones(){
        modeloTiposinversiones tiposinversiones =new modeloTiposinversiones();
        return tiposinversiones.obtenerTiposinversiones();
    }
    public ArrayList<Tiposinversiones> obtenerTipoinversion (int idtiposInversiones){
        modeloTiposinversiones tiposinversiones =new modeloTiposinversiones();
        return tiposinversiones.obtenerTipoinversion(idtiposInversiones);
    }
    public boolean actualizarTiposinversiones (Tiposinversiones tiposinversiones){
        modeloTiposinversiones tiposinversiones1 =new modeloTiposinversiones();
        return tiposinversiones1.actualizarTiposinversiones(tiposinversiones);
    }
    public boolean eliminarTiposinversiones (int idtiposInversiones){
        modeloTiposinversiones tiposinversiones = new modeloTiposinversiones();
        return tiposinversiones.eliminarTiposinversiones(idtiposInversiones);
    }

    public static void main(String[] args){
        controladorTiposinversiones cc = new controladorTiposinversiones();
        System.out.println(cc.insertTiposinversiones(new Tiposinversiones(003, "TALLER DE INVESTIGACION")));

        //listar todos los elementos de la tabla
        ArrayList<Tiposinversiones> tiposinversiones = new ArrayList<Tiposinversiones>();
        tiposinversiones = cc.obtenerTiposinversiones();
        for(int a = 0; a < tiposinversiones.size(); a++) {
            System.out.println("tipos: " + tiposinversiones.get(a).getIdtiposInversiones());
            System.out.println("concepto:" + tiposinversiones.get(a).getConcepto());
            System.out.println();
        }
        //listar un elemento de la tabla por su llave primaria

        ArrayList<Tiposinversiones> tiposinversiones1 =new ArrayList<Tiposinversiones>();
        tiposinversiones = cc.obtenerTipoinversion(003);

        for (int b = 0; b < tiposinversiones.size(); b++){
            System.out.println("idtipo: " + tiposinversiones.get(b).getIdtiposInversiones());
            System.out.println("concepto: " + tiposinversiones.get(b).getConcepto());
            System.out.println();


        }
        //modificar un elemento
        System.out.println(cc.actualizarTiposinversiones(new Tiposinversiones(004, "REcepcionista del hotel")));

        //eliminar un elemento
       System.out.println(cc.eliminarTiposinversiones(1));
    }


}
