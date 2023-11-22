package com.hobbyloop.facade_service.example.response;

import com.hobbyloop.domain.example.entity.Example;
import lombok.Data;

//DTO (RESPONSE)
@Data
public class FindExampleResponse {
    private Long id;
    private String name;

    private FindExampleResponse(Long id, String name){
        this.id =id;
        this.name = name;
    }

    //예시 : 엔티티 -> API 전달전 DTO 변환하기
    public static FindExampleResponse of(Example example){
        return new FindExampleResponse(
                example.getId(),
                example.getName());
    }
}
