/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Schooling.Model;

import DataConnection.db;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author navinsharma
 */
public class JobPortalStudent 
{
    int student_id, job_id;
    
    public JobPortalStudent(int student_id, int job_id)
    {
        this.student_id = student_id;
        this.job_id = job_id;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public int getJob_id() {
        return job_id;
    }

    public void setJob_id(int job_id) {
        this.job_id = job_id;
    }
    
    public void addJob(int student_id, int job_id) throws SQLException
    {
        PreparedStatement ps = db.getPreStatement("Insert into student_job_application(student_id, job_id)" + "values (?, ?)");
        ps.setInt(1, student_id);
        ps.setInt(2, job_id);
        ps.execute();
    }
}
