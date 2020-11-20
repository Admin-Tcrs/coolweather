package com.coolweather.android.db;
/**
 * County: 用于存放县的数据信息
 * LitePal 中的每一个实体类都必须要继承 DataSupport类
 */

import org.litepal.crud.DataSupport;

public class County extends DataSupport {
    private int id;                 //记录县的编号
    private String countyName;      //记录县的名字
    private String weatherId;       //记录县所对应的天气id
    private int cityId;             //记录当前县所属市的id值

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
