/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organizations;

import Business.Role.Role;
import Business.Role.UserAdminRole;
import java.util.ArrayList;

/**
 *
 * @author heer
 */
public class UserAdminOrganization extends Organizations {
    public UserAdminOrganization() {
        super(Type.UserAdmin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new UserAdminRole());
        return roles;
    }
}
