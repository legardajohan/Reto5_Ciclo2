package codigo.Model.VO;
import codigo.Model.DAO.*;
import java.sql.*;
import java.util.ArrayList;

public class Query1VO {
    public static ArrayList<String[]> values() {
        ResultSet rs = null;
        ArrayList<String[]> data = new ArrayList<String[]>();

        try {
            rs = Query1DAO.query();
            while (rs.next()) {
                // ID_Lider, Nombre, Primer_Apellido, Ciudad_Residencia 
                int ID = rs.getInt("ID_Lider");
                String Name = rs.getString("Nombre");
                String LastName = rs.getString("Primer_Apellido");
                String City = rs.getString("Ciudad_Residencia");

                // Agregamos a un arreglo multidimensional
                data.add(new String[]{ID + "", Name, LastName, City});

                //System.out.println(String.format("%5d %-15s %-15s %-15s", ID, Name, LastName, City));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return data;
    }        
}
