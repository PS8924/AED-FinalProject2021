/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organizations;

import Business.Organizations.Organizations;
import Business.Role.PatientRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Shah's
 */
public class PharmacyAdminOrganization extends Organizations{
    public PharmacyAdminOrganization() {
        super(Organizations.Type.PharmacyAdmin.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PatientRole());
        return roles;
    }
}
