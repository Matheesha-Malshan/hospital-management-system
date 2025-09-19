package com.icet.crm.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Appointment {
    private Integer id;
    private String type;
    private String qr;
    private LocalDateTime dataTime;
    private String description;
    private String status;
    private Integer roomNumber;
    private String q_Number;
    private Integer patientId;
    private Integer adminId;
}
