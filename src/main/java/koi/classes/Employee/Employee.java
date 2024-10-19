package koi.classes.Employee;

import koi.classes.User.User;

import javax.persistence.*;

@Entity
@Table(name = "EMPLOYEES")
public class Employee extends User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    public Employee() {
        super();
    }

    public Employee(String username, String fullname, String birthday, String password,
                    String image, String address, String phone, String email) {
        super(username, fullname, birthday, password, image, address, phone, email);
    }

}