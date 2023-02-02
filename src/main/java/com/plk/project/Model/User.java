package com.plk.project.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GenericGenerator(name = "uuid",strategy = "org.hibernate.id.UUIDGenerator")
    @GeneratedValue(generator = "uuid")
    @Column(name = "user_id")
    private String id;

    @Column(name = "first_name")
    private String fname;

    @Column(name = "last_name")
    private String lname;

    @Column(name = "email")
    private String email;
}
