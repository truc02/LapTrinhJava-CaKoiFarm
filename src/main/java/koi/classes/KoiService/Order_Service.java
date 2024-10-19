package koi.classes.KoiService;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Order_Service")
public class Order_Service {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "Order_date")
    private LocalDate order_date;

    @Column(name = "Recevice_date")
    private LocalDate recevice_date;

    @Column(name = "Status")
    private boolean status;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "Order_Service_Detail",
            joinColumns = @JoinColumn(name = "Order_Service_Id"),
            inverseJoinColumns = @JoinColumn(name = "KoiService_id"))
    private Set<KoiService> koiServices = new HashSet<>();

    // Getter and Setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getOrder_date() {
        return order_date;
    }

    public void setOrder_date(LocalDate order_date) {
        this.order_date = order_date;
    }

    public LocalDate getRecevice_date() {
        return recevice_date;
    }

    public void setRecevice_date(LocalDate recevice_date) {
        this.recevice_date = recevice_date;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Set<KoiService> getKoiServices() {
        return koiServices;
    }

    public void setKoiServices(Set<KoiService> koiServices) {
        this.koiServices = koiServices;
    }
}
