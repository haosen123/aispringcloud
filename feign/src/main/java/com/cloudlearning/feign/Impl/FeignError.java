package com.cloudlearning.feign.Impl;

import com.cloudlearning.entity.Student;
import com.cloudlearning.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class FeignError implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "Now index page is inaccessible...";
    }
}
