package com.app.student.entity;

import jakarta.persistence.*;
import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "details")
public class Student {

    @Id  //unique id
    private String id;
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="email")
    private String email;
}
