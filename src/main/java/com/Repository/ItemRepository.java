package com.Repository;

import com.Domain.Items;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Items, Long> {

}
