package se.company.model;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ItemIdUServiceMap {

    private Map<String, String> map = new HashMap<>();

    public String get(String itemId) {
        return map.get(itemId);
    }

    public String put(String itemId, String uServiceUrl) {
        return map.put(itemId, uServiceUrl);
    }
}
