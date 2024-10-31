package edu.pro.videorental.model;

import java.time.LocalDateTime;

public class Rental {
    private String id;
    private Customer customer;
    private Movie movie;
    private LocalDateTime start;
    private LocalDateTime finish;
}
