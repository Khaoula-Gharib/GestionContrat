package com.example.gestioncontrat.dao;

import com.example.gestioncontrat.bean.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FournisseurDao extends JpaRepository<Fournisseur,Long> {
}
