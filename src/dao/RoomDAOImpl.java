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
import model.Room;
import util.DBUtil;

/**
 *
 * @author Ahme_vn75
 */
public class RoomDAOImpl implements RoomDAO{

    @Override
    public List<Room> getAllRoom() {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select * from room";
        List<Room> rooms = new ArrayList();
        try{
            con = DBUtil.getConnections();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Room room = new Room();
                room.setId(rs.getInt("id"));
                room.setProperty(rs.getString("property"));
                room.setType(rs.getString("room_type"));
                room.setView(rs.getString("room_view"));
                room.setAdultNo(rs.getInt("adult_no"));
                room.setChildNo(rs.getInt("child_no"));
                room.setNumber(rs.getInt("room_number"));
                room.setStatus(rs.getBoolean("status"));
                rooms.add(room);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            DBUtil.CloseAll(con, ps, rs);
        }
        return rooms;
    }

    @Override
    public boolean removeRoomRow(int id) {
        Connection con = null;
        PreparedStatement ps = null;
        String sql = "delete from room where id = ?";
        boolean result = false;
        try{
            con = DBUtil.getConnections();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            result = true;;
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            DBUtil.CloseAll(con, ps, null);
        }
        return result;
    }
    
    
    
}
