package com.digitalnao.googlescholarapi.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

/**
 * IndiceH
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-04-20T05:12:20.970659408Z[GMT]")


public class IndiceHDTO implements AnyOfCitedByTableItems {
  @JsonProperty("h_index")
  private CitationInfoDTO indiceH = null;

  public IndiceHDTO indiceH(CitationInfoDTO indiceH) {
    this.indiceH = indiceH;
    return this;
  }

  /**
   * Get indiceH
   * @return indiceH
   **/
  public CitationInfoDTO getIndiceH() {
    return indiceH;
  }

  public void setIndiceH(CitationInfoDTO indiceH) {
    this.indiceH = indiceH;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndiceHDTO indiceHDTO = (IndiceHDTO) o;
    return Objects.equals(this.indiceH, indiceHDTO.indiceH);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indiceH);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndiceH {\n");
    
    sb.append("    indiceH: ").append(toIndentedString(indiceH)).append("\n");
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
