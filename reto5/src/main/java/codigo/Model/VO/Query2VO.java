package codigo.Model.VO;
import codigo.Model.DAO.*;
import java.sql.*;
import java.util.ArrayList;

public class Query2VO {
    public static ArrayList<String[]> values() {
        ResultSet rs = null;
        ArrayList<String[]> data = new ArrayList<String[]>();

        try {
            rs = Query2DAO.query();
            while (rs.next()) {
                // ID_Proyecto, Constructora, Numero_Habitaciones, Ciudad
                int ID = rs.getInt("ID_Proyecto");
                String Builder = rs.getString("Constructora");
                String BedRooms = rs.getString("Numero_Habitaciones");
                String City = rs.getString("Ciudad");

                // Agregamos a un arreglo multidimensional
                data.add(new String[]{ID + "", Builder, BedRooms, City});

                //System.out.println(String.format("%5d %-15s %-15s %-15s", ID, Builder, BedRooms, City));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return data;
    }
}
