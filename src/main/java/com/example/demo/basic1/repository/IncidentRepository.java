package com.example.demo.basic1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.basic1.model.Incident;

public interface IncidentRepository extends JpaRepository<Incident, Integer> {

}
