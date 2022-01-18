package com.example.gestioncontrat.dao;

import com.example.gestioncontrat.bean.LigneClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LigneClientDao extends JpaRepository<LigneClient,Long> {
}
