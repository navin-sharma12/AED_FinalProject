/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Users;

import DataConnection.db;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
/**
 *
 * @author navinsharma
 */
public class Users {

    private String firstname, lastname, emailid, departments, username, password;
    private int department_id, id;

    public Users(int department_id, String firstname, String lastname, String emailid, String departments, String username, String password) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.emailid = emailid;
        this.departments = departments;
        this.username = username;
        this.password = password;
        this.department_id = department_id;
    }

    public Users(int id, int department_id, String firstname, String lastname, String emailid, String departments) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.emailid = emailid;
        this.departments = departments;
        this.department_id = department_id;
    }
    
//    public Users(int id, int department_id, String firstname, String lastname, String emailid, String departments) {
//        this.id = id;
//        this.firstname = firstname;
//        this.lastname = lastname;
//        this.emailid = emailid;
//        this.departments = departments;
//        this.department_id = department_id;
//    }
    
//    Created for update users
    public Users(int id, int department_id,String firstname, String lastname, String emailid, String departments,String username,String password) {
        this.id = id;
        this.department_id = department_id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.emailid = emailid;
        this.departments = departments;
        this.username = username;
        this.password = password;
    }

    public Users() {
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getDepartments() {
        return departments;
    }

    public void setDepartments(String departments) {
        this.departments = departments;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return firstname;
    }
    
//    add User
    
     public void addUser(Users us) throws SQLException {
        try {
             
          
            PreparedStatement ps = db.getPreStatement("Insert into user(department_id, firstname, lastname, emailid, organization, username, password)" + "values (?,?,?,?,?,?,?)");
                ps.setInt(1, us.getDepartment_id());
                ps.setString(2, us.getFirstname());
                ps.setString(3, us.getLastname());
                ps.setString(4, us.getEmailid());
                ps.setString(5, us.getDepartments());
                ps.setString(6, us.getUsername());
                ps.setString(7, us.getPassword());
                ps.execute();
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage() + "Record not saved");
        }

    } 
    

//    get User query
    public ResultSet getAllDepartmentUser(int depart_id) throws SQLException {
        try {
            ResultSet resultset = db.selectQuery("select * from user where department_id = '" + depart_id + "'");
            return resultset;
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage() + "Record not found");
        }

    }
    
//    delete User
    public void deleteUser(int id) throws SQLException{
        try{
            PreparedStatement ps = db.getPreStatement("delete from user where id = ?");
                ps.setInt(1, id);
                ps.execute(); 
        }
        catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage() + "Record not saved");
        }
    }
    
//    update user
    public void updateUser(Users us) throws SQLException 
    {
        try 
        {
            PreparedStatement ps = db.getPreStatement("update user set department_id = ?, firstname = ?, lastname = ?, emailid = ?, organization = ?, username = ?, password = ? where id = ?");
            ps.setInt(1, us.getDepartment_id());
            ps.setString(2, us.getFirstname());
            ps.setString(3, us.getLastname());
            ps.setString(4, us.getEmailid());
            ps.setString(5, us.getDepartments());
            ps.setString(6, us.getUsername());
            ps.setString(7, us.getPassword());
            ps.setInt(8, us.getId());
            ps.execute();
        } 
        catch (IllegalArgumentException e) 
        {
            throw new IllegalArgumentException(e.getMessage() + "Record not saved");
        }
    }
    
    //    get User query
    public ResultSet getUserbyEmailid(String emailid) throws SQLException 
    {
        try 
        {
            ResultSet resultset = db.selectQuery("select * from user where emailid = '" + emailid + "'");
            return resultset;
        } 
        catch (IllegalArgumentException e)
        {
            throw new IllegalArgumentException(e.getMessage() + "Record not found");
        }

    }
    
//    sent email
//    public boolean sentEmail(String email,String university){
//        Properties properties = new Properties();
//        properties.put("mail.smtp.auth", "true");
//        properties.put("mail.smtp.starttls.enable","true");
//        properties.put("mail.smtp.host", "smtp.gmail.com");
//        properties.put("mail.smtp.port", "587");
//        Session session = Session.get
//    }
}
