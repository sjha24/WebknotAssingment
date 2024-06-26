package com.example.demoApp.Controller;
import com.example.demoApp.model.Item;
import com.example.demoApp.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
@RequestMapping("/item")
public class ItemController {
    @Autowired
    ItemService itemService;

    @GetMapping("/sortByPrice")
    public List<Item> sortItemByPrice() {
        return itemService.sortItemByPrice();
    }

    @GetMapping("/filterByAverageRating")
    public List<Item> filterItemByAverageRating(@RequestParam double minAverage) {
        return itemService.filterItemByAverageRating(minAverage);
    }
}
