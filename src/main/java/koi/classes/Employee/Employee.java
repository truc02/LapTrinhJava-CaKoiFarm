package koi.classes.Employee;

import koi.classes.User.User;
import koi.classes.role.Role;

import javax.persistence.*;

@Entity
@Table(name = "EMPLOYEES")

public class Employee extends User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name ="MSNV")
    private String msn;

    @Column(name = "FullName")
    private String fullName;

    @Column(name = "position")
    private String position;

    @Column(name = "salary")
    private double salary;

    @Column(name = "Phone")
    private String phone;

    @Column(name = "Email")
    private String email;

    @Column(name = "Address")
    private String address;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name ="role_id",referencedColumnName = "id")
    private Role role;

    public Employee() {
        super();
    }

    public Employee(String username, String fullname, String birthday, String password, String image, String address, String phone,
                    String email, int id, String msn, String fullName, String position, double salary, String phone1,
                    String email1, String address1, Role role) {
        super(username, fullname, birthday, password, image, address, phone, email);
        this.id = id;
        this.msn = msn;
        this.fullName = fullName;
        this.position = position;
        this.salary = salary;
        this.phone = phone1;
        this.email = email1;
        this.address = address1;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public String getMsn() {
        return msn;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMsn(String msn) {
        this.msn = msn;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }
}