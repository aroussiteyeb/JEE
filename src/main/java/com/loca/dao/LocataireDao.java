package com.loca.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loca.modal.Admin;
import com.loca.modal.Locataire;

public interface LocataireDao extends JpaRepository<Locataire, Long> {

}
