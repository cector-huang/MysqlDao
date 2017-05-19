/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cector.mysqldao;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author cector
 */
public interface TaskDao {
    //添加方法
    public void save() throws SQLException;
    public void delete() throws SQLException;
    public void update() throws SQLException;
    public void findById(int id) throws SQLException;
    public List<Object> findAll() throws SQLException;
    
}
