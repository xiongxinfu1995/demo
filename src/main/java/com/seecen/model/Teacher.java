package com.seecen.model;

import lombok.Data;

@Data
public class Teacher {
    private Integer tid;

    private Integer cid;

    private String tname;

    private String prof;

private  Course course;
}