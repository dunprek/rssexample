package com.don.rssexample.model;

import org.simpleframework.xml.Attribute;

import java.net.URL;

/**
 * Created by gideon on 29,June,2019
 * dunprek@gmail.com
 * Jakarta - Indonesia
 */
public  class Img {

    @Attribute(name="src", required=false)
    URL src;

    @Attribute(name="width", required=false)
    Integer width;

    @Attribute(name="align", required=false)
    String align;

    @Attribute(name="hspace", required=false)
    Integer hspace;

    public URL getSrc() {return this.src;}
    public void setSrc(URL value) {this.src = value;}

    public Integer getWidth() {return this.width;}
    public void setWidth(Integer value) {this.width = value;}

    public String getAlign() {return this.align;}
    public void setAlign(String value) {this.align = value;}

    public Integer getHspace() {return this.hspace;}
    public void setHspace(Integer value) {this.hspace = value;}

}

