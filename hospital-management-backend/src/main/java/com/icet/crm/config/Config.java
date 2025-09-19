package com.icet.crm.config;

import com.icet.crm.entity.PatientEntity;
import com.icet.crm.model.Patient;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public ModelMapper getMap(){
        return new ModelMapper();
    }
}
