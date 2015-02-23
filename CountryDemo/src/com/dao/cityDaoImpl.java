package com.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Session;

import com.hibernate.City;
import com.hibernate.Country;
import com.hibernate.State;
import com.util.HibernateUtil;

public class cityDaoImpl implements cityDao {
	
	List<Country> list=new ArrayList<Country>();
	List<State> list2=new ArrayList<State>();
	List<City> list1=new ArrayList<City>();
	
	Session session=HibernateUtil.sessionReturn();
	public List<Country> fetchCity(Country country) 
	{
		System.out.println("in daoimpl");
		Criteria cr=session.createCriteria(Country.class);
		list=cr.list();
		return list;
		
	}
	
	public List<State> ajaxStateDao(Country country, State state, int coun) {
		 country=(Country) session.load(Country.class,coun);
			Set<State> set =country.getStates();
			List<State> list2=new ArrayList<State>(set);
			
			return list2;
	}

	public List<City> ajaxCityDao(State state, City city, int stat) {
		
		state=(State) session.load(State.class,stat);
		Set<City> set =state.getCities();
		List<City> list1=new ArrayList<City>(set);
		System.out.println(list1);
		return list1;
	}

}
