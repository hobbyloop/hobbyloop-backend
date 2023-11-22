package com.hobbyloop.facade_service.example.request;

import com.hobbyloop.domain.example.entity.Example;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class SaveExampleRequestDto {
    private String name;

    public Example toEntity(){
        return Example.builder()
                .name(name)
                .build()
                ;
    }
}
