package com.don.rssexample.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.net.URL;
import java.util.List;

@Root(name="rss")
public class Rss {
    @Element(name="channel", required=false)
    Channel channel;

    @Attribute(name="version", required=false)
    Double version;

    public Channel getChannel() {return this.channel;}
    public void setChannel(Channel value) {this.channel = value;}

    public Double getVersion() {return this.version;}
    public void setVersion(Double value) {this.version = value;}




}