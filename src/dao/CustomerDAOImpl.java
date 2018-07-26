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
import model.Customer;
import util.DBUtil;

/**
 *
 * @author Ahmedov
 */
public class CustomerDAOImpl implements CustomerDAO{
    
    @Override
    public List<Customer> getAllCustomer(){
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select * from customer";
        List<Customer> customers = new ArrayList();
        try{
            con = DBUtil.getConnections();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Customer c = new Customer();
                c.setId(rs.getInt("id"));
                c.setName(rs.getString("name"));
                c.setSurname(rs.getString("surname"));
                c.setDate(rs.getDate("date_of_birth").toLocalDate());
                c.setGender(rs.getString("gender"));
                c.setAddress(rs.getString("address"));
                c.setPhone(rs.getString("number"));
                c.setEmail(rs.getString("email"));
                c.setNationality(rs.getString("nationality"));
                customers.add(c);
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }finally{
            DBUtil.CloseAll(con, ps, rs);
        }
        return customers;
    }

    @Override
    public boolean createCustomer(Customer c) {
        Connection con = null;
        PreparedStatement ps = null;
        String sql = "insert into customer(name, surname, date_of_birth,"
                + " gender, address, number, email, nationality)"
                + " values(?, ?, ?, ?, ?, ?, ?, ?)";
        boolean result = false;
        try{
            con = DBUtil.getConnections();
            ps = con.prepareStatement(sql);
            ps.setString(1, c.getName());
            ps.setString(2, c.getSurname());
            ps.setString(7, c.getEmail());
            ps.setString(4, c.getGender());
            ps.setString(8, c.getNationality());
            ps.setString(6, c.getPhone());
            ps.setString(5, c.getAddress());
            ps.setString(3, c.getDate().toString());
            ps.executeUpdate();
            result = true;
        }catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            DBUtil.CloseAll(con, ps, null);
        }
        return result;
    }
    
}
