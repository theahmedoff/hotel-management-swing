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
                w.setName(rs.getString("name"));
                w.setSurname(rs.getString("surname"));
                w.setEmail(rs.getString("email"));
                workers.add(w);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            DBUtil.CloseAll(con, ps, rs);
        }
        return workers;
    }
    
}
