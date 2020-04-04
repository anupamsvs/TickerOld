package com.pwc.pfg.repository;

import com.pwc.pfg.model.Ticker;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface TickerRepository extends CrudRepository<Ticker,String> {

}
