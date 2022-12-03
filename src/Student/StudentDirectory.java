/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student;

import DataConnection.db;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author pikku
 */
public class StudentDirectory {

    private ArrayList<Student> studentlist;

    public StudentDirectory() {
        this.studentlist = new ArrayList<Student>();
    }

    public ArrayList<Student> getStudentlist() {
        return studentlist;
    }

    public void setStudentlist(ArrayList<Student> studentlist) {
        this.studentlist = studentlist;
    }

//    public void addStudent(Student s) throws SQLException {
//        try {
//            PreparedStatement ps = db.getPreStatement("Insert into student(firstname,lastname,gender,age,contact_no,dob,type,address,zipcode)" + "values (?,?,?,?,?,?,?,?,?)");
//            ps.setString(1, s.getFirstname());
//            ps.setString(2, s.getLastname());
//            ps.setString(3, s.getGender());
//            ps.setInt(4, s.getAge());
//            ps.setLong(5, s.getContact_no());
//            ps.setDate(6, new java.sql.Date(s.getDob().getTime()));
//            ps.setString(7, s.getType());
//            ps.setString(8, s.getAddress());
//            ps.setString(9, s.getZipcode());
//            ps.execute();
//        } catch (IllegalArgumentException e) {
//            throw new IllegalArgumentException(e.getMessage() + "Record not saved");
//        }
//
//    }

//    public void getStudent() throws SQLException {
//        try {
//            ResultSet resultSet = db.selectQuery("select * from student");
//            while (resultSet.next()) 
//            {
//                studentlist.add(new Student(resultSet.getInt(1),
//                        resultSet.getString(2),
//                        resultSet.getString(3),
//                        resultSet.getString(6),
//                        resultSet.getInt(5),
//                        resultSet.getLong(7),
//                       resultSet.getDate(8),
//                        resultSet.getString(13),
//                        resultSet.getString(15),
//                        resultSet.getString(16)));
//            }
//           
//
//        } catch (IllegalArgumentException e) {
//            throw new IllegalArgumentException(e.getMessage() + "Record not found");
//        }
//
//    }

}
