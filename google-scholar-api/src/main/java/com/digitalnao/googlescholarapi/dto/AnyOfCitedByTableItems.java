package com.digitalnao.googlescholarapi.dto;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
* AnyOfCitedByTableItems
*/
@JsonTypeInfo(
  use = JsonTypeInfo.Id.NAME,
  include = JsonTypeInfo.As.PROPERTY,
  property = "type")
@JsonSubTypes({
  @JsonSubTypes.Type(value = CitationDTO.class, name = "Citation"),
  @JsonSubTypes.Type(value = IndiceHDTO.class, name = "IndiceH"),
  @JsonSubTypes.Type(value = IndiceI10DTO.class, name = "IndiceI10")
})
public interface AnyOfCitedByTableItems {

}
