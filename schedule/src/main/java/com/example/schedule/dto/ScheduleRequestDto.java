package com.example.schedule.dto;

import lombok.Getter;

//schedule 요청 DTO
@Getter
public class ScheduleRequestDto {
    private String name;

    private Long pw;

    private String contents;


}
