package com.digitalnao.googlescholarapi.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

/**
 * SearchMetadata
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-04-20T05:12:20.970659408Z[GMT]")


public class SearchMetadataDTO {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("json_endpoint")
  private String jsonEndpoint = null;

  @JsonProperty("created_at")
  private String createdAt = null;

  @JsonProperty("processed_at")
  private String processedAt = null;

  @JsonProperty("google_scholar_author_url")
  private String googleScholarAuthorUrl = null;

  @JsonProperty("raw_html_file")
  private String rawHtmlFile = null;

  @JsonProperty("total_time_taken")
  private Float totalTimeTaken = null;

  public SearchMetadataDTO id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SearchMetadataDTO status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public SearchMetadataDTO jsonEndpoint(String jsonEndpoint) {
    this.jsonEndpoint = jsonEndpoint;
    return this;
  }

  /**
   * Get jsonEndpoint
   * @return jsonEndpoint
   **/
  public String getJsonEndpoint() {
    return jsonEndpoint;
  }

  public void setJsonEndpoint(String jsonEndpoint) {
    this.jsonEndpoint = jsonEndpoint;
  }

  public SearchMetadataDTO createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   **/
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public SearchMetadataDTO processedAt(String processedAt) {
    this.processedAt = processedAt;
    return this;
  }

  /**
   * Get processedAt
   * @return processedAt
   **/
  public String getProcessedAt() {
    return processedAt;
  }

  public void setProcessedAt(String processedAt) {
    this.processedAt = processedAt;
  }

  public SearchMetadataDTO googleScholarAuthorUrl(String googleScholarAuthorUrl) {
    this.googleScholarAuthorUrl = googleScholarAuthorUrl;
    return this;
  }

  /**
   * Get googleScholarAuthorUrl
   * @return googleScholarAuthorUrl
   **/
  public String getGoogleScholarAuthorUrl() {
    return googleScholarAuthorUrl;
  }

  public void setGoogleScholarAuthorUrl(String googleScholarAuthorUrl) {
    this.googleScholarAuthorUrl = googleScholarAuthorUrl;
  }

  public SearchMetadataDTO rawHtmlFile(String rawHtmlFile) {
    this.rawHtmlFile = rawHtmlFile;
    return this;
  }

  /**
   * Get rawHtmlFile
   * @return rawHtmlFile
   **/
  public String getRawHtmlFile() {
    return rawHtmlFile;
  }

  public void setRawHtmlFile(String rawHtmlFile) {
    this.rawHtmlFile = rawHtmlFile;
  }

  public SearchMetadataDTO totalTimeTaken(Float totalTimeTaken) {
    this.totalTimeTaken = totalTimeTaken;
    return this;
  }

  /**
   * Get totalTimeTaken
   * @return totalTimeTaken
   **/
  public Float getTotalTimeTaken() {
    return totalTimeTaken;
  }

  public void setTotalTimeTaken(Float totalTimeTaken) {
    this.totalTimeTaken = totalTimeTaken;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchMetadataDTO searchMetadataDTO = (SearchMetadataDTO) o;
    return Objects.equals(this.id, searchMetadataDTO.id) &&
        Objects.equals(this.status, searchMetadataDTO.status) &&
        Objects.equals(this.jsonEndpoint, searchMetadataDTO.jsonEndpoint) &&
        Objects.equals(this.createdAt, searchMetadataDTO.createdAt) &&
        Objects.equals(this.processedAt, searchMetadataDTO.processedAt) &&
        Objects.equals(this.googleScholarAuthorUrl, searchMetadataDTO.googleScholarAuthorUrl) &&
        Objects.equals(this.rawHtmlFile, searchMetadataDTO.rawHtmlFile) &&
        Objects.equals(this.totalTimeTaken, searchMetadataDTO.totalTimeTaken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, jsonEndpoint, createdAt, processedAt, googleScholarAuthorUrl, rawHtmlFile, totalTimeTaken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchMetadata {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    jsonEndpoint: ").append(toIndentedString(jsonEndpoint)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    processedAt: ").append(toIndentedString(processedAt)).append("\n");
    sb.append("    googleScholarAuthorUrl: ").append(toIndentedString(googleScholarAuthorUrl)).append("\n");
    sb.append("    rawHtmlFile: ").append(toIndentedString(rawHtmlFile)).append("\n");
    sb.append("    totalTimeTaken: ").append(toIndentedString(totalTimeTaken)).append("\n");
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
