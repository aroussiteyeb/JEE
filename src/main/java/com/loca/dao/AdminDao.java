package com.loca.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loca.modal.Admin;

public interface AdminDao extends JpaRepository<Admin, Long> {

}
