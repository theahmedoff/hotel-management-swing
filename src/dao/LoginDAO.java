/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Admin;
import model.Worker;

/**
 *
 * @author Ahme_vn75
 */
public interface LoginDAO {
    
    
    
    Admin checkLoginAdmin(String username, String password);
    Worker checkLoginWorker(String username, String password);
    
}
