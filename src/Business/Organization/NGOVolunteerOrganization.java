/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.NGOVolunteer;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Shah's
 */
public class NGOVolunteerOrganization extends Organization{
    public NGOVolunteerOrganization()  {
        super(Organization.Type.NGOVolunteer.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new NGOVolunteer());
        return roles;
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
