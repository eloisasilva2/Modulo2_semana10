package com.example.m2s10.dataprovider.repository;

import com.example.m2s10.dataprovider.entity.RespostaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RespostaRepository extends JpaRepository<RespostaEntity, Long> {
}