package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.inti.entities.Document;
import com.inti.service.interfaces.IDocumentService;

@Service
@Transactional
public class DocumentService extends ManagerService<Document> implements IDocumentService{

}
