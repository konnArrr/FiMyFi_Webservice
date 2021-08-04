package de.kluk.fimyfi_webservice.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;


@Entity(name = "user")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String password;
    private boolean adminRights;
    @Column(columnDefinition = "TIMESTAMP")
    private LocalDate registerDate;

    public User() {
    }

    public User(int id, String username, String password, boolean adminRights, LocalDate registerDate) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.adminRights = adminRights;
        this.registerDate = registerDate;
    }

    public User(String username, String password, boolean adminRights, LocalDate registerDate) {
        this.username = username;
        this.password = password;
        this.adminRights = adminRights;
        this.registerDate = registerDate;
    }

    public User(String username, String password, boolean adminRights) {
        this.username = username;
        this.password = password;
        this.adminRights = adminRights;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdminRights() {
        return adminRights;
    }

    public void setAdminRights(boolean adminRights) {
        this.adminRights = adminRights;
    }

    public LocalDate getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(LocalDate registerDate) {
        this.registerDate = registerDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", adminRights=" + adminRights +
                ", registerDate=" + registerDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && adminRights == user.adminRights && Objects.equals(username, user.username) && Objects.equals(password, user.password) && Objects.equals(registerDate, user.registerDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, adminRights, registerDate);
    }
}
