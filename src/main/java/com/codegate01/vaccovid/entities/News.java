package com.codegate01.vaccovid.entities;

import java.io.Serial;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "news_id",
        "title",
        "link",
        "urlToImage",
        "imageInLocalStorage",
        "imageFileName",
        "pubDate",
        "content",
        "reference"
})
@Entity(name = "News")
public class News implements Serializable{
    @JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "recordID", nullable = false)
    private Long recordId;
    @Column(name = "news_id")
    @JsonProperty("news_id")
    public String newsId;
    @Column(name = "title")
    @JsonProperty("title")
    public String title;
    @Column(name = "link")
    @JsonProperty("link")
    public String link;
    @Column(name = "urlToImage")
    @JsonProperty("urlToImage")
    public String urlToImage;
    @Column(name = "imageInLocalStorage")
    @JsonProperty("imageInLocalStorage")
    public String imageInLocalStorage;
    @Column(name = "imageFileName")
    @JsonProperty("imageFileName")
    public String imageFileName;
    @Column(name = "pubDate")
    @JsonProperty("pubDate")
    public String pubDate;
    @Column(name = "content")
    @JsonProperty("content")
    public String content;
    @Column(name = "reference")
    @JsonProperty("reference")
    public String reference;
    @Serial
    private final static long serialVersionUID = -6224124577118357536L;
}
