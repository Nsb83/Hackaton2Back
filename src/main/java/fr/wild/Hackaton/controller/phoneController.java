package fr.wild.Hackaton.controller;

import fr.wild.Hackaton.model.Phone;
import fr.wild.Hackaton.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
@RequestMapping("phone")

public class phoneController {
    @Autowired
    PhoneService phoneService;

    @GetMapping(path = "/findAll", produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Phone> findAll(){
        return phoneService.findAll();
    }

    @PostMapping(path= "/post", consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ArrayList<Phone> postPhone(@RequestBody ArrayList<Phone> phone) {
        for(int i = 0; i < phone.size(); i++){
            Phone phone1 = phoneService.postPhone(phone.get(i));
        }
        return phone;
    }

//    @GetMapping(path = "/findbyNote", produces = {MediaType.APPLICATION_JSON_VALUE})
//    public List<Phone> findAll(@PathVariable("id") long id){
//        return phoneService.findAll(id);
//    }


}
