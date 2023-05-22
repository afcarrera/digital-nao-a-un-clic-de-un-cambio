package com.digitalnao.googlescholarapi.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

/**
 * CoAuthor
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-04-20T05:12:20.970659408Z[GMT]")


public class CoAuthorDTO {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("link")
  private String link = null;

  @JsonProperty("serpapi_link")
  private String serpapiLink = null;

  @JsonProperty("author_id")
  private String authorId = null;

  @JsonProperty("affiliations")
  private String affiliations = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("thumbnail")
  private String thumbnail = null;

  public CoAuthorDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CoAuthorDTO link(String link) {
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

  public CoAuthorDTO serpapiLink(String serpapiLink) {
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

  public CoAuthorDTO authorId(String authorId) {
    this.authorId = authorId;
    return this;
  }

  /**
   * Get authorId
   * @return authorId
   **/
  public String getAuthorId() {
    return authorId;
  }

  public void setAuthorId(String authorId) {
    this.authorId = authorId;
  }

  public CoAuthorDTO affiliations(String affiliations) {
    this.affiliations = affiliations;
    return this;
  }

  /**
   * Get affiliations
   * @return affiliations
   **/
  public String getAffiliations() {
    return affiliations;
  }

  public void setAffiliations(String affiliations) {
    this.affiliations = affiliations;
  }

  public CoAuthorDTO email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   **/
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public CoAuthorDTO thumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
    return this;
  }

  /**
   * Get thumbnail
   * @return thumbnail
   **/
  public String getThumbnail() {
    return thumbnail;
  }

  public void setThumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoAuthorDTO coAuthorDTO = (CoAuthorDTO) o;
    return Objects.equals(this.name, coAuthorDTO.name) &&
        Objects.equals(this.link, coAuthorDTO.link) &&
        Objects.equals(this.serpapiLink, coAuthorDTO.serpapiLink) &&
        Objects.equals(this.authorId, coAuthorDTO.authorId) &&
        Objects.equals(this.affiliations, coAuthorDTO.affiliations) &&
        Objects.equals(this.email, coAuthorDTO.email) &&
        Objects.equals(this.thumbnail, coAuthorDTO.thumbnail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, link, serpapiLink, authorId, affiliations, email, thumbnail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoAuthor {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    serpapiLink: ").append(toIndentedString(serpapiLink)).append("\n");
    sb.append("    authorId: ").append(toIndentedString(authorId)).append("\n");
    sb.append("    affiliations: ").append(toIndentedString(affiliations)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
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
