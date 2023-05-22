package com.digitalnao.googlescholarapi.connector;

import com.digitalnao.googlescholarapi.dto.SearchResultDTO;

public interface IGoogleScholarAuthorConnector {
    SearchResultDTO findById(String[] params);
}
