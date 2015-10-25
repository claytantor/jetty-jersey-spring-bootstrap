package com.dronz.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by claytongraham on 10/25/15.
 */
@Service
public class FirstService {
    public Map<String,Object> getModel(){
        Map<String,Object> model = new HashMap<String,Object>();
        model.put("message", "message from service");
        return model;
    }
}
