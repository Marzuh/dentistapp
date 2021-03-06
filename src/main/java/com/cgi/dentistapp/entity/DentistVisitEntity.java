package com.cgi.dentistapp.entity;

import javax.persistence.*;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

@Entity
@Table(name = "dentist_visit")
public class DentistVisitEntity {

    public DentistVisitEntity() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="dentist_id")
    private Long dentistId;

    @Column(name="visit_time")
    private Instant visitTime;

    @Column(name="visitor_id")
    private String VisitorId;

    @Column(name="is_booked")
    private boolean booked;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDentistId() {
        return dentistId;
    }

    public void setDentistId(Long dentistId) {
        this.dentistId = dentistId;
    }

    public Instant getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(Instant visitTime) {
        this.visitTime = visitTime;
    }

    public String getVisitorId() {
        return VisitorId;
    }

    public void setVisitorId(String visitorId) {
        VisitorId = visitorId;
    }

    public boolean isBooked() {
        return booked;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }

    public String getVisitTimeToString(){
        DateTimeFormatter formatter =
                DateTimeFormatter.ofLocalizedDateTime( FormatStyle.SHORT )
                        .withLocale( Locale.UK)
                        .withZone( ZoneId.systemDefault() );
        return formatter.format(visitTime);
    }
}
