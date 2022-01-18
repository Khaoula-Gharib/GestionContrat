package com.example.gestioncontrat.dao;

import com.example.gestioncontrat.bean.LigneProduit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LigneProduitDao extends JpaRepository<LigneProduit,Long> {
}
