package com.thoughtworks.warehouse.entity;

import javax.persistence.*;

/**
 * Created by gracem on 2016/05/26.
 */
@Entity
@Table(name = "COMPUTER")
public class Computer {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String memory;
    private String processor;


    public Computer(String name, String memory, String processor) {
        this.name = name;
        this.memory = memory;
        this.processor = processor;
    }

    public Computer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }
}
