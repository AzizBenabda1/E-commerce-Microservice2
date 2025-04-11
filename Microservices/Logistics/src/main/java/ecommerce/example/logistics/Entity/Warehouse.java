package ecommerce.example.logistics.Entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Warehouse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Warehouse name cannot be blank")
    @Column(nullable = false, length = 100)
    private String name;

    @NotBlank(message = "Location cannot be blank")
    @Column(nullable = false, length = 255)
    private String location;

    @Positive(message = "Capacity must be a positive number")
    private Integer capacity;

    @PositiveOrZero(message = "Current stock must be zero or positive")
    private Integer currentStock;

    @NotBlank(message = "Manager name cannot be blank")
    @Column(length = 100)
    private String managerName;

    @Column(nullable = false)
    private boolean isActive = true;

    @OneToMany(mappedBy = "warehouse", cascade = CascadeType.ALL)
    private List<Shipment> shipments;

    public Warehouse() {}

    public Warehouse(String name, String location, Integer capacity, Integer currentStock, String managerName, boolean isActive) {
        this.name = name;
        this.location = location;
        this.capacity = capacity;
        this.currentStock = currentStock;
        this.managerName = managerName;
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", capacity=" + capacity +
                ", currentStock=" + currentStock +
                ", managerName='" + managerName + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
