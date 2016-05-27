package com.thoughtworks.warehouse.dao;

import com.thoughtworks.warehouse.entity.Computer;

import java.util.List;

/**
 * Created by gracem on 2016/05/26.
 */

public interface ComputerDAO {
    public void addComputer(Computer computer);


    List<Computer> getComputers();

    void addAll(List<Computer> list);
}
