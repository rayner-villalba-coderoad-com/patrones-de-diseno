package com.upb.factory_method;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class FeedParserJson implements FeedParser {
    @Override
    public List<Flower> parse(String content) {
        ObjectMapper objectMapper = new ObjectMapper();
        //List<Flower> flowersData = objectMapper.readValue(content, Flower.class);

        try {
            List<Flower> flowersData = objectMapper.readValue(content, objectMapper.getTypeFactory().constructCollectionType(List.class, Flower.class));
            return  flowersData;
        } catch ( Exception | JsonMappingException e) {
            e.printStackTrace();
        }
//        try {
//            List<Flower> flowersData = Arrays.asList(objectMapper.readValue(content, Flower[].class));
//            return  flowersData;
//        } catch (Exception e) {
//            e.printStackTrace();
//        } catch (JsonMappingException err) {
//            err.printStackTrace();
//        }

        return null;
    }
}
