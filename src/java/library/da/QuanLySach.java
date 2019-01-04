/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.da;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import library.entity.Sach;

/**
 *
 * @author T-ash
 */
public class QuanLySach {   

    private static PreparedStatement timTheoMa;

    public static PreparedStatement gettimTheoMa() throws ClassNotFoundException, SQLException {
        if (timTheoMa == null) {
            Connection connection = DBConnection.getConnection();
            
            timTheoMa = connection.prepareStatement("select");
        }
        return timTheoMa;
    }
    
    public List<Sach> getSachByMa(String keyword) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
