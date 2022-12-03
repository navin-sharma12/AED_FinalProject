/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student;

import DataConnection.db;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;


/**
 *
 * @author pikku
 */
public class Student {
    private int id;
    private String firstname;
    private String lastname;
    private String email;
    private String gender;
    private int age;
    private long contact_no;
    private Date dob;
//    private int university_name; doubt
    private int course_id;
    private String job_status;
    private String education_status;
    private String type;
    private String housing_type;
    private String address;
    private int zipcode;
    private String university_id;
    private String school_id;
    
    
    
    public Student(String firstname,String lastname,String gender,int age,long contact_no,Date dob,String type,String address,int zipcode)
    {
        System.out.println("entered");
        System.out.println(dob);
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.age = age;
        this.contact_no = contact_no;
        this.dob = dob;
        this.type = type;
        this.address = address;
        this.zipcode = zipcode;
        System.out.println("this dob" + this.dob);
    }
    
    public Student(int id,String firstname,String lastname,String gender,int age,long contact_no,Date dob,String type,String address,int zipcode)
    {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.age = age;
        this.contact_no = contact_no;
        this.dob = dob;
        this.type = type;
        this.address = address;
        this.zipcode = zipcode;
    }        

    public Student() {
    }
            
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getContact_no() {
        return contact_no;
    }

    public void setContact_no(long contact_no) {
        this.contact_no = contact_no;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public String getJob_status() {
        return job_status;
    }

    public void setJob_status(String job_status) {
        this.job_status = job_status;
    }

    public String getEducation_status() {
        return education_status;
    }

    public void setEducation_status(String education_status) {
        this.education_status = education_status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHousing_type() {
        return housing_type;
    }

    public void setHousing_type(String housing_type) {
        this.housing_type = housing_type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

   

    public String getUniversity_id() {
        return university_id;
    }

    public void setUniversity_id(String university_id) {
        this.university_id = university_id;
    }

    public String getSchool_id() {
        return school_id;
    }

    public void setSchool_id(String school_id) {
        this.school_id = school_id;
    }
    
    
    public void addStudent(Student s) throws SQLException {
        try {
             System.out.print("Inside dob");
            System.out.print(s.getDob());
            PreparedStatement ps = db.getPreStatement("Insert into student(firstname,lastname,gender,age,contact_no,dob,type,address,zipcode)" + "values (?,?,?,?,?,?,?,?,?)");
            ps.setString(1, s.getFirstname());
            ps.setString(2, s.getLastname());
            ps.setString(3, s.getGender());
            ps.setInt(4, s.getAge());
            ps.setLong(5, s.getContact_no());
            ps.setDate(6, new java.sql.Date(s.getDob().getTime()));
            ps.setString(7, s.getType());
            ps.setString(8, s.getAddress());
            ps.setInt(9, s.getZipcode());
            ps.execute();
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage() + "Record not saved");
        }

    }
    
    public ResultSet getStudent() throws SQLException {
        try {
            ResultSet resultSet = db.selectQuery("select * from student");
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
           return resultSet;

        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage() + "Record not found");
        }

    }
    
}
