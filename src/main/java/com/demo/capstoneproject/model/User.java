package com.demo.capstoneproject.model;


import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Getter @Setter @ToString @Slf4j
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity
@Table(name = "user")

public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

    @NotNull
    @Column(name = "display_name")
    String displayName;

    @NotNull
    @Column(name = "username")
    String username;

    @NotNull
    @Column(name = "password")
    String password;

    @NotNull
    @Column(name = "active")
    Integer active;

    @NotNull
    @Column(name = "role")
    String role;

    @NotNull
    @Column(name = "created_date")
    Date createDate;

    @NotNull
    @Column(name = "last_modified_date")
    Date lastModifiedDate;

    public User(@NotNull String displayName, @NotNull String username, @NotNull String password, @NotNull String role) {
        super();
        this.displayName = displayName;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id.equals(user.id) && displayName.equals(user.displayName) && username.equals(user.username) && password.equals(user.password) && active.equals(user.active) && role.equals(user.role) && createDate.equals(user.createDate) && lastModifiedDate.equals(user.lastModifiedDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, displayName, username, password, active, role, createDate, lastModifiedDate);
    }
}
