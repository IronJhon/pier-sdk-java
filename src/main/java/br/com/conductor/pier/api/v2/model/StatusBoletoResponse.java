package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Representa\u00E7\u00E3o da resposta do recurso de status de boleto
 **/

@ApiModel(description = "Representa\u00E7\u00E3o da resposta do recurso de status de boleto")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class StatusBoletoResponse   {
  
  private String status = null;
  private String data = null;

  
  /**
   * Descri\u00E7\u00E3o do status CNAB sumarizado do boleto
   **/
  public StatusBoletoResponse status(String status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00E7\u00E3o do status CNAB sumarizado do boleto")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * Data em que o status foi definido
   **/
  public StatusBoletoResponse data(String data) {
    this.data = data;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data em que o status foi definido")
  @JsonProperty("data")
  public String getData() {
    return data;
  }
  public void setData(String data) {
    this.data = data;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusBoletoResponse statusBoletoResponse = (StatusBoletoResponse) o;
    return Objects.equals(this.status, statusBoletoResponse.status) &&
        Objects.equals(this.data, statusBoletoResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusBoletoResponse {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

