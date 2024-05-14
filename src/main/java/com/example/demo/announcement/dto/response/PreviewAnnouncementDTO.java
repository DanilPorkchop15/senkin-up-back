package com.example.demo.announcement.dto;

import lombok.Data;

import java.util.Date;

@Data
public class PreviewAnnouncementDTO {
    private Integer id;
    private String title;
    private String creator;
    private Date dateCreated;
}
