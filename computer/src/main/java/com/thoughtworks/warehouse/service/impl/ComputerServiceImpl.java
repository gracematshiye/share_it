package com.thoughtworks.warehouse.service.impl;

import com.thoughtworks.warehouse.dao.ComputerDAO;
import com.thoughtworks.warehouse.entity.Computer;
import com.thoughtworks.warehouse.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by gracem on 2016/05/26.
 */
@Service
public class ComputerServiceImpl implements ComputerService {

    @Autowired
    private ComputerDAO computerDAO;

    @Override
    @Transactional
    public void addComputer(Computer computer) {
        computerDAO.addComputer(computer);
    }

    @Override
    @Transactional
    public List<Computer> getComputers() {
        return computerDAO.getComputers();
    }

    @Override
    @Transactional
    public void addAll(List<Computer> list) {
        computerDAO.addAll(list);
    }

}
