package com.inti.dao.impl;


import org.springframework.stereotype.Repository;

import com.inti.dao.interfaces.IRoleDAO;

import com.inti.entities.Role;
@Repository
public class RoleDAO extends ManagerDAO<Role> implements IRoleDAO {

}
