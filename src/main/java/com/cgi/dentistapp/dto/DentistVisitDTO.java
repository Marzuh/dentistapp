package com.cgi.dentistapp.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class DentistVisitDTO {

    @NotNull
    private Long dentistId;
    @NotNull
    private Long visitId;
    @Size(min = 1, max = 50)
    private String visitorId;


    public DentistVisitDTO() {
    }

    public DentistVisitDTO(Long dentistId) {
        this.dentistId = dentistId;
    }

    public DentistVisitDTO(Long dentistId, Long visitId, String visitorId) {
        this.dentistId = dentistId;
        this.visitId = visitId;
        this.visitorId = visitorId;
    }

    public Long getDentistId() {
        return dentistId;
    }

    public void setDentistId(Long dentistId) {
        this.dentistId = dentistId;
    }

    public Long getVisitId() {
        return visitId;
    }

    public void setVisitId(Long visitId) {
        this.visitId = visitId;
    }

    public String getVisitorId() {
        return visitorId;
    }

    public void setVisitorId(String visitorId) {
        this.visitorId = visitorId;
    }

}
