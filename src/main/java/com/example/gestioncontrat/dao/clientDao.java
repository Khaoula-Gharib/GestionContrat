package com.example.gestioncontrat.dao;

import com.example.gestioncontrat.bean.client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface clientDao extends JpaRepository<client,Long> {
}
