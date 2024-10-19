package koi.classes.KoiService;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="Koi_Service")
public class KoiService {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Getter @Setter
    @Column(name = "Name")
    private String name;

    @Getter @Setter
    @Column(name = "Price")
    private double price;

    @Getter @Setter
    @Column(name = "image")
    private String image;

    @Getter @Setter
    @Column(name="Description")
    private String description;

    @Getter @Setter
    @Column(name = "Address")
    private String address;

    @ManyToMany(mappedBy = "koiServices")
    private Set<Order_Service> orderService = new HashSet<>();

    public KoiService(String name, double price, String image, String description, String address) {
        this.name = name;
        this.price = price;
        this.image = image;
        this.description = description;
        this.address = address;
    }

    public KoiService() {
        super();
    }

}
