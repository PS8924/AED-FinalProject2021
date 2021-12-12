/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.NGOCompany;

import java.util.ArrayList;

/**
 *
 * @author Shah's
 */
public class NGODirectory {
    private ArrayList<NGOVolunteer>Companies;

    public NGODirectory() {
        Companies= new ArrayList<>();
    }

    public ArrayList<NGOVolunteer> getCompanies() {
        return Companies;
    }

    public NGOVolunteer createCompany()
    {
        NGOVolunteer i =new NGOVolunteer();
        Companies.add(i);
        return i;
    }
}
