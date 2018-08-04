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
import model.Booking;
import model.Customer;
import model.Room;
import util.DBUtil;

/**
 *
 * @author Ahme_vn75
 */
public class BookingDAOImpl implements BookingDAO{

    @Override
    public List<Booking> getAllBoking() {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select b.id as BID, b.check_in, b.check_out, r.id \n" +
        "as RID, r.property, r.room_type, r.room_view, r.adult_no, r.child_no, r.room_number, r.status, c.id \n" +
        "as CID, c.name, c.surname, c.date_of_birth, c.gender, c.address, c.number, c.email, c.nationality\n" +
        "from booking b inner join room r on b.room_id = r.id inner join customer c on b.customer_id = c.id";
        List<Booking> list = new ArrayList();
        try{
            con = DBUtil.getConnections();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Booking b = new Booking();
                b.setId(rs.getInt("BID"));
                b.setCheckIN(rs.getTimestamp("check_in") == null ? null : rs.getTimestamp("check_in").toLocalDateTime());
                b.setCheckOUT(rs.getTimestamp("check_out") == null ? null : rs.getTimestamp("check_out").toLocalDateTime());
                b.setStatus(rs.getBoolean("status"));
                Room r = new Room();
                r.setId(rs.getInt("RID"));
                r.setProperty(rs.getString("property"));
                r.setType(rs.getString("room_type"));
                r.setView(rs.getString("room_view"));
                r.setId(rs.getInt("adult_no"));
                r.setId(rs.getInt("child_no"));
                r.setNumber(rs.getInt("room_number"));
                b.setRoom(r);
                Customer c = new Customer();
                c.setId(rs.getInt("CID"));
                c.setName(rs.getString("name"));
                c.setSurname(rs.getString("surname"));
                c.setDate(rs.getDate("date_of_birth").toLocalDate());
                c.setGender(rs.getString("gender"));
                c.setAddress(rs.getString("address"));
                c.setPhone(rs.getString("number"));
                c.setEmail(rs.getString("email"));
                c.setNationality(rs.getString("nationality"));
                b.setCustomer(c);
                list.add(b);
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }finally{
            DBUtil.closeAll(con, ps, rs);
        }
        return list;
    }
    
}
