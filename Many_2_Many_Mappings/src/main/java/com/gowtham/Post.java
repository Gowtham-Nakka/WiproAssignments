<<<<<<< HEAD
=======
<<<<<<< HEAD
package com.gowtham;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "post_table")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String address;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "post_user",
        joinColumns = @JoinColumn(name = "post_id"),
        inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private List<User> users;

    public Post() {
    }

    // Add getters and setters or use Lombok
}
=======
>>>>>>> my-feature-branch
package com.gowtham;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "post_table")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String address;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "post_user",
        joinColumns = @JoinColumn(name = "post_id"),
        inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private List<User> users;

    public Post() {
    }

    // Add getters and setters or use Lombok
}
<<<<<<< HEAD
=======
>>>>>>> af4bfed9 (added all the files)
>>>>>>> my-feature-branch
