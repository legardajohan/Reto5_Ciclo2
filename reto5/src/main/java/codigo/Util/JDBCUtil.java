package codigo.Util;
import java.sql.*;

public class JDBCUtil {
    public static Connection connect() {
        Connection conn = null;
        String dataBase = "ProyectosConstruccion.db";
        String url = "JDBC:sqlite:" + dataBase;

        try {
            conn = DriverManager.getConnection(url);
        } catch (Exception e) {
            System.out.println(e);
        }
        return conn;
    }
}
