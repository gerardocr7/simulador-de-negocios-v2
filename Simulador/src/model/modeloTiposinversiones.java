package model;

import com.sun.org.apache.bcel.internal.generic.Select;
import include.Tiposinversiones;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class modeloTiposinversiones extends conexion {
     public boolean insertTiposinversiones (Tiposinversiones tiposinversiones){
        PreparedStatement pst = null;
        boolean flag = false;
        try {
            String consulta ="INSERT INTO tiposinversiones (idtiposInversiones, concepto)VALUES (?,?)";
            pst = getConection().prepareStatement(consulta);
            pst.setInt(1,tiposinversiones.getIdtiposInversiones());
            pst.setString(2,tiposinversiones.getConcepto());

            if (pst.executeUpdate()== 1) {
                flag = true;

            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }finally {
            try {
                if (getConection() !=null) getConection().close();
                if (pst !=null) pst.close();
            }catch (Exception e){


            }
            return flag;
        }
    }
    public ArrayList<Tiposinversiones> obtenerTiposinversiones(){
         ArrayList<Tiposinversiones> tiposinversiones = new ArrayList<Tiposinversiones>();
         PreparedStatement pst = null;
        ResultSet rs = null ;
        try {
            String consulta = "SELECT idtiposInversiones, concepto FROM tiposinversiones";
            pst = getConection().prepareCall(consulta);
            rs = pst.executeQuery();
            while (rs.next()){
                tiposinversiones.add(new Tiposinversiones(rs.getInt("idtiposInversiones"),
                        rs.getString("concepto")));
            }
        }catch (Exception e){

        }finally {
            try {
                if (getConection() !=null)getConection().close();
                if (pst !=null)pst.close();
                if (rs !=null) rs.close();
            }catch (Exception e) {

            }
        }return  tiposinversiones;


    }
    public ArrayList<Tiposinversiones> obtenerTipoinversion (int idtiposInversiones){
         ArrayList<Tiposinversiones> tiposinversiones = new ArrayList<Tiposinversiones>();
         PreparedStatement pst = null ;
         ResultSet rs = null;
         try {

          String consulta  ="SELECT idtiposInversiones, concepto FROM tiposinversiones WHERE idtiposInversiones = ?";
          pst = getConection().prepareCall(consulta);
          pst.setInt( 1, idtiposInversiones);
          rs = pst.executeQuery();
          while (rs.next()){
           tiposinversiones.add(new Tiposinversiones(rs.getInt("idtiposInversiones"),
                   rs.getString("concepto")));

          }
         }catch (Exception e) {
             System.out.println(e.getMessage());

         }finally {
             try {
                 if (getConection() !=null)getConection().close();
                 if (pst !=null)pst.close();
                 if (rs !=null)rs.close();
             }catch (Exception e) {
                 System.out.println(e.getMessage());
             }
             }return  tiposinversiones;

         }
         public boolean actualizarTiposinversiones(Tiposinversiones tiposinversiones){
         PreparedStatement pst = null;
         boolean flag =false;
         try {
             String consulta ="UPDATE tiposinversiones SET idtiposInversiones = ?, concepto =? WHERE idtiposInversiones = ?";
             pst = getConection().prepareStatement(consulta);
             pst.setInt(1,tiposinversiones.getIdtiposInversiones());
             pst.setString(2,tiposinversiones.getConcepto());
             pst.setInt(3,tiposinversiones.getIdtiposInversiones());

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
public  boolean eliminarTiposinversiones(int idtiposInversiones) {
    PreparedStatement pst = null;
    boolean flag = false;
    try {
        String consulta = "DELETE FROM tiposinversiones WHERE idtiposInversiones = ?";
        pst = getConection().prepareStatement(consulta);
        pst.setInt(1, idtiposInversiones);

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
