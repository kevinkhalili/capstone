package com.demo.capstoneproject.model;


import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.util.Objects;
import java.util.logging.Level;

@Getter @Setter @ToString @Slf4j
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity
@Table(name="issued_book")

public class IssuedBook {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    long id;

    //***********************RELATIONSHIP GOES HERE*****************
    /////////////////CHECK FOR VALIDATION IF ANY////////////////////

    @Column(name = "returned")
    Integer returned;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IssuedBook that = (IssuedBook) o;
        return id == that.id && returned.equals(that.returned);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, returned);
    }
}
