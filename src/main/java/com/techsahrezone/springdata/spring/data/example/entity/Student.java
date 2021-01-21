package com.techsahrezone.springdata.spring.data.example.entity;

/*
 * @created 21/01/2021 -00:38
 * @project spring-data-example
 * @author  saurabhshcs
 */


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EqualsAndHashCode
@ToString
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotNull(message = "Name can't be empty")
    private String name;

    @NotNull(message = "DOB can't be empty")
    private Date dob;
}
