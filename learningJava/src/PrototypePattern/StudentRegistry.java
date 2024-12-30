package PrototypePattern;

import java.util.*;

public class StudentRegistry {
    private Map<String, Student>  studenMap= new HashMap<>();

    void registerStudent(String key, Student student) {
        studenMap.put(key, student);
    }

    public Student getStudent(String key) {
        return studenMap.get(key);
    }
}
