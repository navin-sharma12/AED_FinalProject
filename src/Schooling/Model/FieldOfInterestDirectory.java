/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Schooling.Model;

import DataConnection.db;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author navinsharma
 */
public class FieldOfInterestDirectory 
{
    ArrayList<FieldOfInterest> field_of_interest_list = new ArrayList();

    public ArrayList<FieldOfInterest> getField_of_interest_list() {
        return field_of_interest_list;
    }

    public void setField_of_interest_list(ArrayList<FieldOfInterest> field_of_interest_list) {
        this.field_of_interest_list = field_of_interest_list;
    }
}
