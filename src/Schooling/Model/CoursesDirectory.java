/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Schooling.Model;

import DataConnection.db;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author navinsharma
 */
public class CoursesDirectory 
{
    ArrayList<Courses> courseslist = new ArrayList();

    public ArrayList<Courses> getCourseslist() {
        return courseslist;
    }

    public void setCourseslist(ArrayList<Courses> courseslist) {
        this.courseslist = courseslist;
    }
    
    public void addCourses(Courses c) throws SQLException
    {
        try
        {
            PreparedStatement ps = db.getPreStatement("Insert into course(category_id, course_name)" + "values (?, ?)");
            ps.setInt(1, c.getCategory_id());
            ps.setString(2, c.getCourse_name());
            ps.execute();
        }
        catch (IllegalArgumentException e) 
        {
            throw new IllegalArgumentException(e.getMessage() + "Record not saved");
        }
    }
}
