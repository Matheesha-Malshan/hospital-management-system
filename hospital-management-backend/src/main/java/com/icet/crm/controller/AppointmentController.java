package com.icet.crm.controller;


import com.icet.crm.model.Appointment;
import com.icet.crm.service.AppointmentService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/appointment")
@RequiredArgsConstructor

public class AppointmentController {

    final AppointmentService appointmentService;

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void addAppointment(@RequestBody Appointment appointment){
        appointmentService.addAppointment(appointment);
    }
    @PostMapping("/update")
    @ResponseStatus(HttpStatus.OK)
    public void updateAppointment(@RequestBody Appointment appointment){
        appointmentService.addAppointment(appointment);
    }
    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteAppointment(@PathVariable Integer id){
        appointmentService.deleteById(id);
    }
}
