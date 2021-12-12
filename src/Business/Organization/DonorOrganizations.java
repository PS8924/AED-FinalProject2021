/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DonorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Shah's
 */
public class DonorOrganizations extends Organization{
    public DonorOrganizations() {
        super(Organization.Type.Donor.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DonorRole());
        return roles;
    }
}