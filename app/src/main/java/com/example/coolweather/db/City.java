package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

public class City extends DataSupport {
    private  int id;
    private int cityCode;
    private int provinceId;
    private String cityName;
    public int getId(){
        return  id;
    }
    public void setId(int id){
        this.id=id;

    }
    public String getCityName(){
        return cityName;
    }
    public void setCityName(){
        this.cityName=cityName;
    }
    public int getCityCode(){
        return cityCode;

    }
    public void setCityCode(){
        this.cityCode=cityCode;
    }
    public int getProvinceId(){
        return provinceId;
    }
    public void  setProvinceId(int provinceId){
        this.provinceId=provinceId;
    }
}
