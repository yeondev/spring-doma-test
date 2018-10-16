package com.example.sample.domain.service;


import java.util.List;

import com.example.sample.domain.model.SampleEntity;
import com.example.sample.domain.repository.SampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SampleService {

    @Autowired
    SampleRepository sampleRepositoryImpl;

    public List<SampleEntity> getSample () {
        return sampleRepositoryImpl.selectAll();
    }
}