package com.demo.capstoneproject.model;


import com.sun.istack.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.util.Date;

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
    /////////////Annotations need to be modified for validation///////////
    ///////////////////////////////////////////////////////////////////////

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

    @NotNull
    /////////////////////////Ask Jafer///////////
//  @NotBlank
    @Column(name = "name")
    String name;

    @NotNull
//    @NotBlank

//     @Length(max = 4, message = "*Must not exceed 4 characters.")
    @Column(name = "short_name")
    String shortName;

    @Column(name = "notes")
//    @Length(max = 1000, message = "*Must not exceed 1000 characters.")
    String notes;

    @Column(name = "create_date")
    Date createDate;

/////////////////////////Table relationship here////////////////

}
