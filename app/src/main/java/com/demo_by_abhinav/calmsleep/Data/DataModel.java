package com.demo_by_abhinav.calmsleep.Data;

public class DataModel {

    String  benefits, desc, drawbacks, name, time;

    public DataModel() {
    }

    public DataModel(String benefits, String desc, String drawbacks, String name, String time) {

        this.benefits = benefits;
        this.desc = desc;
        this.drawbacks = drawbacks;
        this.name = name;
        this.time = time;
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDrawbacks() {
        return drawbacks;
    }

    public void setDrawbacks(String drawbacks) {
        this.drawbacks = drawbacks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
