package com.brunoduraes.certification_nlw.modules.students.services;

import org.springframework.stereotype.Service;

import com.brunoduraes.certification_nlw.modules.students.dto.VerifyHasCertificationDTO;

@Service
public class VerifyHasCertificationService {
    

    public boolean execute(VerifyHasCertificationDTO dto){
        return dto.getEmail().equals("brunodur4es@gmail.com") && dto.getTech().equals("React");
    }
}
