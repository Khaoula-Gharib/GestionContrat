package com.example.gestioncontrat.dao;

import com.example.gestioncontrat.bean.Devis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DevisDao extends JpaRepository<Devis,Long> {
}
