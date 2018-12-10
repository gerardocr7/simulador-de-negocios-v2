package controller;

import include.TipoUsuario;
import model.modeloTipoUsuario;
import java.util.ArrayList;

public class controladorTipoUsuario {
    public boolean insertTipoUsuario(TipoUsuario tipousuario) {
        modeloTipoUsuario tipousuario1 = new modeloTipoUsuario();
        return tipousuario1.insertTipoUsuario(tipousuario);
    }

    public ArrayList<TipoUsuario> obtenerTiposUsuarios() {
        modeloTipoUsuario tipousuario = new modeloTipoUsuario();
        return tipousuario.obtenerTiposUsuarios();
    }

    public ArrayList<TipoUsuario> obtenerTipousuario(int idtipoUsuario) {
        modeloTipoUsuario tipousuario = new modeloTipoUsuario();
        return tipousuario.obtenerTipousuario(idtipoUsuario);
    }

    public boolean actualizarTiposUsuario(TipoUsuario tipousuario) {
        modeloTipoUsuario tipousuario1 = new modeloTipoUsuario();
        return tipousuario1.actualizarTiposUsuario(tipousuario);
    }

    public boolean eliminarTiposUsuario(int idtipoUsuario) {
        modeloTipoUsuario tipousuario = new modeloTipoUsuario();
        return tipousuario.eliminarTiposUsuario(idtipoUsuario);
    }

    public static void main(String[] args) {
        controladorTipoUsuario cc = new controladorTipoUsuario();
     //  System.out.println(cc.insertTipoUsuario(new TipoUsuario(006, "PERREO", 005)));


        //listar todos los elementos de la tabla
        ArrayList<TipoUsuario> tipousuario = new ArrayList<TipoUsuario>();
        tipousuario = cc.obtenerTiposUsuarios();
        for (int a = 0; a < tipousuario.size(); a++) {
            System.out.println("tipo usuario: " + tipousuario.get(a).getIdtipoUsuario());
            System.out.println("nombre: " + tipousuario.get(a).getNombre());
            System.out.println("numero de empresas: " + tipousuario.get(a).getNo_empresas());
            System.out.println();
        }
        //listar un elemento de la tabla por su llave primaria

        ArrayList<TipoUsuario> tipousuario1 = new ArrayList<TipoUsuario>();
        tipousuario = cc.obtenerTipousuario(003);

        for (int b = 0; b < tipousuario.size(); b++) {
            System.out.println("tipo usuario: " + tipousuario.get(b).getIdtipoUsuario());
            System.out.println("nombre: " + tipousuario.get(b).getNombre());
            System.out.println(" numero de empresas: " + tipousuario.get(b).getNo_empresas());
            System.out.println();


        }

        //modificar un elemento
        System.out.println(cc.actualizarTiposUsuario(new TipoUsuario(002, "GERAA2", 001)));

        //eliminar un elemento
      //  System.out.println(cc.eliminarTiposUsuario(001));
    }
    }


