package com.digitalnao.googlescholarapi.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

/**
 * IndiceI10
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-04-20T05:12:20.970659408Z[GMT]")


public class IndiceI10DTO implements AnyOfCitedByTableItems {
  @JsonProperty("i10_index")
  private CitationInfoDTO indiceI10 = null;

  public IndiceI10DTO indiceI10(CitationInfoDTO indiceI10) {
    this.indiceI10 = indiceI10;
    return this;
  }

  /**
   * Get indiceI10
   * @return indiceI10
   **/
  public CitationInfoDTO getIndiceI10() {
    return indiceI10;
  }

  public void setIndiceI10(CitationInfoDTO indiceI10) {
    this.indiceI10 = indiceI10;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndiceI10DTO indiceI10DTO = (IndiceI10DTO) o;
    return Objects.equals(this.indiceI10, indiceI10DTO.indiceI10);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indiceI10);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndiceI10 {\n");
    
    sb.append("    indiceI10: ").append(toIndentedString(indiceI10)).append("\n");
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
