package com.don.rssexample.model;

import org.simpleframework.xml.Element;

/**
 * Created by gideon on 29,June,2019
 * dunprek@gmail.com
 * Jakarta - Indonesia
 */
public  class Image {

    @Element(name="link", required=false)
    String link;

    @Element(name="title", required=false)
    String title;

    @Element(name="url", required=false)
    String url;

    public String getLink() {return this.link;}
    public void setLink(String value) {this.link = value;}

    public String getTitle() {return this.title;}
    public void setTitle(String value) {this.title = value;}

    public String getUrl() {return this.url;}
    public void setUrl(String value) {this.url = value;}

}
