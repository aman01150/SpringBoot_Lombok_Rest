package aman.springframework.royalbeer.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import aman.springframework.royalbeer.web.model.BeerDto;

@Service
public class BeerServiceImpl implements BeerService{

	@Override
	public BeerDto getBeerById(UUID beerId) {
		return BeerDto.builder().id(UUID.randomUUID()).beerName("Royal Stag").beerBrand("Royal Banglore").build();
	}

}
