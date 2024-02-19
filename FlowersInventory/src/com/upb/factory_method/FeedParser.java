package com.upb.factory_method;

import java.util.ArrayList;
import java.util.List;

public interface FeedParser {
    public List<Flower> parse(String content);
}
