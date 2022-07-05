package com.demo.capstoneproject.model;


import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Getter @Setter @ToString @Slf4j
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity
@Table(name = "member")

public class Member implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

    @NotNull
    @NotEmpty(message = "*Please select member type")
    @NotNull(message = "*Please select member type")
    @Column(name = "type")
    String type;

    @NotNull(message = "*Please enter first name")
    @NotEmpty(message = "*Please select first name")
    @Column(name = "first_name")
    String firstName;

    @NotNull(message = "*Please enter middle name")
    @NotEmpty(message = "*Please select middle name")
    @Column(name = "middle_name")
    String middleName;

    @NotNull
    @Column(name = "last_name")
    String lastName;

    @NotNull(message = "*Please select gender")
    @NotEmpty(message = "*Please select gender")
    @Column(name = "gender")
    String gender;


    @NotNull(message = "date_of_birth")
    @Column(name = "date_of_birth")
    Date dateOfBirth;

    @Column(name = "joining_date")
    Date joiningDate;

    @Column(name = "contact")
    String contact;

    @Column(name = "email")
    String email;







}
