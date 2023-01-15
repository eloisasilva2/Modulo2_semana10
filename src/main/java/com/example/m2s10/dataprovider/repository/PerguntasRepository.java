package com.example.m2s10.dataprovider.repository;

import com.example.m2s10.dataprovider.entity.PerguntasEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerguntasRepository extends JpaRepository<PerguntasEntity, Long> {
}
