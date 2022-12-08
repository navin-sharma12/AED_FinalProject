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
public class FieldOfInterest {

    private String field_of_interest, category;
    private ResultSet resultSet;

    public FieldOfInterest(String field_of_interest)
    {
        this.field_of_interest = field_of_interest;
    }
    
    public FieldOfInterest(String field_of_interest, String category)
    {
        this.field_of_interest = field_of_interest;
        this.category = category;
    }
    
    public FieldOfInterest()
    {
        
    }

    public String getField_of_interest() 
    {
        return field_of_interest;
    }

    public void setField_of_interest(String field_of_interest)
    {
        this.field_of_interest = field_of_interest;
    }

    public void addFieldOfInterest(String field_of_interest) throws SQLException
    {
        PreparedStatement ps = db.getPreStatement("Insert into field_of_interest(category)" + "values (?)");
        ps.setString(1, field_of_interest);
        ps.execute();
    }

    public ResultSet getFieldOfInterest(String field_of_interest)
    {
        resultSet = db.selectQuery("select * from field_of_interest where category LIKE '%" + field_of_interest + "%'");
        return resultSet;
    }
    
    public void updateFieldOfInterest(String field_of_interest, String category)
    {
        db.query("UPDATE field_of_interest set category = '"+field_of_interest+"'where category = '"+category+"'");
    }
    
    public ResultSet getallFieldOfInterest()
    {
        resultSet = db.selectQuery("select * from field_of_interest");
        return resultSet;
    }
    
    public ResultSet getIdByName(String name)
    {
        resultSet = db.selectQuery("select id from field_of_interest where category = '"+name+"'");
        return resultSet;
    }
}
