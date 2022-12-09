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
public class JobPortal 
{
    String company_name, job_title, job_type, location, job_description, category;
    ResultSet resultSet;
    int id;
    
    public JobPortal(String company_name, String job_title, String category, String job_type, String location, String job_description)
    {
        this.company_name = company_name;
        this.job_title = job_title;
        this.category = category;
        this.job_type = job_type;
        this.location = location;
        this.job_description = job_description;
    }
    
    public JobPortal()
    {
        
    }
    
    public JobPortal(int id, String company_name, String job_title, String category, String job_type, String location, String job_description)
    {
        this.id = id;
        this.company_name = company_name;
        this.job_title = job_title;
        this.category = category;
        this.job_type = job_type;
        this.location = location;
        this.job_description = job_description;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public String getJob_type() {
        return job_type;
    }

    public void setJob_type(String job_type) {
        this.job_type = job_type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getJob_description() {
        return job_description;
    }

    public void setJob_description(String job_description) {
        this.job_description = job_description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ResultSet getResultSet() {
        return resultSet;
    }

    public void setResultSet(ResultSet resultSet) {
        this.resultSet = resultSet;
    }

    public void addJob(String company_name, String job_title, String category, String job_type, String location, String job_description) throws SQLException 
    {
        PreparedStatement ps = db.getPreStatement("Insert into jobs(company_name, job_title, category, job_type, location, job_description)" + "values (?, ?, ?, ?, ?, ?)");
        ps.setString(1, company_name);
        ps.setString(2, job_title);
        ps.setString(3, category);
        ps.setString(4, job_type);
        ps.setString(5, location);
        ps.setString(6, job_description);
        ps.execute();
    }
    
    public ResultSet getallJobs()
    {
        resultSet = db.selectQuery("select * from jobs");
        return resultSet;
    }
    
    public void updateJob(int id, String company_name, String job_title, String category, String job_type, String location, String job_description)
    {
//        PreparedStatement ps = db.getPreStatement("UPDATE jobs set company_name = ?, job_title = ?, category = ?, job_type = ?, location = ?, job_description = ?, where id = ?");
//        ps.setString(1, company_name);
//        ps.setString(2, job_title);
//        ps.setString(3, category);
//        ps.setString(4, job_type);
//        ps.setString(5, location);
//        ps.setString(6, job_description);
//        ps.setInt(7, id);
//        ps.execute();
        db.query("UPDATE jobs set company_name = '"+company_name+"', job_title = '"+job_title+"', category = '"+category+"', job_type = '"+job_type+"', location = '"+location+"', job_description = '"+job_description+"', where id = '"+id+"'");
    }
}
