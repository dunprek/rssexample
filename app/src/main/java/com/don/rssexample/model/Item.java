package com.don.rssexample.model;

import org.simpleframework.xml.Element;

/**
 * Created by gideon on 29,June,2019
 * dunprek@gmail.com
 * Jakarta - Indonesia
 */
public class Item {

    @Element(name = "enclosure", required = false)
    Enclosure enclosure;

    @Element(name = "link", required = false)
    String link;

    @Element(name = "guid", required = false)
    String guid;

    @Element(name = "description", required = false,data = true)
    String description;


    @Element(name = "title",required = false, data = true)
    String title;

    @Element(name = "pubDate", required = false)
    String pubDate;

    public Enclosure getEnclosure() {
        return this.enclosure;
    }

    public void setEnclosure(Enclosure value) {
        this.enclosure = value;
    }

    public String getLink() {
        return this.link;
    }

    public void setLink(String value) {
        this.link = value;
    }

    public String getGuid() {
        return this.guid;
    }

    public void setGuid(String value) {
        this.guid = value;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPubDate() {
        return this.pubDate;
    }

    public void setPubDate(String value) {
        this.pubDate = value;
    }

}
