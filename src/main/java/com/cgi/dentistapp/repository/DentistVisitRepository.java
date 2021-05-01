package com.cgi.dentistapp.repository;

import com.cgi.dentistapp.entity.DentistVisitEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DentistVisitRepository extends JpaRepository<DentistVisitEntity, Long> {

    @Query("select dve from DentistVisitEntity dve where dve.dentistId=:dentistId")
    List<DentistVisitEntity> findDentistVisitEntitiesById(@Param("dentistId") Long dentistId);

    @Query("select dve from DentistVisitEntity dve where dve.id=:id")
    DentistVisitEntity findDentistVisitEntityById(@Param("id") Long id);

    
}