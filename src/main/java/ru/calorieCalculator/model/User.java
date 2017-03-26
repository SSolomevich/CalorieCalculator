package ru.calorieCalculator.model;

import java.util.Date;
/**
 * Created by 15 on 25.03.2017.
 * Экземпляр класса модели представляет собой одного пользователя.
 */
public class User {
    private Long id;
    private String login;
    private String name;
    private String email;
    private Date birthDate;
    private Boolean active;

    public User() {

    }

    public User(String login, String name, String email, Date birthDate, Boolean active) {
        this.login = login;
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
        this.active = active;
    }

    public Long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public Boolean getActive() {
        return active;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
