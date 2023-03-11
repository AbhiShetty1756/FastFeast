package com.PizzaZone.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PizzaZone.entities.Item;
import com.PizzaZone.entities.ItemImage;

public interface ItemImageDao extends JpaRepository<ItemImage, Integer>{
}
