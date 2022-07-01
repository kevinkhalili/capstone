package com.demo.capstoneproject.model;



import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Objects;

@Getter @Setter @ToString @Slf4j
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity
@Table(name = "issue")


public class Issue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    Long id;

    @NotNull
    @Column(name = "issue_date")
    Date issueDate;


    @Column(name= "notes")
    String notes;

    @Column(name="expected_return_date")
    Date expectedReturnDate;

    @Column(name="returned")
    Integer returned;

    ///////////////////////////////////////Warning/////////////////////////////////
    // TABLE RELATIONSHIP GOES HERE IT IS MISSING FOR NOW/////////////////////////
    //
    //
    //SO AS VALIDATION
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Issue issue = (Issue) o;
        return id.equals(issue.id) && Objects.equals(issueDate, issue.issueDate) && notes.equals(issue.notes) && expectedReturnDate.equals(issue.expectedReturnDate) && returned.equals(issue.returned);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, issueDate, notes, expectedReturnDate, returned);
    }


}
