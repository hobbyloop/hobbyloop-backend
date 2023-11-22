package com.hobbyloop.api.example.controller;

import com.hobbyloop.api.example.request.SaveExampleRequest;
import com.hobbyloop.facade_service.example.response.FindExampleResponse;
import com.hobbyloop.facade_service.example.service.ExampleFacadeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class ExampleApiController {
    private final ExampleFacadeService exampleFacadeService;
    @PostMapping("/save")
    public Long save(@RequestBody SaveExampleRequest request){
        return exampleFacadeService.saveExample(request.toDto());
    }

    //컨트롤러 예시 : FacadeService 사용해서 로직 수행 후 DTO 받아오기 (임시 id = 1L)
    @GetMapping("/findById")
    public ResponseEntity<FindExampleResponse> getCompany(){
        return ResponseEntity.ok(exampleFacadeService.findById(1L));
    }
}
