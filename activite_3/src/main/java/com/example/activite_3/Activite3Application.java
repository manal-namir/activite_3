package com.example.activite_3;

import com.example.activite_3.entities.Patient;
import com.example.activite_3.respositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class Activite3Application {

    public static void main(String[] args) {
        SpringApplication.run(Activite3Application.class, args);

    }
    //@Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository) {
        return args -> {
            patientRepository.save(new Patient(null, "Manal", new Date(), false, 141));
            patientRepository.save(new Patient(null, "Imane", new Date(), false, 151));
            patientRepository.save(new Patient(null, "Nadia", new Date(), false, 161));
            patientRepository.save(new Patient(null, "Hanane", new Date(), false, 168));
            patientRepository.save(new Patient(null, "Nabila", new Date(), false, 142));
            patientRepository.save(new Patient(null, "Othmane", new Date(), false, 124));
            //afficher la liste des patients
            patientRepository.findAll().forEach(p -> {
                System.out.println(p.getNom());
            });
        };
    }
}

