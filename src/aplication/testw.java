package aplication;


import db.DB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class testw {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement st = null;

        try {
            con = DB.getCon();
            st = con.prepareStatement("UPDATE seller SET BaseSalary = ?- BaseSalary WHERE DepartmentId = ?");



            st.setDouble(1,20);
            st.setInt(2,2);

            int mudados=  st.executeUpdate();
            System.out.println("Mudanças: "+mudados);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}

