package com.digitalnao.googlescholarapi.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;

/**
 * SearchResult
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-04-20T05:12:20.970659408Z[GMT]")


public class SearchResultDTO {
  @JsonProperty("search_metadata")
  private SearchMetadataDTO searchMetadataDTO = null;

  @JsonProperty("search_parameters")
  private SearchParameterDTO searchParametersDTO = null;

  @JsonProperty("author")
  private AuthorDTO authorDTO = null;

  @JsonProperty("articles")
  private List<ArticleDTO> articleDTOS = null;

  @JsonProperty("cited_by")
  private CitedByDTO citedByDTO = null;

  @JsonProperty("public_access")
  private PublicAccessDTO publicAccessDTO = null;

  @JsonProperty("co_authors")
  private List<CoAuthorDTO> coAuthorDTOS = null;

  @JsonProperty("serpapi_pagination")
  private SerpapiPaginationDTO serpapiPagination = null;

  public SearchResultDTO searchMetadata(SearchMetadataDTO searchMetadataDTO) {
    this.searchMetadataDTO = searchMetadataDTO;
    return this;
  }

  /**
   * Get searchMetadata
   * @return searchMetadata
   **/
  public SearchMetadataDTO getSearchMetadata() {
    return searchMetadataDTO;
  }

  public void setSearchMetadata(SearchMetadataDTO searchMetadataDTO) {
    this.searchMetadataDTO = searchMetadataDTO;
  }

  public SearchResultDTO searchParameters(SearchParameterDTO searchParametersDTO) {
    this.searchParametersDTO = searchParametersDTO;
    return this;
  }

  /**
   * Get searchParameters
   * @return searchParameters
   **/
  public SearchParameterDTO getSearchParameters() {
    return searchParametersDTO;
  }

  public void setSearchParameters(SearchParameterDTO searchParametersDTO) {
    this.searchParametersDTO = searchParametersDTO;
  }

  public SearchResultDTO author(AuthorDTO authorDTO) {
    this.authorDTO = authorDTO;
    return this;
  }

  /**
   * Get author
   * @return author
   **/
  public AuthorDTO getAuthor() {
    return authorDTO;
  }

  public void setAuthor(AuthorDTO authorDTO) {
    this.authorDTO = authorDTO;
  }

  public SearchResultDTO articles(List<ArticleDTO> articleDTOS) {
    this.articleDTOS = articleDTOS;
    return this;
  }

  public SearchResultDTO addArticlesItem(ArticleDTO articlesItem) {
    if (this.articleDTOS == null) {
      this.articleDTOS = new ArrayList<ArticleDTO>();
    }
    this.articleDTOS.add(articlesItem);
    return this;
  }

  /**
   * Get articles
   * @return articles
   **/
  public List<ArticleDTO> getArticles() {
    return articleDTOS;
  }

  public void setArticles(List<ArticleDTO> articleDTOS) {
    this.articleDTOS = articleDTOS;
  }

  public SearchResultDTO citedBy(CitedByDTO citedByDTO) {
    this.citedByDTO = citedByDTO;
    return this;
  }

  /**
   * Get citedBy
   * @return citedBy
   **/
  public CitedByDTO getCitedBy() {
    return citedByDTO;
  }

  public void setCitedBy(CitedByDTO citedByDTO) {
    this.citedByDTO = citedByDTO;
  }

  public SearchResultDTO publicAccess(PublicAccessDTO publicAccessDTO) {
    this.publicAccessDTO = publicAccessDTO;
    return this;
  }

  /**
   * Get publicAccess
   * @return publicAccess
   **/
  public PublicAccessDTO getPublicAccess() {
    return publicAccessDTO;
  }

  public void setPublicAccess(PublicAccessDTO publicAccessDTO) {
    this.publicAccessDTO = publicAccessDTO;
  }

  public SearchResultDTO coAuthors(List<CoAuthorDTO> coAuthorDTOS) {
    this.coAuthorDTOS = coAuthorDTOS;
    return this;
  }

  public SearchResultDTO addCoAuthorsItem(CoAuthorDTO coAuthorsItemDTO) {
    if (this.coAuthorDTOS == null) {
      this.coAuthorDTOS = new ArrayList<CoAuthorDTO>();
    }
    this.coAuthorDTOS.add(coAuthorsItemDTO);
    return this;
  }

  /**
   * Get coAuthors
   * @return coAuthors
   **/
  public List<CoAuthorDTO> getCoAuthors() {
    return coAuthorDTOS;
  }

  public void setCoAuthors(List<CoAuthorDTO> coAuthorDTOS) {
    this.coAuthorDTOS = coAuthorDTOS;
  }

  public SearchResultDTO serpapiPagination(SerpapiPaginationDTO serpapiPagination) {
    this.serpapiPagination = serpapiPagination;
    return this;
  }

  /**
   * Get serpapiPagination
   * @return serpapiPagination
   **/
  public SerpapiPaginationDTO getSerpapiPagination() {
    return serpapiPagination;
  }

  public void setSerpapiPagination(SerpapiPaginationDTO serpapiPagination) {
    this.serpapiPagination = serpapiPagination;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchResultDTO searchResult = (SearchResultDTO) o;
    return Objects.equals(this.searchMetadataDTO, searchResult.searchMetadataDTO) &&
        Objects.equals(this.searchParametersDTO, searchResult.searchParametersDTO) &&
        Objects.equals(this.authorDTO, searchResult.authorDTO) &&
        Objects.equals(this.articleDTOS, searchResult.articleDTOS) &&
        Objects.equals(this.citedByDTO, searchResult.citedByDTO) &&
        Objects.equals(this.publicAccessDTO, searchResult.publicAccessDTO) &&
        Objects.equals(this.coAuthorDTOS, searchResult.coAuthorDTOS) &&
        Objects.equals(this.serpapiPagination, searchResult.serpapiPagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchMetadataDTO, searchParametersDTO, authorDTO, articleDTOS, citedByDTO, publicAccessDTO, coAuthorDTOS, serpapiPagination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResult {\n");
    
    sb.append("    searchMetadata: ").append(toIndentedString(searchMetadataDTO)).append("\n");
    sb.append("    searchParameters: ").append(toIndentedString(searchParametersDTO)).append("\n");
    sb.append("    author: ").append(toIndentedString(authorDTO)).append("\n");
    sb.append("    articles: ").append(toIndentedString(articleDTOS)).append("\n");
    sb.append("    citedBy: ").append(toIndentedString(citedByDTO)).append("\n");
    sb.append("    publicAccess: ").append(toIndentedString(publicAccessDTO)).append("\n");
    sb.append("    coAuthors: ").append(toIndentedString(coAuthorDTOS)).append("\n");
    sb.append("    serpapiPagination: ").append(toIndentedString(serpapiPagination)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
