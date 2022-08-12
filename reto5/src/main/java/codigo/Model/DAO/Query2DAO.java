package codigo.Model.DAO;
import java.sql.*;
import codigo.Util.*;

public class Query2DAO {
    public static ResultSet query() {
        Connection conn = null;
        Statement stmt = null; 
        ResultSet rs = null; 
        String csql = "SELECT ID_Proyecto, Constructora, Numero_Habitaciones, Ciudad FROM Proyecto WHERE Clasificacion == 'Casa Campestre' AND Ciudad IN('Santa Marta', 'Cartagena', 'Barranquilla');";

        try {
            conn = JDBCUtil.connect();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(csql);
        } catch (Exception e) {
            System.out.println(e);
        }
        return rs; 
    }    
}
