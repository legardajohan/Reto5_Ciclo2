package codigo.Model.VO;
import codigo.Model.DAO.*;
import java.sql.*;
import java.util.ArrayList;

public class Query3VO {
    public static ArrayList<String[]> values() {
        ResultSet rs = null;
        ArrayList<String[]> data = new ArrayList<String[]>();

        try {
            rs = Query3DAO.query();
            while (rs.next()) {
                // c.ID_Compra, p.Constructora, p.Banco_Vinculado
                int ID = rs.getInt("ID_Compra");
                String Builder = rs.getString("Constructora");
                String Bank = rs.getString("Banco_Vinculado");

                // Agregamos a un arreglo multidimensional
                data.add(new String[]{ID + "", Builder, Bank});

                //System.out.println(String.format("%5d %-15s %-15s %-15s", ID, Builder, Bank));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return data;
    }
}
