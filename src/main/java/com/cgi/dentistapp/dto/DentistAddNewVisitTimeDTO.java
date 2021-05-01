package com.cgi.dentistapp.dto;

import javax.validation.constraints.NotNull;
import java.time.Instant;

public class DentistAddNewVisitTimeDTO {


    private String firstName;
    private String lastName;
    private String licenceId;
    private Instant visitTime;

    public DentistAddNewVisitTimeDTO() {
    }

    public DentistAddNewVisitTimeDTO(String firstName, String lastName, String licenceId, Instant visitTime) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.licenceId = licenceId;
        this.visitTime = visitTime;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLicenceId() {
        return licenceId;
    }

    public void setLicenceId(String licenceId) {
        this.licenceId = licenceId;
    }

    public Instant getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(Instant visitTime) {
        this.visitTime = visitTime;
    }
}
