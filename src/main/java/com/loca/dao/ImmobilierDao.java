package com.loca.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loca.modal.Admin;
import com.loca.modal.Immobilier;

public interface ImmobilierDao extends JpaRepository<Immobilier, Long> {

}
