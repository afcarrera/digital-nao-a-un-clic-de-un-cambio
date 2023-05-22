package com.digitalnao.googlescholarapi.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

/**
 * SearchParameter
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-04-20T05:12:20.970659408Z[GMT]")


public class SearchParameterDTO {
  @JsonProperty("engine")
  private String engine = null;

  @JsonProperty("author_id")
  private String authorId = null;

  @JsonProperty("hl")
  private String hl = null;

  public SearchParameterDTO engine(String engine) {
    this.engine = engine;
    return this;
  }

  /**
   * Get engine
   * @return engine
   **/
  public String getEngine() {
    return engine;
  }

  public void setEngine(String engine) {
    this.engine = engine;
  }

  public SearchParameterDTO authorId(String authorId) {
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

  public SearchParameterDTO hl(String hl) {
    this.hl = hl;
    return this;
  }

  /**
   * Get hl
   * @return hl
   **/
  public String getHl() {
    return hl;
  }

  public void setHl(String hl) {
    this.hl = hl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchParameterDTO searchParameterDTO = (SearchParameterDTO) o;
    return Objects.equals(this.engine, searchParameterDTO.engine) &&
        Objects.equals(this.authorId, searchParameterDTO.authorId) &&
        Objects.equals(this.hl, searchParameterDTO.hl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(engine, authorId, hl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchParameter {\n");
    
    sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
    sb.append("    authorId: ").append(toIndentedString(authorId)).append("\n");
    sb.append("    hl: ").append(toIndentedString(hl)).append("\n");
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
