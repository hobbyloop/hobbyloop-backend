package com.hobbyloop.domain.example.service;

import com.hobbyloop.domain.example.entity.Example;
import com.hobbyloop.domain.example.repository.ExampleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ExampleService {

    //CRUD 여기서 작성 (DB와 실제 접근하는 서비스 클래스)
    private final ExampleRepository exampleRepository;

    @Transactional
    public Long save(Example example){
        Example table = exampleRepository.save(example); //저장완료

        return table.getId();
    }

    @Transactional(readOnly = true)
    public Example findById(Long id){
        return
                exampleRepository.findById(id).orElseThrow(
                        () -> new IllegalArgumentException("not found example")
                );
    }
}
