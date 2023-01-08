package com.codegate01.vaccovid.controller;

import com.codegate01.vaccovid.entities.Asia;
import com.codegate01.vaccovid.service.AsiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class AsiaController {

    @Autowired
    AsiaService asiaService;

    @GetMapping("asia")
    public List<Asia> getAsiaData() throws IOException {
        return asiaService.getAsiaData();
    }
}
