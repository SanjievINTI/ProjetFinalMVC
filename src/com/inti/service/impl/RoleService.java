package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.inti.entities.Role;
import com.inti.service.interfaces.IRoleService;

@Service
@Transactional
public class RoleService extends ManagerService<Role> implements IRoleService{

}
