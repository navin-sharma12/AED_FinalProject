/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Investor;

import DataConnection.db;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author richapatel
 */
public class Investor {

    String firstname, lastname, organization, email, password, username;
    int id, isLocal, isGovernment, donated_funds, remaining_funds;
    long contact_no;

    public Investor(String firstname, String lastname, String email, String password, String username, int isLocal, int donated_funds, long contact_no) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.username = username;
        this.isLocal = isLocal;
        this.donated_funds = donated_funds;
        this.contact_no = contact_no;
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

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getIsLocal() {
        return isLocal;
    }

    public void setIsLocal(int isLocal) {
        this.isLocal = isLocal;
    }

    public int getIsGovernment() {
        return isGovernment;
    }

    public void setIsGovernment(int isGovernment) {
        this.isGovernment = isGovernment;
    }

    public int getDonated_funds() {
        return donated_funds;
    }

    public void setDonated_funds(int donated_funds) {
        this.donated_funds = donated_funds;
    }

    public int getRemaining_funds() {
        return remaining_funds;
    }

    public void setRemaining_funds(int remaining_funds) {
        this.remaining_funds = remaining_funds;
    }

    public long getContact_no() {
        return contact_no;
    }

    public void setContact_no(long contact_no) {
        this.contact_no = contact_no;
    }

    public void addLocalInvestors(Investor in) throws SQLException
{
  try {
            PreparedStatement ps = db.getPreStatement("Insert into investors(firstname, lastname, email, contact_no, password,isLocal, username, donated_funds)" + "values (?,?,?,?,?,?,?,?)");
 ps.setString(1, in.getFirstname());
 ps.setString(2,in.getLastname());
 ps.setString(3,in.getEmail());
 ps.setString(4,String.valueOf(in.getContact_no()));
 ps.setString(5, in.getPassword());
 ps.setInt(6, in.getIsLocal());
 ps.setString(7, in.getUsername());
 ps.setInt(8, in.getDonated_funds());

        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage() + "Record not saved");
        }

    }

}
