package fr.wild.Hackaton.service;

import fr.wild.Hackaton.model.Phone;
import fr.wild.Hackaton.repository.PhoneDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PhoneService {

    @Autowired
    PhoneDAO phoneDAO;

    public List<Phone> findAll(){
        return phoneDAO.findAll();
    }

    public Optional<Phone> findById(long id){
        return phoneDAO.findById(id);
    }

    public Phone postPhone(Phone phone){
        return phoneDAO.save(phone);
    }


}
