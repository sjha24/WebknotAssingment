package com.example.demoApp.service;
import com.example.demoApp.model.Item;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.*;
import java.util.stream.Collectors;


@Service
public class ItemService {
    private final RestTemplate restTemplate;

    public ItemService() {
        this.restTemplate = new RestTemplate();
    }

    private List<Item> fetchData() {
        String url = "https://api.sampleapis.com/beers/ale";
        Item[] items = restTemplate.getForObject(url, Item[].class);
        return Arrays.asList(items);
    }


    public List<Item> sortItemByPrice() {
        List<Item> items = fetchData();
        return items.stream()
                .sorted(Comparator.comparingDouble(beer -> Double.parseDouble(beer.getPrice().replace("$", ""))))
                .collect(Collectors.toList());

    }

    public List<Item> filterItemByAverageRating(double minAverage) {
        List<Item> items = fetchData();
        return items.stream()
                .filter(item -> item.getRating().getAverage() >= minAverage)
                .collect(Collectors.toList());
    }
}
