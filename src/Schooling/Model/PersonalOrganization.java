/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Schooling.Model;

import DataConnection.db;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author navinsharma
 */
public class PersonalOrganization {

    String first_name, last_name, emailid, zoom_link, username, password;
    int category, course, seats;
    ResultSet resultSet;

    public PersonalOrganization(String first_name, String last_name, String emailid, int category, int course, String zoom_link, int seats, String username, String password) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.emailid = emailid;
        this.category = category;
        this.course = course;
        this.zoom_link = zoom_link;
        this.seats = seats;
        this.username = username;
        this.password = password;
    }

    public PersonalOrganization() {

    }

    public PersonalOrganization(String emailid) {
        this.emailid = emailid;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getZoom_link() {
        return zoom_link;
    }

    public void setZoom_link(String zoom_link) {
        this.zoom_link = zoom_link;
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

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void addFreeLancer(String first_name, String last_name, String emailid, int category_id, int course_id, String zoom_link, int seats, String username, String password) throws SQLException {
        PreparedStatement ps = db.getPreStatement("Insert into free_lancer(first_name, last_name, email_id, category_id, course_id, zoom_link, seats, username, password)" + "values (?, ?, ?, ?, ?, ?, ?, ?)");
        ps.setString(1, first_name);
        ps.setString(2, last_name);
        ps.setString(3, emailid);
        ps.setInt(4, category_id);
        ps.setInt(5, course_id);
        ps.setString(6, zoom_link);
        ps.setInt(7, seats);
        ps.setString(8, username);
        ps.setString(9, password);
        ps.execute();
    }

    public ResultSet getallPO() {
        resultSet = db.selectQuery("select free_lancer.id, free_lancer.first_name, free_lancer.last_name, free_lancer.email_id, field_of_interest.category, course.course_name, free_lancer.zoom_link, free_lancer.seats from field_of_interest inner join free_lancer on free_lancer.category_id = field_of_interest.id inner join course on free_lancer.course_id = course.id;");
        return resultSet;
    }

    public void deletePO(String emailid) throws SQLException {
        PreparedStatement ps = db.getPreStatement("delete from free_lancer where email_id = ?");
        ps.setString(1, emailid);
        ps.execute();
    }

    public ResultSet checkLogin(String email, String password) {
        try {
            System.out.println(email);
            System.out.println(password);
            ResultSet rs = db.selectQuery("select * from free_lancer where email_id = '" + email + "' and password = '" + password + "'");
            return rs;
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage() + "Record not found");
        }

    }

    public ResultSet getFreelancerByCourseId(int id) {
        try {

            ResultSet rs = db.selectQuery("select * from free_lancer where course_id = '" + id + "'");
            return rs;
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage() + "Record not found");
        }
    }

    public ResultSet getFreelancerIdByName(String firstname, String lastname) {
        try {

            ResultSet rs = db.selectQuery("select * from free_lancer where first_name = '" + firstname + "' and last_name = '" + lastname + "'");
            return rs;
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage() + "Record not found");
        }
    }

    public void updateSeats(int id, int seats) throws SQLException {
        try {

            PreparedStatement ps = db.getPreStatement("update free_lancer set seats = ? where id = ?");
            ps.setInt(1, seats);
            ps.setInt(2, id);
            ps.execute();
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage() + "Record not found");
        }

    }

    public ResultSet getAllFreeLancer() {
        try {

            ResultSet rs = db.selectQuery("SELECT f.first_name, f.last_name,c.course_name,f.seats FROM free_lancer as f Left join course as c ON f.course_id = c.id ;");
            return rs;
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage() + "Record not found");
        }

    }
}
