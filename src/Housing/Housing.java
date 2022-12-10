/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Housing;

import DataConnection.db;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author pikku
 */
public class Housing {

    private int id, university_id, is_on_campus, is_off_campus, total_slots, remaining_slots, zipcode;

    public int getUniversity_id() {
        return university_id;
    }

    public void setUniversity_id(int university_id) {
        this.university_id = university_id;
    }

    public Housing(int is_on_campus, int is_off_campus, int university_id, int total_slots, int zipcode, String address) {
        this.is_on_campus = is_on_campus;
        this.is_off_campus = is_off_campus;
        this.university_id = university_id;
        this.total_slots = total_slots;
        this.zipcode = zipcode;
        this.address = address;
    }

    public Housing() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIs_on_campus() {
        return is_on_campus;
    }

    public void setIs_on_campus(int is_on_campus) {
        this.is_on_campus = is_on_campus;
    }

    public int getIs_off_campus() {
        return is_off_campus;
    }

    public void setIs_off_campus(int is_off_campus) {
        this.is_off_campus = is_off_campus;
    }

    public int getTotal_slots() {
        return total_slots;
    }

    public void setTotal_slots(int total_slots) {
        this.total_slots = total_slots;
    }

    public int getRemaining_slots() {
        return remaining_slots;
    }

    public void setRemaining_slots(int remaining_slots) {
        this.remaining_slots = remaining_slots;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    private String address;

    public void addHousing(Housing h) throws SQLException {
        try {
            PreparedStatement ps = db.getPreStatement("Insert into housing(university_id,is_on_campus,is_off_campus,total_slots,address,zipcode)" + "values (?,?,?,?,?,?)");
            ps.setInt(1, h.getUniversity_id());
            ps.setInt(2, h.getIs_on_campus());
            ps.setInt(3, h.getIs_off_campus());
            ps.setInt(4, h.getTotal_slots());
            ps.setString(5, h.getAddress());
            ps.setInt(6, h.getZipcode());
            ps.execute();
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage() + "Record not saved");
        }
    }

    public ResultSet getHousingByUniversityAndType(int id, String type) throws SQLException {
        try {
            ResultSet rs;
            if (type.equalsIgnoreCase("On Campus")) {
                System.out.println("entered housing");
                rs = db.selectQuery("Select * from housing where university_id = '" + id + "' and is_on_campus = 1");
            } else {

                rs = db.selectQuery("Select * from housing where university_id = '" + id + "' and is_off_campus = 1");

            }

            return rs;
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage() + "Record not saved");
        }
    }

    public ResultSet getHousingDataByName(String name) throws SQLException {
        try {
            ResultSet rs;
            rs = db.selectQuery("Select id,address,zipcode,total_slots from housing where address = '" + name + "'");
            return rs;
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage() + "Record not saved");
        }

    }

    public void updateHousingSlots(int id, int slots) throws SQLException {
        try {
            System.out.println(slots);
              System.out.println(id);
             PreparedStatement ps = db.getPreStatement("update housing set total_slots = ? where id = ? ");
             ps.setInt(1, slots);
             ps.setInt(2, id);
             ps.execute();
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage() + "Record not saved");
        }
    }
}
