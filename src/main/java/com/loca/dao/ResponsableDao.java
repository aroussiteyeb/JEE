package com.loca.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loca.modal.Admin;
import com.loca.modal.Responsable;

public interface ResponsableDao extends JpaRepository<Responsable, Long> {

}
