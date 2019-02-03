package fr.wild.Hackaton.repository;

import fr.wild.Hackaton.model.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneDAO extends JpaRepository <Phone, Long> {
}
