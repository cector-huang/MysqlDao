/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cector.mysqldao;

import java.util.Date;

/**
 *
 * @author huangjiaqi
 */
public class MysqlDto {
    private int id;
    private String name;
    private String address;
    private Date time;
    
    public int getId()
    {
        return id;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public void setAddress(String address)
    {
        this.address = address;
    }
    
    public Date getTime()
    {
        return time;
    }
    
    public void setTime()
    {
        this.time = time;
    }
    
    public MysqlDto(int id, String name, String address, Date time)
    {
        super();
        this.id = id;
        this.name = name;
        this.address = address;
        this.time = time;
    }
    
    public MysqlDto()
    {
        super();
    }
    
    public MysqlDto(String name, String address, Date time)
    {
        super();
        this.name = name;
        this.address = address;
        this.time = time;
    }
    
    public String toString()
    {
        return "MysqlDto [id=" + id + "], [name=" + name + "]";
    }
}
