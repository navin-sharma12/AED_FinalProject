/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Users;

import DataConnection.db;
import java.sql.ResultSet;
import java.sql.SQLException;

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
    
    public Users(int id,  String firstname, String lastname, String emailid, String departments,String username ) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.emailid = emailid;
        this.departments = departments;
        this.username = username;
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

//    get User query
    public ResultSet getAllDepartmentUser(int depart_id) throws SQLException {
        try {
            System.out.println("select * from user where department_id = '" + depart_id + "'");
            ResultSet resultset = db.selectQuery("select * from user where department_id = '" + depart_id + "'");
            System.out.println(resultset);
            return resultset;
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage() + "Record not found");
        }

    }
}
