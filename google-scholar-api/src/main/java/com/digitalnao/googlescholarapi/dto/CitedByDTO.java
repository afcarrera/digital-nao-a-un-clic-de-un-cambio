package com.digitalnao.googlescholarapi.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;

/**
 * CitedBy
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-04-20T05:12:20.970659408Z[GMT]")


public class CitedByDTO {

  @JsonProperty("graph")
  private List<GraphDTO> graphDTO = null;

  public CitedByDTO GraphDTO(List<GraphDTO> graphDTO) {
    this.graphDTO = graphDTO;
    return this;
  }

  public CitedByDTO addGraphItem(GraphDTO graphDTOItem) {
    if (this.graphDTO == null) {
      this.graphDTO = new ArrayList<GraphDTO>();
    }
    this.graphDTO.add(graphDTOItem);
    return this;
  }

  /**
   * Get GraphDTO
   * @return GraphDTO
   **/

  public List<GraphDTO> getGraph() {
    return graphDTO;
  }

  public void setGraph(List<GraphDTO> graphDTO) {
    this.graphDTO = graphDTO;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CitedByDTO citedByDTO = (CitedByDTO) o;
    return  Objects.equals(this.graphDTO, citedByDTO.graphDTO);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CitedBy {\n");

    sb.append("    graph: ").append(toIndentedString(graphDTO)).append("\n");
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
