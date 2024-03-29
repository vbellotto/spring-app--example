package com.bellotto.code.example.domain.repository;

import com.bellotto.code.example.domain.entity.Item;

import java.util.List;
import java.util.Optional;


public interface ItemRepository {

    /**
     * Return a list of {@link Item}.
     *
     * @return - list of {@link Item}
     */
    List<Item> findAll();

    /**
     * Return a single {@link Item}.
     *
     * @param id - the item id.
     * @return - {@link Optional<Item>}
     */
    Optional<Item> findById(Long id);

    /**
     * Delete un {@link Item}
     * @param id
     */
    void deleteById(Long id);

    /**
     * Insert a {@link Item}
     * @param item - The item to insert.
     * @return - the inserted {@link Item}
     */
    Item insert(Item item);
}
