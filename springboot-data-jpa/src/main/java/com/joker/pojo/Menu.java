package com.joker.pojo;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="t_menu")
public class Menu {

    @Id
    @Column(name = "menuId")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer menuId;

    @Column(name="menuName")
    private String menuName;

    @Column(name="menuUrl")
    private String menuUrl;

    @Column(name="fatherId")
    private Integer fatherId;

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    @ManyToMany(mappedBy = "menus")
    private Set<Role> roles=new HashSet();

    public Menu(){}

    public Menu(String menuName, String menuUrl, Integer fatherId) {
        this.menuName = menuName;
        this.menuUrl = menuUrl;
        this.fatherId = fatherId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public Integer getFatherId() {
        return fatherId;
    }

    public void setFatherId(Integer fatherId) {
        this.fatherId = fatherId;
    }
}
