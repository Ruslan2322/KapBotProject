package by.sibel.repository;

import by.sibel.equipment.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for {@link Equipment} class.
 *
 * @author Ruslan Baigolov
 * @version 1.0
 */

public interface EquipmentRepository extends JpaRepository<Equipment, Long> {
}
