package org.example.DAO.Base;

import org.example.entity.ItemFromCollection1;

import java.io.FileNotFoundException;
import java.util.List;

public interface IItemCollection1Dao {

    ItemFromCollection1 create(int id, String itemId, String size, String photo, String description, String currentPlace) throws FileNotFoundException;
    ItemFromCollection1 read(int id);
    void update(ItemFromCollection1 item);
    void delete(ItemFromCollection1 item);
    List<ItemFromCollection1> getAll(String tableName);

}
