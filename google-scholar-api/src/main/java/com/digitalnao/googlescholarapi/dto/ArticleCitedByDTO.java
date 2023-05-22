package com.digitalnao.googlescholarapi.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

/**
 * ArticleCitedBy
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-04-20T05:12:20.970659408Z[GMT]")


public class ArticleCitedByDTO {
  @JsonProperty("value")
  private Integer value = null;

  @JsonProperty("link")
  private String link = null;

  @JsonProperty("serpapi_link")
  private String serpapiLink = null;

  public ArticleCitedByDTO value(Integer value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   **/
  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }

  public ArticleCitedByDTO link(String link) {
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

  public ArticleCitedByDTO serpapiLink(String serpapiLink) {
    this.serpapiLink = serpapiLink;
    return this;
  }

  /**
   * Get serpapiLink
   * @return serpapiLink
   **/
  public String getSerpapiLink() {
    return serpapiLink;
  }

  public void setSerpapiLink(String serpapiLink) {
    this.serpapiLink = serpapiLink;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArticleCitedByDTO articleCitedByDTO = (ArticleCitedByDTO) o;
    return Objects.equals(this.value, articleCitedByDTO.value) &&
        Objects.equals(this.link, articleCitedByDTO.link) &&
        Objects.equals(this.serpapiLink, articleCitedByDTO.serpapiLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, link, serpapiLink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArticleCitedBy {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    serpapiLink: ").append(toIndentedString(serpapiLink)).append("\n");
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
