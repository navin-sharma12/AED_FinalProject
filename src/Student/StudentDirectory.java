/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student;

import DataConnection.db;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.SQLException;

/**
 *
 * @author pikku
 */
public class StudentDirectory {

    ArrayList<Student> studentlist = new ArrayList();

    public StudentDirectory() {
//        studentlist = new ArrayList();
    }

    public ArrayList<Student> getStudentlist() {
        return studentlist;
    }

    public void setStudentlist(ArrayList<Student> studentlist) {
        this.studentlist = studentlist;
    }

    public void addStudent(Student s) throws SQLException {
        try {
            PreparedStatement ps = db.getPreStatement("Insert into student(firstname,lastname,gender,age,contact_no,dob,type,address,zipcode)" + "values (?,?,?,?,?,?,?,?,?)");
            ps.setString(1, s.getFirstname());
            ps.setString(2, s.getLastname());
            ps.setString(3, s.getGender());
            ps.setInt(4, s.getAge());
            ps.setLong(5, s.getContact_no());
            ps.setDate(6, new java.sql.Date(s.getDob().getTime()));
            ps.setString(7, s.getType());
            ps.setString(8, s.getAddress());
            ps.setString(9, s.getZipcode());
            ps.execute();
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage() + "Record not saved");
        }

    }

}
