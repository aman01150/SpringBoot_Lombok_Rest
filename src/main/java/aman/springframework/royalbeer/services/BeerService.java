package aman.springframework.royalbeer.services;

import java.util.UUID;

import aman.springframework.royalbeer.web.model.BeerDto;

public interface BeerService {
BeerDto getBeerById(UUID beerId);
}
