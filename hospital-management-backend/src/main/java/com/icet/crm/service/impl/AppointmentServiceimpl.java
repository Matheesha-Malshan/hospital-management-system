package com.icet.crm.service.impl;

import com.icet.crm.entity.AppointmentEntity;
import com.icet.crm.model.Appointment;
import com.icet.crm.repository.AppointmentRepository;
import com.icet.crm.service.AppointmentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AppointmentServiceimpl implements AppointmentService {

    final AppointmentRepository appointmentRepository;
    final ModelMapper mapper;

    public void addAppointment(Appointment appointment){

        appointmentRepository.save(mapper.map(appointment,AppointmentEntity.class));
    }

    @Override
    public void deleteById(Integer id) {
         appointmentRepository.deleteById(id);

    }
}
