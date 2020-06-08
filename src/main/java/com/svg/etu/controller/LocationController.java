package com.svg.etu.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.svg.etu.location.LocationService;

@RestController
@RequestMapping("/location")
public class LocationController {
	@Autowired
	LocationService locationService;
	
	@RequestMapping(method=RequestMethod.GET, value="/{sigugun}")
	public int getLocation(@PathVariable(value="sigugun")String sigugun) throws IOException {
		return locationService.getLocation(sigugun);
	}
}
