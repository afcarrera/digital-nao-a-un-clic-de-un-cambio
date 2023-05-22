package com.digitalnao.googlescholarapi.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

/**
 * CitationInfoDTO
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-04-20T05:12:20.970659408Z[GMT]")


public class CitationInfoDTO {
  @JsonProperty("all")
  private Integer all = null;

  @JsonProperty("since_2018")
  private Integer since2018 = null;

  public CitationInfoDTO all(Integer all) {
    this.all = all;
    return this;
  }

  /**
   * Get all
   * @return all
   **/
  public Integer getAll() {
    return all;
  }

  public void setAll(Integer all) {
    this.all = all;
  }

  public CitationInfoDTO depuis2016(Integer depuis2016) {
    this.since2018 = depuis2016;
    return this;
  }

  /**
   * Get depuis2016
   * @return depuis2016
   **/
  public Integer getSince2018() {
    return since2018;
  }

  public void setSince2018(Integer since2018) {
    this.since2018 = since2018;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CitationInfoDTO citationInfoDTO = (CitationInfoDTO) o;
    return Objects.equals(this.all, citationInfoDTO.all) &&
        Objects.equals(this.since2018, citationInfoDTO.since2018);
  }

  @Override
  public int hashCode() {
    return Objects.hash(all, since2018);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CitationInfoDTO {\n");
    
    sb.append("    all: ").append(toIndentedString(all)).append("\n");
    sb.append("    depuis2016: ").append(toIndentedString(since2018)).append("\n");
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
