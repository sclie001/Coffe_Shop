package com.example.coffee;

public class Coffee {

    private String flavor;
    private String topping;
    private String sweetener;
    private String creamer;
    private String size;

    public Coffee(String creamer, String sweetener, String flavor, String size){
        this.creamer = creamer;
        this.sweetener = sweetener;
        this.flavor = flavor;
        this.size = size;

    }

    public String getCreamer() {
        return creamer;
    }

    public void setCreamer(String creamer) {
        this.creamer = creamer;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getSweetener() {
        return sweetener;
    }

    public void setSweetener(String sweetener) {
        this.sweetener = sweetener;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
