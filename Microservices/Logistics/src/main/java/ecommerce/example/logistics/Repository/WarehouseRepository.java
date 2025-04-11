package ecommerce.example.logistics.Repository;

import ecommerce.example.logistics.Entity.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WarehouseRepository extends JpaRepository<Warehouse, Long> {
}
