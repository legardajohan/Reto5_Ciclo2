package codigo.Model.DAO;
import java.sql.*;
import codigo.Util.*;

public class Query3DAO {
    public static ResultSet query() {
        Connection conn = null;
        Statement stmt = null; 
        ResultSet rs = null; 
        String csql = "SELECT c.ID_Compra, p.Constructora, p.Banco_Vinculado FROM Compra c JOIN Proyecto p USING(ID_Proyecto) WHERE c.Proveedor == 'Homecenter' AND p.Ciudad == 'Salento';";

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
