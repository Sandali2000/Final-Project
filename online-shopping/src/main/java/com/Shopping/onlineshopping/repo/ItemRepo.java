package com.Shopping.onlineshopping.repo;

import com.Shopping.onlineshopping.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@EnableJpaRepositories
@Repository
@Transactional

public interface ItemRepo extends JpaRepository<Item,Integer> {


    List<Item> findAllByItemNameEqualsAndActiveStateEquals(String name ,boolean b);

    List<Item> findAllByItemNameEqualsAndActiveStateIsFalse(String name);
}
