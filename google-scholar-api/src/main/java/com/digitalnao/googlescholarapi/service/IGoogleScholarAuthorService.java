package com.digitalnao.googlescholarapi.service;

import com.digitalnao.googlescholarapi.dto.SearchResultDTO;

public interface IGoogleScholarAuthorService {
    SearchResultDTO findById(String [] params);
}
