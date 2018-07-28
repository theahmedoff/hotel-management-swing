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
import model.Worker;
import util.DBUtil;

/**
 *
 * @author Ahmedov
 */
public class WorkerDAOImpl implements WorkerDAO{
    
    public List<Worker> getAllWorker(){
    
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select * from worker";
        List<Worker> workers = new ArrayList();
        try{
            con = DBUtil.getConnections();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Worker w = new Worker();
                w.setId(rs.getInt("id"));
                w.setName(rs.getString("name"));
                w.setSurname(rs.getString("surname"));
                w.setGender(rs.getString("gender"));
                w.setDate(rs.getDate("date_of_birth").toLocalDate());
                w.setEmail(rs.getString("email"));
                w.setPhone(rs.getString("phone"));
                w.setAddress(rs.getString("address"));
                w.setSalary(rs.getString("salary"));
                w.setUsername(rs.getString("username"));
                w.setPassword(rs.getString("password"));
                workers.add(w);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            DBUtil.CloseAll(con, ps, rs);
        }
        return workers;
    }

    @Override
    public boolean createWorker(Worker w) {
        Connection con = null;
        PreparedStatement ps = null;
        String sql = "insert into worker(name, surname, email, gender, phone,"
                + " salary, address, date_of_birth, username, password)"
                + " values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        boolean result = false;
        try{
            con = DBUtil.getConnections();
            ps = con.prepareStatement(sql);
            ps.setString(1, w.getName());
            ps.setString(2, w.getSurname());
            ps.setString(3, w.getEmail());
            ps.setString(4, w.getGender());
            ps.setString(5, w.getPhone());
            ps.setString(6, w.getSalary());
            ps.setString(7, w.getAddress());
            ps.setString(8, w.getDate().toString());
            ps.setString(9, w.getUsername());
            ps.setString(10, w.getPassword());
            ps.executeUpdate();
            result = true;
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            DBUtil.CloseAll(con, ps, null);
        }
        return result;
    }

    @Override
    public boolean removeWorkerTableRow(int id) {
        Connection con = null;
        PreparedStatement ps = null;
        String sql = "delete from worker where id = ?";
        boolean result = false;
        try{
            con = DBUtil.getConnections();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            result = true;
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            DBUtil.CloseAll(con, ps, null);
        }
        return result;
    }
    
}
