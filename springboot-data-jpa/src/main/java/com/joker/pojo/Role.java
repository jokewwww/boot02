package com.joker.pojo;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "t_role")
public class Role {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="roleId")
    private Integer roleId;
    @Column(name="roleName")
    private String roleName;

    @OneToMany(mappedBy = "role")
    private Set<User> users=new HashSet();

    public Set<Menu> getMenus() {
        return menus;
    }

    public void setMenus(Set<Menu> menus) {
        this.menus = menus;
    }

    @ManyToMany(cascade = CascadeType.PERSIST,fetch = FetchType.EAGER)
    @JoinTable(name = "t_roles_menu",joinColumns =@JoinColumn(name = "role_id"),inverseJoinColumns = @JoinColumn(name = "menu_id"))
    private Set<Menu> menus=new HashSet();

    public Role(){}
    public Role(String roleName, Set<User> users) {
        this.roleName = roleName;
        this.users = users;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }



    @Override
    public String toString() {
        return "Role{" +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                '}';
    }
}
