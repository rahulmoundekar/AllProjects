package com.hibernate;

import java.util.HashSet;
import java.util.Set;

public class Country  implements java.io.Serializable {


    // Fields    

     private Integer countryid;
     private String countryname;
     private Set states = new HashSet(0);


    // Constructors

    /** default constructor */
    public Country() {
    }

	/** minimal constructor */
    public Country(Integer countryid, String countryname) {
        this.countryid = countryid;
        this.countryname = countryname;
    }
    
    /** full constructor */
    public Country(Integer countryid, String countryname, Set states) {
        this.countryid = countryid;
        this.countryname = countryname;
        this.states = states;
    }

   
    // Property accessors

    public Integer getCountryid() {
        return this.countryid;
    }
    
    public void setCountryid(Integer countryid) {
        this.countryid = countryid;
    }

    public String getCountryname() {
        return this.countryname;
    }
    
    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    public Set getStates() {
        return this.states;
    }
    
    public void setStates(Set states) {
        this.states = states;
    }
   








}