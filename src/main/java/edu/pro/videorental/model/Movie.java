package edu.pro.videorental.model;

import lombok.Data;

@Data
public class Movie {
    private String id;
    private String name;
    private Price price;

}
