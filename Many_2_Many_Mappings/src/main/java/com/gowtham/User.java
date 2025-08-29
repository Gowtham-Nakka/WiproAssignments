<<<<<<< HEAD
=======
<<<<<<< HEAD
package com.gowtham;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "user_table")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany(
        mappedBy = "users", 
        cascade = CascadeType.ALL,
        fetch = FetchType.EAGER
    )
    private List<Post> posts;

    public User() {
        super();
    }

    
=======
>>>>>>> my-feature-branch
package com.gowtham;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "user_table")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany(
        mappedBy = "users", 
        cascade = CascadeType.ALL,
        fetch = FetchType.EAGER
    )
    private List<Post> posts;

    public User() {
        super();
    }

    
<<<<<<< HEAD
=======
>>>>>>> af4bfed9 (added all the files)
>>>>>>> my-feature-branch
}