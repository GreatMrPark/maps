package com.greatmrpark.maps.cube.model;

import java.util.Objects;

public class Cube {

    private String place_id;
    private String icon;
    private String name;
    private String address;
    private String describe;
    private String link;

    private double lat;
    private double lng;

    private String photo_reference;

    public Cube() {
    }

    public Cube(String place_id, String icon, String name, String address, String describe, String link, double lat, double lng, String photo_reference) {
        this.place_id = place_id;
        this.icon = icon;
        this.name = name;
        this.address = address;
        this.describe = describe;
        this.link = link;
        this.lat = lat;
        this.lng = lng;
        this.photo_reference = photo_reference;
    }

    public String getPlace_id() {
        return place_id;
    }

    public void setPlace_id(String place_id) {
        this.place_id = place_id;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public String getPhoto_reference() {
        return photo_reference;
    }

    public void setPhoto_reference(String photo_reference) {
        this.photo_reference = photo_reference;
    }

    @Override
    public String toString() {
        return "Cube{" +
                "place_id='" + place_id + '\'' +
                ", icon='" + icon + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", describe='" + describe + '\'' +
                ", link='" + link + '\'' +
                ", lat=" + lat +
                ", lng=" + lng +
                ", photo_reference='" + photo_reference + '\'' +
                '}';
    }
}
