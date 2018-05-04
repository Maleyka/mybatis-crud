package com.services;

import com.mapper.AgesMapper;
import com.model.Calculator;
import com.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class CalculatorService {

    @Resource
    private AgesMapper agesMapper;

    @Transactional
    public void insertCalculator(Calculator calculator){
        for(Client client: calculator.getClients()) {
            agesMapper.insertClient(client);
        }
    }
}
