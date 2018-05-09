package com.randombeer.randombeer.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.randombeer.randombeer.domain.Beer;

@Transactional
public interface BeerRepository extends JpaRepository<Beer, Integer> {

}
