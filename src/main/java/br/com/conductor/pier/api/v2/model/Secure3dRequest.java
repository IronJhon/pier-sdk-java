package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Requisi\u00E7\u00E3o Solicita\u00E7\u00E3o Envio de OTP
 **/

@ApiModel(description = "Requisi\u00E7\u00E3o Solicita\u00E7\u00E3o Envio de OTP")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class Secure3dRequest   {
  
  private Long idCartao = null;
  private String otp = null;

  
  /**
   * Identificador da conta
   **/
  public Secure3dRequest idCartao(Long idCartao) {
    this.idCartao = idCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador da conta")
  @JsonProperty("idCartao")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * OTP que ser\u00E1 enviado para cliente
   **/
  public Secure3dRequest otp(String otp) {
    this.otp = otp;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "OTP que ser\u00E1 enviado para cliente")
  @JsonProperty("otp")
  public String getOtp() {
    return otp;
  }
  public void setOtp(String otp) {
    this.otp = otp;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Secure3dRequest secure3dRequest = (Secure3dRequest) o;
    return Objects.equals(this.idCartao, secure3dRequest.idCartao) &&
        Objects.equals(this.otp, secure3dRequest.otp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idCartao, otp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Secure3dRequest {\n");
    
    sb.append("    idCartao: ").append(toIndentedString(idCartao)).append("\n");
    sb.append("    otp: ").append(toIndentedString(otp)).append("\n");
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

