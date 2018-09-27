package com.cyf.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author cyf
 * @description
 * @create 2018-09-27 17:37
 **/
@Component
@ConfigurationProperties(prefix = "cyf")
public class ConfigProps {

    private String author;
    private String date;
    private String version;


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "author: " + author + ", date: " + date + ",version: " + version;
    }
}
