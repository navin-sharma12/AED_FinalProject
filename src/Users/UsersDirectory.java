/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Users;

import DataConnection.db;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author navinsharma
 */
public class UsersDirectory 
{
    ArrayList<Users> userslist = new ArrayList();
    
    public UsersDirectory()
    {
        this.userslist = new ArrayList<Users>();
    }

    public ArrayList<Users> getUserslist() 
    {
        return userslist;
    }

    public void setUserslist(ArrayList<Users> userslist) 
    {
        this.userslist = userslist;
    }
    
    public void addUsers(Users u) throws SQLException 
    {
        try 
        {
            PreparedStatement ps = db.getPreStatement("Insert into user(department_id, firstname, lastname, emailid, organization, username, password)" + "values (?,?,?,?,?,?,?)");
            ps.setInt(1, u.getDepartment_id());
            ps.setString(2, u.getFirstname());
            ps.setString(3, u.getLastname());
            ps.setString(4, u.getEmailid());
            ps.setString(5, u.getDepartments());
            ps.setString(6, u.getUsername());
            ps.setString(7, u.getPassword());
            ps.execute();
        } 
        catch (IllegalArgumentException e) 
        {
            throw new IllegalArgumentException(e.getMessage() + "Record not saved");
        }

    }
    
    public void getUsers() throws SQLException
    {
        try
        {
            ResultSet sq = db.selectQuery("select * from users");
            while(sq.next())
            {
                userslist.add(new Users(sq.getInt(1), 
                        sq.getInt(2), 
                        sq.getString(3), 
                        sq.getString(4), 
                        sq.getString(5), 
                        sq.getString(6)));
            }
        }
        catch (IllegalArgumentException e) 
        {
            throw new IllegalArgumentException(e.getMessage() + "Record not saved");
        }
    }
}
