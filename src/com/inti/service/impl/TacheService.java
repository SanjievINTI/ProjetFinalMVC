package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.inti.entities.Tache;
import com.inti.service.interfaces.ITacheService;

@Service
@Transactional
public class TacheService extends ManagerService<Tache> implements ITacheService{

}
