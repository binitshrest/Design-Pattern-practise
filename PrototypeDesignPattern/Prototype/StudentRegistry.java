package PrototypeDesignPattern.Prototype;

import java.util.Map;
import java.util.HashMap;

//Should be ideally singl
public class StudentRegistry {
    
    private Map<String, Student> map = new HashMap<>();

    public void register(String key, Student student){
        map.put(key, student);
    }

    public Student get(String key){
        return map.get(key);
    }
}
