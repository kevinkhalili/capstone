package com.demo.capstoneproject.model;


import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Getter @Setter @ToString @Slf4j
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity
@Table(name = "member")

public class member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

    @NotNull
    @Column(name = "type")
    String type;

    @NotNull
    @Column(name = "first_name")
    String firstName;

    @NotNull
    @Column(name = "middle_name")
    String middleName;

    @NotNull
    @Column(name = "last_name")
    String lastName;

    @NotNull
    @Column(name = "gender")
    String gender;


    @NotNull
    @Column(name = "date_of_birth")
    Date dateOfBirth;

    @Column(name = "joining_date")
    Date joiningDate;

    @Column(name = "contact")
    String contact;

    @Column(name = "email")
    String email;

    //////////////////////////TABLE RELATIONSHIP GOES HERE IF AND ONLY IF////////////////////
    //**************VALIDATION IF IT REQUIRES**********************




}
