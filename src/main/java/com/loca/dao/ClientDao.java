package com.loca.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loca.modal.Admin;
import com.loca.modal.Client;

public interface ClientDao extends JpaRepository<Client, Long> {

}
