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
    private int category_id;
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
        resultSet = db.selectQuery("select field_of_interest.category, course.course_name from course inner join field_of_interest on course.category_id = field_of_interest.id");
        return resultSet;
    }
    
    public ResultSet getCourseByCategory(int category_id)
    {
        resultSet = db.selectQuery("select * from course where category_id = "+category_id);
        return resultSet;
    }
}
