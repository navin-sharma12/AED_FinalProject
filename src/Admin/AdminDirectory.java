/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Admin;

import DataConnection.db;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author pikku
 */
public class AdminDirectory {

    private ArrayList<Admin> admin_list;

    public AdminDirectory() {
        this.admin_list = new ArrayList<Admin>();
    }

    public ArrayList<Admin> getAdmin_list() {
        return admin_list;
    }

    public void setAdmin_list(ArrayList<Admin> admin_list) {
        this.admin_list = admin_list;
    }

    public void getAdminList() throws SQLException {
        try {
            ResultSet resultSet = db.selectQuery("select * from admin");
            while (resultSet.next()) {
                admin_list.add(new Admin(resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4))
                );

            }
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage() + "Record not found");
        }
    }

    public boolean checkLogin(String username, String password, String department) {

        for (Admin am :admin_list) {

            if (am.getUsername().equals(username) && am.getPassword().equals(password) && am.getRole().equals(department)) {
                return true;
            } 
        }
        return false;
    }

}
