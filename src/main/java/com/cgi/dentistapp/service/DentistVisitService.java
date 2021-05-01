package com.cgi.dentistapp.service;

import com.cgi.dentistapp.entity.Dentist;
import com.cgi.dentistapp.entity.DentistVisitEntity;
import com.cgi.dentistapp.repository.DentistVisitRepository;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
@Transactional
public class DentistVisitService {
    private DentistVisitRepository dentistVisitRepository;

    public DentistVisitService(DentistVisitRepository dentistVisitRepository) {
        this.dentistVisitRepository = dentistVisitRepository;
    }

    public List<DentistVisitEntity> getAllDentistVisit() {
        return dentistVisitRepository.findAll();
    }

    public Optional<DentistVisitEntity> getDentistVisitById(Long id) {
        return Optional.ofNullable(dentistVisitRepository.findOne(id));
    }

    public void saveOrUpdate(DentistVisitEntity dentistVisitEntity) {
        dentistVisitRepository.save(dentistVisitEntity);
    }

    public void delete(Long id) {
        dentistVisitRepository.delete(id);
    }

    //TODO change to correct request to DB
    public List<DentistVisitEntity> getRegisteredVisits(){
        return getAllDentistVisit().stream()
                .filter(dentistVisitEntity -> dentistVisitEntity.isBooked())
                .collect(Collectors.toList());
    }

    public List<DentistVisitEntity> getAllFreeDentistVisits() {
        return getAllDentistVisit().stream()
                .filter(dentistVisitEntity -> !dentistVisitEntity.isBooked())
                .collect(Collectors.toList());
    }

    public void addVisit(Long dentistId, Long visitId, String visitorId) {
       // DentistVisitEntity dve =  dentistVisitRepository.getOne(visitId);
        DentistVisitEntity dve = dentistVisitRepository.findDentistVisitEntityById(visitId);
        dve.setBooked(true);
        dve.setVisitorId(visitorId);
        dentistVisitRepository.save(dve);
    }

    public boolean isVisitAvailable(Long visitId){
        return  !dentistVisitRepository.findDentistVisitEntityById(visitId).isBooked();
    }

    public List<DentistVisitEntity> getVisitsById(Long id){
       return dentistVisitRepository.findDentistVisitEntitiesById(id);
    }
    /**
     * For test purpose
     * add visits times to temporary database at each  new spring start
     */
    @EventListener(ApplicationReadyEvent.class)
    public void addDentistVisits() {
        /**
         * visits to dentist id1 (Ivanov)
         */
        DentistVisitEntity dentistVisitEntity1 = new DentistVisitEntity();
        dentistVisitEntity1.setDentistId(1L);
        dentistVisitEntity1.setVisitTime(Instant.parse("2021-06-01T10:00:00.00Z"));
        dentistVisitEntity1.setBooked(false);
        dentistVisitRepository.save(dentistVisitEntity1);

        DentistVisitEntity dentistVisitEntity2 = new DentistVisitEntity();
        dentistVisitEntity2.setDentistId(1L);
        dentistVisitEntity2.setVisitTime(Instant.parse("2021-06-01T11:00:00.00Z"));
        dentistVisitEntity2.setBooked(false);
        dentistVisitRepository.save(dentistVisitEntity2);

        DentistVisitEntity dentistVisitEntity3 = new DentistVisitEntity();
        dentistVisitEntity3.setDentistId(1L);
        dentistVisitEntity3.setVisitTime(Instant.parse("2021-06-02T11:00:00.00Z"));
        dentistVisitEntity3.setBooked(false);
        dentistVisitRepository.save(dentistVisitEntity3);

        DentistVisitEntity dentistVisitEntity4 = new DentistVisitEntity();
        dentistVisitEntity4.setDentistId(1L);
        dentistVisitEntity4.setVisitTime(Instant.parse("2021-06-02T12:00:00.00Z"));
        dentistVisitEntity4.setBooked(false);
        dentistVisitRepository.save(dentistVisitEntity4);

        /**
         * Visits for dentist id2 (Sepp)
         */
        DentistVisitEntity dentistVisitEntity5 = new DentistVisitEntity();
        dentistVisitEntity5.setDentistId(2L);
        dentistVisitEntity5.setVisitTime(Instant.parse("2021-06-01T13:00:00.00Z"));
        dentistVisitEntity5.setBooked(false);
        dentistVisitRepository.save(dentistVisitEntity5);

        DentistVisitEntity dentistVisitEntity6 = new DentistVisitEntity();
        dentistVisitEntity6.setDentistId(2L);
        dentistVisitEntity6.setVisitTime(Instant.parse("2021-06-02T15:00:00.00Z"));
        dentistVisitEntity6.setBooked(false);
        dentistVisitRepository.save(dentistVisitEntity6);

        DentistVisitEntity dentistVisitEntity7 = new DentistVisitEntity();
        dentistVisitEntity7.setDentistId(2L);
        dentistVisitEntity7.setVisitTime(Instant.parse("2021-06-03T12:00:00.00Z"));
        dentistVisitEntity7.setBooked(false);
        dentistVisitRepository.save(dentistVisitEntity7);

        /**
         * Visits for dentist id3 (Smith)
         */
        DentistVisitEntity dentistVisitEntity8 = new DentistVisitEntity();
        dentistVisitEntity8.setDentistId(3L);
        dentistVisitEntity8.setVisitTime(Instant.parse("2021-06-01T16:00:00.00Z"));
        dentistVisitEntity8.setBooked(false);
        dentistVisitRepository.save(dentistVisitEntity8);

        DentistVisitEntity dentistVisitEntity9 = new DentistVisitEntity();
        dentistVisitEntity9.setDentistId(3L);
        dentistVisitEntity9.setVisitTime(Instant.parse("2021-06-01T17:00:00.00Z"));
        dentistVisitEntity9.setBooked(false);
        dentistVisitRepository.save(dentistVisitEntity9);

        DentistVisitEntity dentistVisitEntity10 = new DentistVisitEntity();
        dentistVisitEntity10.setDentistId(3L);
        dentistVisitEntity10.setVisitTime(Instant.parse("2021-06-01T18:00:00.00Z"));
        dentistVisitEntity10.setBooked(false);
        dentistVisitRepository.save(dentistVisitEntity10);
    }


}
