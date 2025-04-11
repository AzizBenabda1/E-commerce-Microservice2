package ecommerce.example.logistics.Service;



import ecommerce.example.logistics.Entity.Warehouse;
import ecommerce.example.logistics.Repository.WarehouseRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarehouseService {

    private final WarehouseRepository warehouseRepository;

    public WarehouseService(WarehouseRepository warehouseRepository) {
        this.warehouseRepository = warehouseRepository;
    }

    public List<Warehouse> getAllWarehouses() {
        return warehouseRepository.findAll();
    }

    public Warehouse getWarehouseById(Long id) {
        return warehouseRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Warehouse not found with ID: " + id));
    }

    public Warehouse createWarehouse(Warehouse warehouse) {
        return warehouseRepository.save(warehouse);
    }

    public Warehouse updateWarehouse(Long id, Warehouse updatedWarehouse) {
        Warehouse existing = getWarehouseById(id);

        existing.setName(updatedWarehouse.getName());
        existing.setLocation(updatedWarehouse.getLocation());
        existing.setCapacity(updatedWarehouse.getCapacity());
        existing.setCurrentStock(updatedWarehouse.getCurrentStock());
        existing.setManagerName(updatedWarehouse.getManagerName());
        existing.setIsActive(updatedWarehouse.isIsActive());

        return warehouseRepository.save(existing);
    }

    public void deleteWarehouse(Long id) {
        if (!warehouseRepository.existsById(id)) {
            throw new EntityNotFoundException("Warehouse not found with ID: " + id);
        }
        warehouseRepository.deleteById(id);
    }
}
