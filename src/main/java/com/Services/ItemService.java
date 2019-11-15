package com.Services;

import com.Domain.Items;
import com.Repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;

    public List<Items> getAllItems()
    {
        // return items;
        List<Items> items = new ArrayList<>();
        itemRepository.findAll().forEach(items :: add);
        return items;
    }

    public void addItem(Items item)
    {
        // items.add(item);
        itemRepository.save(item);
    }

    public void deleteItem(long id /*, Items item */)
    {
        // items.removeIf(t -> t.getId() == id);
        itemRepository.deleteById(id);
    }

    public void updateItem(Items item)
    {
    /*   for (int i = 0; i <= items.size(); i++)
        {
            items b = items.get(i);
            if (b.getId() == (id))
            {
                items.set(i, item);
                return;
            }
        }  */
        itemRepository.save(item);
    }
    public Items getItem (long id)
    {
        //  return items.stream().filter(t -> t.getId() == (id)).findFirst().get();
        return itemRepository.findById(id).orElse(null);
    }

}
