package koi.classes.role;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "ROLES")

public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name")
    private String name;


    public Role() {
    }

    public Role (int id,String name) {
        this.id = id;
        this.name = name;
    }

}
