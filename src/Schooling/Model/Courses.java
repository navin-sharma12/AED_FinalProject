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
public class Courses 
{

    private String course_name;
    private int category_id, course_id;
    private ResultSet resultSet;

    public Courses(int category_id, String course_name) 
    {
        this.course_name = course_name;
        this.category_id = category_id;
    }
    
    public Courses(int category_id) 
    {
        this.category_id = category_id;
    }
    
    public Courses()
    {
        
    }
    
    public Courses(String course_name, int course_id)
    {
        this.course_name = course_name;
        this.course_id = course_id;
    }

    public int getCategory_id() 
    {
        return category_id;
    }

    public void setCategory_id(int category_id) 
    {
        this.category_id = category_id;
    }

    public String getCourse_name() 
    {
        return course_name;
    }

    public void setCourse_name(String course_name) 
    {
        this.course_name = course_name;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public ResultSet getResultSet() {
        return resultSet;
    }

    public void setResultSet(ResultSet resultSet) {
        this.resultSet = resultSet;
    }

    public void addCourses(int category_id, String course_name) throws SQLException 
    {
        PreparedStatement ps = db.getPreStatement("Insert into course(category_id, course_name)" + "values (?, ?)");
        ps.setInt(1, category_id);
        ps.setString(2, course_name);
        ps.execute();
    }
    
    public ResultSet getallFOI()
    {
        resultSet = db.selectQuery("select * from field_of_interest");
        return resultSet;
    }
    
    public ResultSet getCourses()
    {
        resultSet = db.selectQuery("select course.id, field_of_interest.category, course.course_name from course inner join field_of_interest on course.category_id = field_of_interest.id");
        return resultSet;
    }
    
    public ResultSet getCourseByCategory(int category_id)
    {
        resultSet = db.selectQuery("select * from course where category_id = "+category_id);
        return resultSet;
    }
    
    public void updateCourses(String course_name, int course_id)
    {
        db.query("UPDATE field_of_interest set course_name = '"+course_name+"' where id = '"+course_id+"'");
    }
    
    public ResultSet getCourseIdByName(String name)
    {
         resultSet = db.selectQuery("select id from course where course_name = '"+name+"'");
         return resultSet;
    }
    
    public ResultSet findSeats(int course_id,int university_id)
    {
        resultSet = db.selectQuery("select seats from courses_in_university where course_id = '"+course_id+"' AND university_id = '"+university_id+"'");
        return resultSet;
    }
    
    
}
