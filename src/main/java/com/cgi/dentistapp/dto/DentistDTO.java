package com.cgi.dentistapp.dto;

import javax.validation.constraints.NotNull;

public class DentistDTO {
    @NotNull
    private Long dentistId;

    public DentistDTO() {
    }

    public DentistDTO(Long dentistId) {
        this.dentistId = dentistId;
    }

    public Long getDentistId() {
        return dentistId;
    }

    public void setDentistId(Long dentistId) {
        this.dentistId = dentistId;
    }
}
