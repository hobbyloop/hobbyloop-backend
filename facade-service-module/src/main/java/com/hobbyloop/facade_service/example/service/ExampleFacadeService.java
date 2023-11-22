package com.hobbyloop.facade_service.example.service;

import com.hobbyloop.domain.example.entity.Example;
import com.hobbyloop.domain.example.service.ExampleService;
import com.hobbyloop.facade_service.example.request.SaveExampleRequestDto;
import com.hobbyloop.facade_service.example.response.FindExampleResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//각 도메인의 service를 함께 사용해야 할 때 -> 실제 api에 반환하는 서비스 (DTO 반환 필수)
@Service
@RequiredArgsConstructor
public class ExampleFacadeService {

    //예시 -> FacadeService 에서는 Service 의존할 수 있지만 반대는 불가능
    private final ExampleService exampleService;

    // entity -> response 변경 후 api 모듈에게 전달
    // api로부터 받은 requestDto -> entity 변경 후 도메인 모듈에게 전달
    @Transactional(readOnly = true)
    public FindExampleResponse findById(Long companyId){
        Example example = exampleService.findById(companyId);
        return FindExampleResponse.of(example);
    }

    @Transactional
    public Long saveExample(SaveExampleRequestDto requestDto){
        return exampleService.save(requestDto.toEntity());
    }
}
