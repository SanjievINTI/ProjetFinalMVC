package com.inti.dao.impl;


import org.springframework.stereotype.Repository;

import com.inti.dao.interfaces.IDocumentDAO;
import com.inti.entities.Document;
@Repository
public class DocumentDAO extends ManagerDAO<Document> implements IDocumentDAO {

}
