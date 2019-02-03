package com.pchudzik.blog.example.gradledeployment;

import org.apache.commons.collections4.BidiMap;
import org.apache.commons.collections4.bidimap.DualHashBidiMap;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

public class SampleClass {
    public BidiMap<String, String> hello(String key, String value) {
        Map<String, String> map = new HashMap<>();
        map.put(StringUtils.lowerCase(key), StringUtils.lowerCase(value));
        return new DualHashBidiMap<>(map);
    }
}
