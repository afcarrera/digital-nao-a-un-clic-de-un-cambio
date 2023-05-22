package com.digitalnao.googlescholarapi.service.impl;

import com.digitalnao.googlescholarapi.dto.SearchResultDTO;
import com.digitalnao.googlescholarapi.service.IGoogleScholarAuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import com.digitalnao.googlescholarapi.connector.IGoogleScholarAuthorConnector;
import org.springframework.stereotype.Service;

@Service
public class GoogleScholarAuthorService implements IGoogleScholarAuthorService {
    @Autowired
    IGoogleScholarAuthorConnector googleScholarAuthorsConnector;
    @Override
    public SearchResultDTO findById(String[] params) {
        return this.googleScholarAuthorsConnector.findById(params);
    }
}
