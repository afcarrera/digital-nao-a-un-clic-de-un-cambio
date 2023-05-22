package com.digitalnao.googlescholarapi.connector.impl;

import com.digitalnao.googlescholarapi.util.Constants;
import com.digitalnao.googlescholarapi.connector.IGoogleScholarAuthorConnector;
import com.digitalnao.googlescholarapi.connector.RestService;
import com.digitalnao.googlescholarapi.dto.SearchResultDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class GoogleScholarAuthorConnector implements IGoogleScholarAuthorConnector {
    @Autowired
    private RestService restService;

    @Override
    public SearchResultDTO findById(String[] params) {
        String apiKey = params[0];
        String authorId = params[1];
        String engine = params[2];
        String url = Constants.GOOGLE_SCHOLAR_URL
                .concat(Constants.QUESTION_MARK)
                .concat(Constants.API_KEY_NAME)
                .concat(Constants.EQUAL_SIGN)
                .concat(apiKey)
                .concat(Constants.AMPERSAND)
                .concat(Constants.AUTHOR_ID_NAME)
                .concat(Constants.EQUAL_SIGN)
                .concat(authorId)
                .concat(Constants.AMPERSAND)
                .concat(Constants.ENGINE_NAME)
                .concat(Constants.EQUAL_SIGN)
                .concat(engine);
        ResponseEntity<SearchResultDTO> response =
                this.restService.getRestTemplate().getForEntity(url, SearchResultDTO.class, 1);
        if(response.getStatusCode() == HttpStatus.OK) {
            return response.getBody();
        } else {
            return null;
        }
    }
}
