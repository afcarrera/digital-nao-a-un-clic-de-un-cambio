package com.digitalnao.googlescholarapi.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

/**
 * GraphDTO
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-04-20T05:12:20.970659408Z[GMT]")


public class GraphDTO {
  @JsonProperty("year")
  private Integer year = null;

  @JsonProperty("citations")
  private String citations = null;

  public GraphDTO year(Integer year) {
    this.year = year;
    return this;
  }

  /**
   * Get year
   * @return year
   **/
  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }

  public GraphDTO citations(String citations) {
    this.citations = citations;
    return this;
  }

  /**
   * Get citations
   * @return citations
   **/
  public String getCitations() {
    return citations;
  }

  public void setCitations(String citations) {
    this.citations = citations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GraphDTO graphDTO = (GraphDTO) o;
    return Objects.equals(this.year, graphDTO.year) &&
        Objects.equals(this.citations, graphDTO.citations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(year, citations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GraphDTO {\n");
    
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    citations: ").append(toIndentedString(citations)).append("\n");
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
