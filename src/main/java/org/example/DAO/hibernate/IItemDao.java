package org.example.DAO.hibernate;

import org.example.entity.Item;

import java.util.List;

public interface IItemDao {
    Item addItem(Item item);
    void deleteItem();
    List<Item> getAllByPlace(String placeName);

    List<Item> getAllByType(String placeName);
    List<Item> getItemByItemId(String itemId);

    void updateItem(Item item);

    void moveItemById(String itemId, String distination);
}
