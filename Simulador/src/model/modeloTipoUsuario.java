package model;

import include.TipoUsuario;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class modeloTipoUsuario extends conexion {
    public boolean insertTipoUsuario(TipoUsuario tipousuario) {
        PreparedStatement pst = null;
        boolean flag = false;
        try {
            String consulta = "INSERT INTO tipousuario (idtipoUsuario, nombre, no_empresas)VALUES (?,?,?)";
            pst = getConection().prepareStatement(consulta);
            pst.setInt(1, tipousuario.getIdtipoUsuario());
            pst.setString(2, tipousuario.getNombre());
            pst.setInt(3, tipousuario.getNo_empresas());

            if (pst.executeUpdate() == 1) {
                flag = true;
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (getConection() != null) getConection().close();
                if (pst != null) pst.close();
            } catch (Exception e) {

            }
            return flag;
        }
    }

    public ArrayList<TipoUsuario> obtenerTiposUsuarios() {
        ArrayList<TipoUsuario> tipousuario = new ArrayList<TipoUsuario>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String consulta = "SELECT idtipoUsuario, nombre, no_empresas FROM tipousuario";
            pst = getConection().prepareCall(consulta);
            rs = pst.executeQuery();
            while (rs.next()) {
                tipousuario.add(new TipoUsuario(rs.getInt("idtipoUsuario"),
                        rs.getString("nombre"),
                        rs.getInt("no_empresas")));
            }
        } catch (Exception e) {

        } finally {
            try {
                if (getConection() != null) getConection().close();
                if (pst != null) pst.close();
                if (rs != null) rs.close();
            } catch (Exception e) {

            }
        }
        return tipousuario;
    }

    public ArrayList<TipoUsuario> obtenerTipousuario(int idtipoUsuario) {
        ArrayList<TipoUsuario> tipousuario = new ArrayList<TipoUsuario>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {

            String consulta = "SELECT idtipoUsuario, nombre, no_empresas FROM tipousuario WHERE idtipoUsuario = ?";
            pst = getConection().prepareCall(consulta);
            pst.setInt(1, idtipoUsuario);
            rs = pst.executeQuery();
            while (rs.next()) {
                tipousuario.add(new TipoUsuario(rs.getInt("idtipoUsuario"),
                        rs.getString("nombre"),
                        rs.getInt("no_empresas")));

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());

        } finally {
            try {
                if (getConection() != null) getConection().close();
                if (pst != null) pst.close();
                if (rs != null) rs.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return tipousuario;

    }
    public boolean actualizarTiposUsuario(TipoUsuario tipousuario){
        PreparedStatement pst = null;
        boolean flag =false;
        try {
            String consulta ="UPDATE tipousuario SET idtipoUsuario = ?, nombre =?, no_empresas =? WHERE idtipoUsuario = ?";
            pst = getConection().prepareStatement(consulta);
            pst.setInt(1,tipousuario.getIdtipoUsuario());
            pst.setString(2,tipousuario.getNombre());
            pst.setInt(3,tipousuario.getNo_empresas());
            pst.setInt(4,tipousuario.getIdtipoUsuario());

            if (pst.executeUpdate() == 1){
                flag = true;


            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());

        }finally {
            try {
                if (getConection() !=null) getConection().close();
                if (pst != null)pst.close();

            }catch (Exception a) {
                System.out.println(a.getMessage());

            }
        }return flag;
    }
    public  boolean eliminarTiposUsuario(int idtipoUsuario) {
        PreparedStatement pst = null;
        boolean flag = false;
        try {
            String consulta = "DELETE FROM tipousuario WHERE idtipoUsuario = ?";
            pst = getConection().prepareStatement(consulta);
            pst.setInt(1, idtipoUsuario);

            if (pst.executeUpdate() == 1) {
                flag = true;

            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (getConection() !=null)getConection().close();
                if (pst != null) pst.close();


            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } return flag;


    }
}
