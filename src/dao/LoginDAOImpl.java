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
import java.util.ArrayList;
import java.util.List;
import model.Admin;
import model.Worker;
import util.DBUtil;

/**
 *
 * @author Ahme_vn75
 */
public class LoginDAOImpl implements LoginDAO{

    @Override
    public Admin checkLoginAdmin(String username, String password) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select * from adminstrator where username = ? and password = ?";
        Admin admin = new Admin();
        try{
            con = DBUtil.getConnections();
            ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            rs = ps.executeQuery();
            if (rs.next()) {
                admin.setId(rs.getInt("id"));
                admin.setName(rs.getString("name"));
                admin.setSurname(rs.getString("surname"));
                admin.setUsername(rs.getString("username"));
                admin.setPassword(rs.getString("password"));
                //admin.setLastLoginDate(rs.getDate("last_login_date").toLocalDate());
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
         DBUtil.CloseAll(con, ps, rs);
        }
        return admin;
    }

    @Override
    public Worker checkLoginWorker(String username, String password) {
         Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select * from worker where username = ? and password = ?";
        Worker worker = new Worker();
        try{
            con = DBUtil.getConnections();
            ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            rs = ps.executeQuery();
            if (rs.next()) {
                worker.setId(rs.getInt("id"));
                worker.setName(rs.getString("name"));
                worker.setSurname(rs.getString("surname"));
                worker.setGender(rs.getString("gender"));
                worker.setDate(rs.getDate("date_of_birth").toLocalDate());
                worker.setPhone(rs.getString("phone"));
                worker.setEmail(rs.getString("email"));
                worker.setPosition(rs.getString("position"));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
         DBUtil.CloseAll(con, ps, rs);
        }
        return worker;
    }
   
}
