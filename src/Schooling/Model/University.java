/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Schooling.Model;

import DataConnection.db;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author navinsharma
 */
public class University 
{
    private String university_name, course_name, category;
    private int seats, course_id, university_id;
    private ResultSet resultSet;
    
    public University(String university_name, String course_name, String category, int seats)
    {
        this.university_name = university_name;
        this.course_name = course_name;
        this.category = category;
        this.seats = seats;
    }
    
    public University(String university_name)
    {
        this.university_name = university_name;
    }
    
    public University(int course_id, int university_id, int seats)
    {
        this.course_id = course_id;
        this.university_id = university_id;
        this.seats = seats;
    }
    
    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public int getUniversity_id() {
        return university_id;
    }

    public void setUniversity_id(int university_id) {
        this.university_id = university_id;
    }

    public ResultSet getResultSet() {
        return resultSet;
    }

    public void setResultSet(ResultSet resultSet) {
        this.resultSet = resultSet;
    }

    public String getUniversity_name() {
        return university_name;
    }

    public void setUniversity_name(String university_name) {
        this.university_name = university_name;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
    
    public void addUniversity(String university_name) throws SQLException
    {
        PreparedStatement ps = db.getPreStatement("Insert into universities(university_name)" + "values (?)");
        ps.setString(1, university_name);
        ps.execute();
    }
    
    public ResultSet getUniversity()
    {
        resultSet = db.selectQuery("select * from universities");
        return resultSet;
    }
    
    public void addCoursesInUniversity(int course_id, int university_id, int seats) throws SQLException
    {
        PreparedStatement ps = db.getPreStatement("Insert into courses_in_university(course_id, university_id, seats)" + "values (?, ?, ?)");
        ps.setInt(1, course_id);
        ps.setInt(2, university_id);
        ps.setInt(3, seats);
        ps.execute();
    }
    
    public ResultSet getallUniversity()
    {
        resultSet = db.selectQuery("select * from universities");
        return resultSet;
    }
}
