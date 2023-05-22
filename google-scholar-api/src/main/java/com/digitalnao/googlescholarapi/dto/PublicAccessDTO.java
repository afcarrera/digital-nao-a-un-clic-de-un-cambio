package com.digitalnao.googlescholarapi.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

/**
 * PublicAccess
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-04-20T05:12:20.970659408Z[GMT]")


public class PublicAccessDTO {
  @JsonProperty("link")
  private String link = null;

  @JsonProperty("available")
  private Integer available = null;

  @JsonProperty("not_available")
  private Integer notAvailable = null;

  public PublicAccessDTO link(String link) {
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

  public PublicAccessDTO available(Integer available) {
    this.available = available;
    return this;
  }

  /**
   * Get available
   * @return available
   **/
  public Integer getAvailable() {
    return available;
  }

  public void setAvailable(Integer available) {
    this.available = available;
  }

  public PublicAccessDTO notAvailable(Integer notAvailable) {
    this.notAvailable = notAvailable;
    return this;
  }

  /**
   * Get notAvailable
   * @return notAvailable
   **/
  public Integer getNotAvailable() {
    return notAvailable;
  }

  public void setNotAvailable(Integer notAvailable) {
    this.notAvailable = notAvailable;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicAccessDTO publicAccessDTO = (PublicAccessDTO) o;
    return Objects.equals(this.link, publicAccessDTO.link) &&
        Objects.equals(this.available, publicAccessDTO.available) &&
        Objects.equals(this.notAvailable, publicAccessDTO.notAvailable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, available, notAvailable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicAccess {\n");
    
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    notAvailable: ").append(toIndentedString(notAvailable)).append("\n");
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
