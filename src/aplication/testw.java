package aplication;


import db.DB;
import db.DbIntegrityException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class testw {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement st = null;

        try {
            con = DB.getCon();
            st = con.prepareStatement("DELETE FROM department WHERE Id = ?");

            st.setInt(1,2);

            int mudados=  st.executeUpdate();
            System.out.println("Mudanças: "+mudados);
        }catch (SQLException e){
            throw new DbIntegrityException(e.getMessage());
        }finally {
            DB.fecharinserindo(st);
            DB.fecharConexao();
        }
    }
}

