package by.sibel.service;

import by.sibel.equipment.Equipment;

import by.sibel.repository.EquipmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class EquipServiceImpl implements EquipmentService{

    @Autowired
    EquipmentRepository equipmentRepository;

    @Override
    public Equipment getById(Long id) {
//        log.info("IN EquipmentServiceImpl getById {}", id);
        return equipmentRepository.findOne(id);
    }

    @Override
    public void save(Equipment equipment) {
//        log.info("IN EquipmentServiceImpl save {}", equipment);
        equipmentRepository.save(equipment);

    }

    @Override
    public void delete(Long id) {
//        log.info("IN EquipmentServiceImpl delete {}", id);
        equipmentRepository.delete(id);

    }

    @Override
    public void sendMessage(Equipment equipment) {
//        log.info("IN EquipmentServiceImpl send message {}", equipment);
    }

    @Override
    public void callMessage(Equipment equipment) {
//        log.info("IN EquipmentServiceImpl call message {}", equipment);
    }

    @Override
    public void callMessageToTL(Equipment equipment) {
//        log.info("IN EquipmentServiceImpl call message to team lead {}", equipment);
    }

    @Override
    public List<Equipment> getAll() {
//        log.info("IN CustomerServiceImpl getAll");
        return equipmentRepository.findAll();
    }
}
