package org.sid.data;

import org.sid.model.Admin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface AdminDAO extends JpaRepository<Admin, Long> {

}
