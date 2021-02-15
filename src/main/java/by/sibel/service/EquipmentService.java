package by.sibel.service;

import by.sibel.equipment.Equipment;


import java.util.List;

/**
 * Service interface for {@link Equipment} class.
 *
 * @author Ruslan Baigolov
 * @version 1.0
 */

public interface EquipmentService {

    Equipment getById(Long id);

    void save(Equipment equipment);

    void delete(Long id);

    void sendMessage(Equipment equipment);

    void callMessage(Equipment equipment);

    void callMessageToTL(Equipment equipment);

    List<Equipment> getAll();
}