package com.digitalnao.googlescholarapi.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;

/**
 * Author
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-04-20T05:12:20.970659408Z[GMT]")


public class AuthorDTO {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("affiliations")
  private String affiliations = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("interests")
  private List<InterestDTO> interestDTOS = null;

  @JsonProperty("thumbnail")
  private String thumbnail = null;

  public AuthorDTO name(String name) {
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

  public AuthorDTO affiliations(String affiliations) {
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

  public AuthorDTO email(String email) {
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

  public AuthorDTO interests(List<InterestDTO> interestDTOS) {
    this.interestDTOS = interestDTOS;
    return this;
  }

  public AuthorDTO addInterestsItem(InterestDTO interestsItem) {
    if (this.interestDTOS == null) {
      this.interestDTOS = new ArrayList<InterestDTO>();
    }
    this.interestDTOS.add(interestsItem);
    return this;
  }

  /**
   * Get interests
   * @return interests
   **/
  public List<InterestDTO> getInterests() {
    return interestDTOS;
  }

  public void setInterests(List<InterestDTO> interestDTOS) {
    this.interestDTOS = interestDTOS;
  }

  public AuthorDTO thumbnail(String thumbnail) {
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
    AuthorDTO authorDTO = (AuthorDTO) o;
    return Objects.equals(this.name, authorDTO.name) &&
        Objects.equals(this.affiliations, authorDTO.affiliations) &&
        Objects.equals(this.email, authorDTO.email) &&
        Objects.equals(this.interestDTOS, authorDTO.interestDTOS) &&
        Objects.equals(this.thumbnail, authorDTO.thumbnail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, affiliations, email, interestDTOS, thumbnail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Author {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    affiliations: ").append(toIndentedString(affiliations)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    interests: ").append(toIndentedString(interestDTOS)).append("\n");
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
