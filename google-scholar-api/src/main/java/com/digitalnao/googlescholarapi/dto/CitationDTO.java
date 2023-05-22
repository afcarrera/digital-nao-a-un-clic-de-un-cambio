package com.digitalnao.googlescholarapi.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

/**
 * Citation
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-04-20T05:12:20.970659408Z[GMT]")


public class CitationDTO implements AnyOfCitedByTableItems {
  @JsonProperty("citations")
  private CitationInfoDTO citations = null;

  public CitationDTO citations(CitationInfoDTO citations) {
    this.citations = citations;
    return this;
  }

  /**
   * Get citations
   * @return citations
   **/
  public CitationInfoDTO getCitations() {
    return citations;
  }

  public void setCitations(CitationInfoDTO citations) {
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
    CitationDTO citationDTO = (CitationDTO) o;
    return Objects.equals(this.citations, citationDTO.citations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(citations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Citation {\n");
    
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
