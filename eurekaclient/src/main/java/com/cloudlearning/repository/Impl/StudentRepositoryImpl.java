package com.cloudlearning.repository.Impl;

import com.cloudlearning.entity.Student;
import com.cloudlearning.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepositoryImpl implements StudentRepository {
    private static Map<Long,Student> studentmap;

    static {
        studentmap = new HashMap<Long,Student>();
        studentmap.put(1L,new Student(1L,"ZhangSan",21));
        studentmap.put(2L,new Student(2L,"LiSi",22));
        studentmap.put(3L,new Student(3L,"WangWu",23));
    }

    @Override
    public Collection<Student> findAll() {
        return studentmap.values();
    }

    @Override
    public Student findById(long id) {
        return studentmap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        studentmap.put(student.getId(),student);
    }

    @Override
    public void deleteById(long id) {
        studentmap.remove(id);
    }
}
