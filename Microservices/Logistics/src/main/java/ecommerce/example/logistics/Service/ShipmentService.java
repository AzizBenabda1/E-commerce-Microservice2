package ecommerce.example.logistics.Service;

import ecommerce.example.logistics.Entity.Shipment;
import ecommerce.example.logistics.Repository.ShipmentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class ShipmentService {

    private final ShipmentRepository shipmentRepository;

<<<<<<< HEAD
    // ✅ Injection par constructeur (bonne pratique)
=======

>>>>>>> e20a847 (addition of another entity  on Fehd branch)
    public ShipmentService(ShipmentRepository shipmentRepository) {
        this.shipmentRepository = shipmentRepository;
    }

    public List<Shipment> getAllShipments() {
        return shipmentRepository.findAll();
    }

    public Optional<Shipment> getShipmentById(Long id) {
        return shipmentRepository.findById(id);
    }

    public Shipment createShipment(Shipment shipment) {
        return shipmentRepository.save(shipment);
    }

    public Shipment updateShipment(Long id, Shipment updatedShipment) {
        return shipmentRepository.findById(id)
                .map(shipment -> {
                    shipment.setTrackingNumber(updatedShipment.getTrackingNumber());
                    shipment.setCarrier(updatedShipment.getCarrier());
                    shipment.setStatus(updatedShipment.getStatus());
                    shipment.setDestination(updatedShipment.getDestination());
                    shipment.setEstimatedDeliveryDate(updatedShipment.getEstimatedDeliveryDate());
                    return shipmentRepository.save(shipment);
<<<<<<< HEAD
                }).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Shipment with ID " + id + " not found")); // ✅ Exception gérée directement ici
=======
                }).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Shipment with ID " + id + " not found"));
>>>>>>> e20a847 (addition of another entity  on Fehd branch)
    }

    public void deleteShipment(Long id) {
        if (!shipmentRepository.existsById(id)) {
<<<<<<< HEAD
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Shipment with ID " + id + " not found"); // ✅ Exception inline
=======
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Shipment with ID " + id + " not found");
>>>>>>> e20a847 (addition of another entity  on Fehd branch)
        }
        shipmentRepository.deleteById(id);
    }
}
