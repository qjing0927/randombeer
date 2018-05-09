package com.randombeer.randombeer.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.randombeer.randombeer.domain.Beer;
import com.randombeer.randombeer.repository.BeerRepository;

@RestController
public class BeerDisplayController {

	@Autowired
	private BeerRepository beerRepository;

	@RequestMapping(path = "/beer/{id}", method = RequestMethod.GET)
	public Optional<Beer> getBeerInfo(@PathVariable int id) {

		int minId = 1;
		int maxId = 3;
		int randomId = minId + (int) (Math.random() * (maxId - minId + 1));

		while (randomId == id) {
			randomId = minId + (int) (Math.random() * (maxId - minId + 1));
		}

		return beerRepository.findById(randomId);
	}
}
