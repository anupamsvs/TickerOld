package com.pwc.pfg.service;

import com.pwc.pfg.model.Ticker;
import com.pwc.pfg.repository.TickerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TickerService {

    @Autowired
    private TickerRepository tickerRepository;

    public List<Ticker> getAllTickers(){
        List<Ticker> tickerList = new ArrayList<>();
        tickerRepository.findAll().forEach(tickerList::add);
        return tickerList;
    }

    public void addTicker(Ticker ticker) {
        tickerRepository.save(ticker);
    }

    public void updateTicker(Ticker ticker, String id) {
        tickerRepository.save(ticker);
    }

    public void deleteTicker(Ticker ticker, String id) {
        tickerRepository.deleteById(id);
    }
}
