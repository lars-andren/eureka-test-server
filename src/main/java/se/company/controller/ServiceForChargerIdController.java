package se.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import se.company.model.ItemIdUServiceMap;

@RestController
public class ServiceForChargerIdController {

    @Autowired
    ItemIdUServiceMap itemIdUServiceMap;

    @RequestMapping(value = "/getUServiceForItemId/{itemId}", method = RequestMethod.GET)
    public String getUService(@PathVariable String itemId) {

        String uServiceURL = itemIdUServiceMap.get(itemId);

        if (uServiceURL == null) {
            return "Failure.";
        } else {
            return uServiceURL;
        }
    }

    @RequestMapping(value = "/registerItemId/{itemId}/{uServiceUrl}", method = RequestMethod.GET)
    public String getUService(@PathVariable String itemId, @PathVariable String uServiceUrl) {
      return itemIdUServiceMap.put(itemId, uServiceUrl);
    }
}
