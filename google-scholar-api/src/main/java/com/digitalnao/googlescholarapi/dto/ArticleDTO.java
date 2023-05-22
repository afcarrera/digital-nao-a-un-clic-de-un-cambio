package com.digitalnao.googlescholarapi.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

/**
 * ArticleDTO
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-04-20T05:12:20.970659408Z[GMT]")


public class ArticleDTO {
  @JsonProperty("title")
  private String title = null;

  @JsonProperty("link")
  private String link = null;

  @JsonProperty("citation_id")
  private String citationId = null;

  @JsonProperty("authors")
  private String authors = null;

  @JsonProperty("publication")
  private String publication = null;

  @JsonProperty("cited_by")
  private ArticleCitedByDTO citedBy = null;

  @JsonProperty("year")
  private String year = null;

  public ArticleDTO title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   **/
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ArticleDTO link(String link) {
    this.link = link;
    return this;
  }

  /**
   * Get link
   * @return link
   **/
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public ArticleDTO citationId(String citationId) {
    this.citationId = citationId;
    return this;
  }

  /**
   * Get citationId
   * @return citationId
   **/
  public String getCitationId() {
    return citationId;
  }

  public void setCitationId(String citationId) {
    this.citationId = citationId;
  }

  public ArticleDTO authors(String authors) {
    this.authors = authors;
    return this;
  }

  /**
   * Get authors
   * @return authors
   **/
  public String getAuthors() {
    return authors;
  }

  public void setAuthors(String authors) {
    this.authors = authors;
  }

  public ArticleDTO publication(String publication) {
    this.publication = publication;
    return this;
  }

  /**
   * Get publication
   * @return publication
   **/
  public String getPublication() {
    return publication;
  }

  public void setPublication(String publication) {
    this.publication = publication;
  }

  public ArticleDTO citedBy(ArticleCitedByDTO citedBy) {
    this.citedBy = citedBy;
    return this;
  }

  /**
   * Get citedBy
   * @return citedBy
   **/
  public ArticleCitedByDTO getCitedBy() {
    return citedBy;
  }

  public void setCitedBy(ArticleCitedByDTO citedBy) {
    this.citedBy = citedBy;
  }

  public ArticleDTO year(String year) {
    this.year = year;
    return this;
  }

  /**
   * Get year
   * @return year
   **/
  public String getYear() {
    return year;
  }

  public void setYear(String year) {
    this.year = year;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArticleDTO articleDTO = (ArticleDTO) o;
    return Objects.equals(this.title, articleDTO.title) &&
        Objects.equals(this.link, articleDTO.link) &&
        Objects.equals(this.citationId, articleDTO.citationId) &&
        Objects.equals(this.authors, articleDTO.authors) &&
        Objects.equals(this.publication, articleDTO.publication) &&
        Objects.equals(this.citedBy, articleDTO.citedBy) &&
        Objects.equals(this.year, articleDTO.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, link, citationId, authors, publication, citedBy, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArticleDTO {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    citationId: ").append(toIndentedString(citationId)).append("\n");
    sb.append("    authors: ").append(toIndentedString(authors)).append("\n");
    sb.append("    publication: ").append(toIndentedString(publication)).append("\n");
    sb.append("    citedBy: ").append(toIndentedString(citedBy)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
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
