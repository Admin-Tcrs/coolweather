package com.coolweather.android.db;
/**
 * Province:用于存放省的数据信息
 * LitePal 中的每一个实体类都必须要继承 DataSupport类
 */

import org.litepal.crud.DataSupport;

public class Province extends DataSupport {
    private int id;                     //记录省的编号
    private String provinceName;        //记录省的名字
    private int provinceCode;           //记录省的代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
