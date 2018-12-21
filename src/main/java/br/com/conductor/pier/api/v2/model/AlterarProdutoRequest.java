package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Request Representation of the device resource
 **/

@ApiModel(description = "Request Representation of the device resource")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class AlterarProdutoRequest   {
  
  private Long idProduto = null;
  private Long idOrigemComercial = null;
  private Long idEstabelecimento = null;
  private Long idPromotor = null;

  
  /**
   * Identifier Code of the product
   **/
  public AlterarProdutoRequest idProduto(Long idProduto) {
    this.idProduto = idProduto;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Identifier Code of the product")
  @JsonProperty("idProduto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * Identifier Code of the commercial origin
   **/
  public AlterarProdutoRequest idOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identifier Code of the commercial origin")
  @JsonProperty("idOrigemComercial")
  public Long getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
  }

  
  /**
   * It must be filled out with the idEstablishment where the Grade was made. When it is not informed, it is recorded with the idEstablishment associated to the Commercial Origin that captured the initial register of the account
   **/
  public AlterarProdutoRequest idEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "It must be filled out with the idEstablishment where the Grade was made. When it is not informed, it is recorded with the idEstablishment associated to the Commercial Origin that captured the initial register of the account")
  @JsonProperty("idEstabelecimento")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * It must be filled out with the idCode of the Prosecutor where the Grade was made. When it is not informed, it is recorded a standard identification code
   **/
  public AlterarProdutoRequest idPromotor(Long idPromotor) {
    this.idPromotor = idPromotor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "It must be filled out with the idCode of the Prosecutor where the Grade was made. When it is not informed, it is recorded a standard identification code")
  @JsonProperty("idPromotor")
  public Long getIdPromotor() {
    return idPromotor;
  }
  public void setIdPromotor(Long idPromotor) {
    this.idPromotor = idPromotor;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlterarProdutoRequest alterarProdutoRequest = (AlterarProdutoRequest) o;
    return Objects.equals(this.idProduto, alterarProdutoRequest.idProduto) &&
        Objects.equals(this.idOrigemComercial, alterarProdutoRequest.idOrigemComercial) &&
        Objects.equals(this.idEstabelecimento, alterarProdutoRequest.idEstabelecimento) &&
        Objects.equals(this.idPromotor, alterarProdutoRequest.idPromotor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idProduto, idOrigemComercial, idEstabelecimento, idPromotor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlterarProdutoRequest {\n");
    
    sb.append("    idProduto: ").append(toIndentedString(idProduto)).append("\n");
    sb.append("    idOrigemComercial: ").append(toIndentedString(idOrigemComercial)).append("\n");
    sb.append("    idEstabelecimento: ").append(toIndentedString(idEstabelecimento)).append("\n");
    sb.append("    idPromotor: ").append(toIndentedString(idPromotor)).append("\n");
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

