package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Object to change accounts. None of the fields are required. Only the fields you want to change must be entered
 **/

@ApiModel(description = "Object to change accounts. None of the fields are required. Only the fields you want to change must be entered")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ContaPartialUpdate   {
  
  private String funcaoAtiva = null;
  private Long idContaEmissor = null;

  
  /**
   * Active account function. Represents the function in which the account is enabled. Property should only be reported if the issuer makes use of account functions. The functions available for the accounts can be viewed in api/contas/tipos-funcoes
   **/
  public ContaPartialUpdate funcaoAtiva(String funcaoAtiva) {
    this.funcaoAtiva = funcaoAtiva;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Active account function. Represents the function in which the account is enabled. Property should only be reported if the issuer makes use of account functions. The functions available for the accounts can be viewed in api/contas/tipos-funcoes")
  @JsonProperty("funcaoAtiva")
  public String getFuncaoAtiva() {
    return funcaoAtiva;
  }
  public void setFuncaoAtiva(String funcaoAtiva) {
    this.funcaoAtiva = funcaoAtiva;
  }

  
  /**
   * Identifier of the internal control account created by the issuer
   **/
  public ContaPartialUpdate idContaEmissor(Long idContaEmissor) {
    this.idContaEmissor = idContaEmissor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identifier of the internal control account created by the issuer")
  @JsonProperty("idContaEmissor")
  public Long getIdContaEmissor() {
    return idContaEmissor;
  }
  public void setIdContaEmissor(Long idContaEmissor) {
    this.idContaEmissor = idContaEmissor;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContaPartialUpdate contaPartialUpdate = (ContaPartialUpdate) o;
    return Objects.equals(this.funcaoAtiva, contaPartialUpdate.funcaoAtiva) &&
        Objects.equals(this.idContaEmissor, contaPartialUpdate.idContaEmissor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(funcaoAtiva, idContaEmissor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContaPartialUpdate {\n");
    
    sb.append("    funcaoAtiva: ").append(toIndentedString(funcaoAtiva)).append("\n");
    sb.append("    idContaEmissor: ").append(toIndentedString(idContaEmissor)).append("\n");
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

