package com.cgi.dentistapp.dto;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

public class DentistVisitDTO {

    @NotNull
    private Long dentistId;
    @NotNull
    private Long visitId;
    @Size(min = 1, max = 50)
    private String visitorId;

    @Size(min = 1, max = 50)
    private String dentistName;

    //  @NotNull
    //  @DateTimeFormat(pattern = "dd.MM.yyyy")
    private Date visitTime;

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

    public DentistVisitDTO(String dentistName, Date visitTime) {
        this.dentistName = dentistName;
        this.visitTime = visitTime;
    }

    public String getDentistName() {
        return dentistName;
    }

    public void setDentistName(String dentistName) {
        this.dentistName = dentistName;
    }

    public Date getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(Date visitTime) {
        this.visitTime = visitTime;
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
