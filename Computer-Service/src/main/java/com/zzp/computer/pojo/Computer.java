package com.zzp.computer.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by zhuzhengping on 2017/4/13.
 */
@Entity
public class Computer {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "computer_name",unique = true,nullable = false)
    private String computerName;

    @Column(name = "computer_product",unique = false,nullable = true)
    private String computerPro;

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", computerName='" + computerName + '\'' +
                ", computerPro='" + computerPro + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getComputerName() {
        return computerName;
    }

    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }

    public String getComputerPro() {
        return computerPro;
    }

    public void setComputerPro(String computerPro) {
        this.computerPro = computerPro;
    }
}
