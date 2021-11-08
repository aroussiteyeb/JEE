package com.loca.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loca.modal.Admin;
import com.loca.modal.Contrat;

public interface ContratDao extends JpaRepository<Contrat, Long> {

}
