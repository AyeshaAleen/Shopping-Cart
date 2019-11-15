package com.Repository;

import com.Domain.CDs;
import org.springframework.data.repository.CrudRepository;

public interface CDRepository extends CrudRepository<CDs, Long> {

    //getAllCDs()
    //getCD(int id)
    //updateCD(Books b)
    //deleteCD(int id)
}
