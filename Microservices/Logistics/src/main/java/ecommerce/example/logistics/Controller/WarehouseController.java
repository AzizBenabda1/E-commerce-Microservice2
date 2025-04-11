package ecommerce.example.logistics.Controller;


import ecommerce.example.logistics.Entity.Warehouse;
import ecommerce.example.logistics.Service.WarehouseService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/warehouses")
public class WarehouseController {

    private final WarehouseService warehouseService;

    public WarehouseController(WarehouseService warehouseService) {
        this.warehouseService = warehouseService;
    }

    @GetMapping
    public List<Warehouse> getAll() {
        return warehouseService.getAllWarehouses();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Warehouse> getById(@PathVariable Long id) {
        return ResponseEntity.ok(warehouseService.getWarehouseById(id));
    }

    @PostMapping
    public ResponseEntity<Warehouse> create(@Valid @RequestBody Warehouse warehouse) {
        return ResponseEntity.ok(warehouseService.createWarehouse(warehouse));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Warehouse> update(@PathVariable Long id, @Valid @RequestBody Warehouse warehouse) {
        return ResponseEntity.ok(warehouseService.updateWarehouse(id, warehouse));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        warehouseService.deleteWarehouse(id);
        return ResponseEntity.noContent().build();
    }
}

