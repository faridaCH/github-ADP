package org.sid.data;

import org.sid.model.Devis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface DevisDAO extends JpaRepository<Devis, Long> {

}
