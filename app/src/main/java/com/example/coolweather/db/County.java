package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

public class County extends DataSupport {
    private  int id;
    private int cityId;
    private String weatherId;
    private String countyName;
    public int getId(){
        return  id;
    }
    public void setId(int id){
        this.id=id;

    }
    public String getCountyName(){
        return countyName;
    }
    public void setCountyName(String countyName){
        this.countyName=countyName;
    }
    public String getWeatherId(){
        return weatherId;

    }
    public void setWeatherId(String weatherId){
        this.weatherId=weatherId;
    }
    public int getCityId(){
        return cityId;
    }
    public void  setCityId(int provinceId){
        this.cityId=cityId;
    }
}
