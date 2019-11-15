package com.Controllers;

import com.Domain.Items;
import com.Services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemController {

    @Autowired
    private ItemService itemServices;

    @RequestMapping("/Books/{id}/Items")
    @ResponseBody
    public List<Items> getAllItems()
    {
        return itemServices.getAllItems();
    }

    @RequestMapping("/Books/{Bookid}/Items/{id}")
    public Items getItem( @PathVariable long id)
    {
        return itemServices.getItem(id);
    }

    @RequestMapping(method = RequestMethod.POST, value= "/Books/{Bookid}/Items/{id}")
    public void addItem(@RequestBody Items item /*, @PathVariable String bookId */)
    {
        // item.setBook(new Books(bookId, "", "",""));
        itemServices.addItem(item);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/Books/{Bookid}/Items/{id}")
    public void updateItem(@RequestBody Items item/*@PathVariable String bookId */, @PathVariable long id)
    {
        // item.setBook(new Books(bookId, "", "",""));
        itemServices.updateItem(item);
    }

    @RequestMapping(method = RequestMethod.DELETE, value= "/Books/{Bookid}/Items/{id}")
    public void deleteItem(@PathVariable long id /*, @RequestBody Items item */)
    {
        itemServices.deleteItem(id);
    }


}
