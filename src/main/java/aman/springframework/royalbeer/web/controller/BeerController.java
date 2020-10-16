package aman.springframework.royalbeer.web.controller;

import java.util.UUID;

import org.springframework.boot.actuate.trace.http.HttpTrace.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aman.springframework.royalbeer.services.BeerService;
import aman.springframework.royalbeer.web.model.BeerDto;

@RequestMapping("/api/ver1/beer")
@RestController
public class BeerController {

	private BeerService beerService;

	public BeerController(BeerService beerService) {
		this.beerService = beerService;
	}
	
	@GetMapping({"/{beerId}"})
	public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") UUID beerId){
		return new ResponseEntity<BeerDto>(beerService.getBeerById(beerId), HttpStatus.OK);
		
	}
}
