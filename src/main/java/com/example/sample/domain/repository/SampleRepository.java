package com.example.sample.domain.repository;


import com.example.sample.domain.model.SampleEntity;
import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;
import org.springframework.stereotype.Repository;

import java.util.List;

@ConfigAutowireable
@Dao
@Repository
public interface SampleRepository {

    @Select
    List<SampleEntity> selectAll();

}