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
            PreparedStatement ps = db.getPreStatement("Insert into user(firstname, lastname, emailid, organization, username, password)" + "values (?,?,?,?,?,?)");
            ps.setString(1, u.getFirstname());
            ps.setString(2, u.getLastname());
            ps.setString(3, u.getEmailid());
            ps.setString(4, u.getDepartments());
            ps.setString(5, u.getUsername());
            ps.setString(6, u.getPassword());
            ps.execute();
        } 
        catch (IllegalArgumentException e) 
        {
            throw new IllegalArgumentException(e.getMessage() + "Record not saved");
        }

    }
    
    public void getUsers(Users ug) throws SQLException
    {
        try
        {
            ResultSet sq = db.selectQuery("select * from users");
//            sq.getString(1);
//            sq.execute();
            while(sq.next())
            {
                ug.setFirstname(sq.getString(1));
                ug.setLastname(sq.getString(2));
                ug.setEmailid(sq.getString(3));
                ug.setDepartments(sq.getString(4));
            }
        }
        catch (IllegalArgumentException e) 
        {
            throw new IllegalArgumentException(e.getMessage() + "Record not saved");
        }
    }
}
