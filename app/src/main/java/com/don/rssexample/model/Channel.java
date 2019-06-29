package com.don.rssexample.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.List;

/**
 * Created by gideon on 29,June,2019
 * dunprek@gmail.com
 * Jakarta - Indonesia
 */

public class Channel {

    @Element(name="image", required=false)
    Image image;

    @ElementList(name="item", required=false, entry="item", inline=true)
    List<Item> item;

    @Element(name="link", required=false)
    String link;

    @Element(name="description", required=false)
    String description;

    @Element(name="title", required=false)
    String title;

    public Image getImage() {return this.image;}
    public void setImage(Image value) {this.image = value;}

    public List<Item> getItem() {return this.item;}
    public void setItem(List<Item> value) {this.item = value;}

    public String getLink() {return this.link;}
    public void setLink(String value) {this.link = value;}

    public String getDescription() {return this.description;}
    public void setDescription(String value) {this.description = value;}

    public String getTitle() {return this.title;}
    public void setTitle(String value) {this.title = value;}

}
