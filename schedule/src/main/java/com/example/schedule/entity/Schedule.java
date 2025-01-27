package com.example.schedule.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Schedule {


    //할일,작성자명,비밀번호,작성/수정일
    private String name;
    private String contents;
    private Long pw;



    public Schedule(String name,Long pw,String contents) {
        this.name = name;
        this.pw = pw;
        this.contents = contents;
    }

    public void update(String name, Long pw, String contents) {
        this.name = name;
        this.pw = pw;
        this.contents = contents;
    }

}
