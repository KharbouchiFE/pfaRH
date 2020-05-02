package com.pfa.reservationhoteliere.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pfa.reservationhoteliere.entity.Regime;

public interface IRegimeRepository extends JpaRepository<Regime,Integer>{
Regime findById(int id);
}
