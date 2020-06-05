package com.cloudlearning.Controller;

import com.cloudlearning.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

@RestController
@RequestMapping("/consumer")
public class ConsumerHandler {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        //通过get请求获取Entity
        return restTemplate.getForEntity("http://localhost:8010/student/findAll",Collection.class).getBody();
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") long id){
        return restTemplate.getForObject("http://localhost:8010/student/findById/{id}",Student.class,id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student){
        restTemplate.postForObject("http://localhost:8010/student/save",student,Void.class);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student){
        restTemplate.put("http://localhost:8010/student/update/",student);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable long id){
        restTemplate.delete("http://localhost:8010/student/delete/{id}",id);
    }

}
