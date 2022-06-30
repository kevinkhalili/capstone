package com.demo.capstoneproject.model;


import com.sun.istack.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.Objects;

@Getter @Setter @ToString @Slf4j
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity
@Table(name = "category")

public class Category {

    //Declaring data members with annotations

    //*************Warning**************
    //*************Warning**************
    /////////////Annotations need to be modified/completed for validation///////////
    ///classes for validation imported for this entity but must be completed
    ///////////////////////////////////////////////////////////////////////

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

    @NotNull
    @NotBlank
    @Column(name = "name")
    String name;

    @NotNull
    @NotBlank
    @Length(max = 4, message = "*Must not exceed 4 characters.")
    @Column(name = "short_name")
    String shortName;

    @Column(name = "notes")
    @Length(max = 1000, message = "*Must not exceed 1000 characters.")
    String notes;

    @Column(name = "create_date")
    Date createDate;

/////////////////////////Table relationship here////////////////


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return id.equals(category.id) && Objects.equals(name, category.name) && Objects.equals(shortName, category.shortName) && notes.equals(category.notes) && createDate.equals(category.createDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, shortName, notes, createDate);
    }
}
