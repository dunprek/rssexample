package com.don.rssexample.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

/**
 * Created by gideon on 29,June,2019
 * dunprek@gmail.com
 * Jakarta - Indonesia
 */


public class Description {

    @Attribute(name="img",required = false)
    Img img;



    @Element(name="#cdata-section", required=false)
    String cdataSection;

    public Img getImg() {return this.img;}
    public void setImg(Img value) {this.img = value;}


    public String getCdataSection() {return this.cdataSection;}
    public void setCdataSection(String value) {this.cdataSection = value;}

}
