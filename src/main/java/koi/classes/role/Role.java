package koi.classes.role;

import koi.classes.Employee.Employee;
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


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Role() {
    }

    public Role (int id,String name) {
        this.id = id;
        this.name = name;
    }
    @OneToOne(mappedBy = "role")
    private Employee employee;
}
