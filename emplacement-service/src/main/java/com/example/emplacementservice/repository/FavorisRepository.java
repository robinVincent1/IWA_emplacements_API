package com.example.emplacementservice.repository;

import com.example.emplacementservice.entity.Favoris;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FavorisRepository extends JpaRepository<Favoris, Long> {
    List<Favoris> findByUserId(Long idUser);
    Optional<Favoris> findByUserIdAndEmplacementId(Long idUser, Long idEmplacement);
}

