package com.portfolio.dev.repository;

import com.portfolio.dev.model.Visitas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitasRepository extends JpaRepository<Visitas, Long> {
}
