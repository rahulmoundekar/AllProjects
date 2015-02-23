package com.service;

import java.util.List;

import com.hibernate.City;
import com.hibernate.Country;
import com.hibernate.State;

public interface Cityservice {
	
	public List<Country> cityService(Country country);
	public List<State> ajaxStateService(Country country,State state,int coun);
	public List<City> ajaxCityService(State state,City city,int stat);
}
