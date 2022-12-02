/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System_Admin;

import Schooling.Model.CoursesDirectory;
import Schooling.Model.FieldOfInterest;
import Schooling.Model.UniversityDirectory;
import Student.StudentDirectory;
import Users.UsersDirectory;

/**
 *
 * @author navinsharma
 */
public class System_Admin 
{
    private UsersDirectory users_directory;
    private StudentDirectory student_directory;
    private CoursesDirectory courses_directory;
    private FieldOfInterest field_of_interest_directory;
    private UniversityDirectory university_directory;
    
    public System_Admin()
    {
        this.users_directory = users_directory;
        this.student_directory = student_directory;
        this.courses_directory = courses_directory;
        this.field_of_interest_directory = field_of_interest_directory;
        this.university_directory = university_directory;
    }

    public UsersDirectory getUsers_directory() {
        return users_directory;
    }

    public void setUsers_directory(UsersDirectory users_directory) {
        this.users_directory = users_directory;
    }

    public StudentDirectory getStudent_directory() {
        return student_directory;
    }

    public void setStudent_directory(StudentDirectory student_directory) {
        this.student_directory = student_directory;
    }

    public CoursesDirectory getCourses_directory() {
        return courses_directory;
    }

    public void setCourses_directory(CoursesDirectory courses_directory) {
        this.courses_directory = courses_directory;
    }

    public FieldOfInterest getField_of_interest_directory() {
        return field_of_interest_directory;
    }

    public void setField_of_interest_directory(FieldOfInterest field_of_interest_directory) {
        this.field_of_interest_directory = field_of_interest_directory;
    }

    public UniversityDirectory getUniversity_directory() {
        return university_directory;
    }

    public void setUniversity_directory(UniversityDirectory university_directory) {
        this.university_directory = university_directory;
    }
}