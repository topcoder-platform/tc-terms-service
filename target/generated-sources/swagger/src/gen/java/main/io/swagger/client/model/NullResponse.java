/*
 * ap-terms-microservice
 * Services that provide access and interaction with terms. 
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.NullResponseResult;

/**
 * NullResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-21T14:09:31.341+08:00")
public class NullResponse {
  @SerializedName("id")
  private String id = null;

  @SerializedName("version")
  private String version = null;

  @SerializedName("result")
  private NullResponseResult result = null;

  public NullResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * unique id identifying the request
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "unique id identifying the request")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public NullResponse version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public NullResponse result(NullResponseResult result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @ApiModelProperty(example = "null", value = "")
  public NullResponseResult getResult() {
    return result;
  }

  public void setResult(NullResponseResult result) {
    this.result = result;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NullResponse nullResponse = (NullResponse) o;
    return Objects.equals(this.id, nullResponse.id) &&
        Objects.equals(this.version, nullResponse.version) &&
        Objects.equals(this.result, nullResponse.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, version, result);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NullResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

