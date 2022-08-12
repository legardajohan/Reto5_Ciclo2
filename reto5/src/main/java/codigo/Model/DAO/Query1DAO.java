package codigo.Model.DAO;
import java.sql.*;
import codigo.Util.*;

public class Query1DAO {
    public static ResultSet query() {
        Connection conn = null;
        Statement stmt = null; 
        ResultSet rs = null; 
        String csql = "SELECT ID_Lider, Nombre, Primer_Apellido, Ciudad_Residencia FROM Lider ORDER BY Ciudad_Residencia;";

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
