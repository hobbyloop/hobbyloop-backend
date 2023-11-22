package com.hobbyloop.api.example.request;

import com.hobbyloop.facade_service.example.request.SaveExampleRequestDto;
import lombok.AllArgsConstructor;
import lombok.Getter;

// request 객체
@Getter  //임시
@AllArgsConstructor
public class SaveExampleRequest {
    private SaveExampleRequestDto saveExampleRequestDto;
    private String name;

    public SaveExampleRequestDto toDto(){
        return new SaveExampleRequestDto(name);
    }
}
