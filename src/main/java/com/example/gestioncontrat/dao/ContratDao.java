package com.example.gestioncontrat.dao;

import com.example.gestioncontrat.bean.Contrat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContratDao extends JpaRepository<Contrat,Long > {
}
