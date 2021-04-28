package com.cgi.dentistapp.service;

import com.cgi.dentistapp.entity.Dentist;
import com.cgi.dentistapp.repository.DentistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DentistService {

    private final DentistRepository dentistRepository;

    public DentistService(DentistRepository dentistRepository) {
        this.dentistRepository = dentistRepository;
    }

    public List<Dentist> getAllDentists() {
        return dentistRepository.findAll();
    }

    public Dentist getDentistById(Long id){
        return dentistRepository.getOne(id);
    }

    public void saveOrUpdate(Dentist dentist){
        dentistRepository.save(dentist);
    }

    public void delete(Long id){
        dentistRepository.delete(id);
    }


    /**
     * add data to database at each  new spring start
     */
    @EventListener(ApplicationReadyEvent.class)
    public void addDentistData() {
        Dentist dentist = new Dentist();
        dentist.setFirstName("Ivan");
        dentist.setLastName("Ivanov");
        dentist.setLicenceId("EE123456");
        dentistRepository.save(dentist);

        Dentist dentist2 = new Dentist();
        dentist2.setFirstName("Jaan");
        dentist2.setLastName("Sepp");
        dentist2.setLicenceId("EE111111");
        dentistRepository.save(dentist2);

        Dentist dentist3 = new Dentist();
        dentist3.setFirstName("John");
        dentist3.setLastName("Smith");
        dentist3.setLicenceId("EE987654");
        dentistRepository.save(dentist3);
    }
}
