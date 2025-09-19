package com.icet.crm.controller;


import com.icet.crm.model.Appointment;
import com.icet.crm.service.AppointmentService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/appointment")
@RequiredArgsConstructor

public class AppointmentController {

    final AppointmentService appointmentService;

    @PostMapping()
    public void addAppointment(@RequestBody Appointment appointment){
        appointmentService.addAppointment(appointment);
    }
}
