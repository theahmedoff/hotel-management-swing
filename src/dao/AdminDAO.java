/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Admin;

/**
 *
 * @author Ahme_vn75
 */
public interface AdminDAO {
    
    Admin checkLogin(String username, String password);
    
}
