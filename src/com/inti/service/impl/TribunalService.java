package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.inti.entities.Tribunal;
import com.inti.service.interfaces.ITribunalService;

@Service
@Transactional
public class TribunalService extends ManagerService<Tribunal> implements ITribunalService{

}
