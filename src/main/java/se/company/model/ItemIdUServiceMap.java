package se.company.model;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ItemIdUServiceMap {

    private Map<String, String> map = new HashMap<>();

    public String get(String chargerId) {
        return map.get(chargerId);
    }

    public String put(String chargerId, String uServiceUrl) {
        return map.put(chargerId, uServiceUrl);
    }
}
