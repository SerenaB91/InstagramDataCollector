/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.du.bi.serena.instagramdatacollector.dto;

/**
 *
 * @author Serena
 */
public class CommentAnaysis {

    private String comment;

    private String imageURL;

    private String locationName;

    private String cityName;

    private String countryName;

    public CommentAnaysis(String comment, String imageURL, String locationName, String cityName, String countryName) {
        this.comment = comment;
        this.imageURL = imageURL;
        this.locationName = locationName;
        this.cityName = cityName;
        this.countryName = countryName;
    }

    @Override
    public String toString() {
        return comment + ";" + imageURL + ";" + locationName + ";" + cityName + ";" + countryName+"\n";
    }
    
    
}
