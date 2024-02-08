package com.brunoduraes.certification_nlw.modules.students.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brunoduraes.certification_nlw.modules.students.dto.VerifyHasCertificationDTO;
import com.brunoduraes.certification_nlw.modules.students.services.VerifyHasCertificationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    VerifyHasCertificationService verifyHasCertificationService;

    @PostMapping("/verifyTech")
    public String verifyHasCertification(@RequestBody VerifyHasCertificationDTO verifyHasCertificatiopn ){
        try {
            if (verifyHasCertificationService.execute(verifyHasCertificatiopn)) {
                return "✅ Esse camarada já tem essa certificação.";
            }
            return "❌ Esse camarada não possui essa certificação";
        } catch (Exception e) {
            return "🐞 PERDEMO 🐞" + e.toString(); 
        }
    }
    
}
