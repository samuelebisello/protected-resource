package com.sam.protectedresource;




import java.util.Set;


public class Users {

    private String id;
    private String name;
    private String password;
    private Set<Role> roles;

    public Users() {
    }

    public Users(String id, String name, String password, Set<Role> roles) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.roles = roles;
    }

    public Users(Users users) {
        this.id =  users.getId();
        this.name = users.getName();
        this.password = users.getPassword();
        this.roles = users.getRoles();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
