package com.hibernate;

import java.util.HashSet;
import java.util.Set;

public class City  implements java.io.Serializable {


    // Fields    

     private Integer cityid;
     private State state;
     private String cityname;
    
     // Constructors

    /** default constructor */
    public City() {
    }

	/** minimal constructor */

   
    // Property accessors

    public Integer getCityid() {
        return this.cityid;
    }
    
    public void setCityid(Integer cityid) {
        this.cityid = cityid;
    }

    public State getState() {
        return this.state;
    }
    
    public void setState(State state) {
        this.state = state;
    }

    public String getCityname() {
        return this.cityname;
    }
    
    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

   }