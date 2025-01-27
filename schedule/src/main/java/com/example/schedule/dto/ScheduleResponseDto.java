package com.example.schedule.dto;


import com.example.schedule.entity.Schedule;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ScheduleResponseDto {
    //식별자
    private Long pw;
    //사용자명
    private String name;
    //일정내용
    private String contents;

    public ScheduleResponseDto(Schedule schedule) {
        this.name = schedule.getName();
        this.pw = schedule.getPw();
        this.contents = schedule.getContents();
    }
}
