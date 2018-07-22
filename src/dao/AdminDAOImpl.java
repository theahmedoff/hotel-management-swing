/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Admin;
import util.DBUtil;

/**
 *
 * @author Ahme_vn75
 */
public class AdminDAOImpl implements AdminDAO{

    @Override
    public Admin checkLogin(String username, String password) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select * from admin where username = ? and password = ?";
        Admin admin = new Admin();
        try {
            con = DBUtil.getConnections();
            ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            rs = ps.executeQuery();
            if (rs.next()) {
                admin.setName("last_name");
                admin.setSurname("first_name");
                admin.setUsername("username");
                admin.setPassword("password");
                admin.getLastLoginDate("last_login_date");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            DBUtil.CloseAll(con, ps, null);
        }
        return admin;
    }
    
    
    
}
