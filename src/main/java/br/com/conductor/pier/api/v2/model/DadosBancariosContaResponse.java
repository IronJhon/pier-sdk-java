package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Bank data
 **/

@ApiModel(description = "Bank data")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class DadosBancariosContaResponse   {
  
  private Long id = null;
  private Long idConta = null;
  private Long codigoBanco = null;
  private Long numeroAgencia = null;
  private String numeroContaCorrente = null;
  private Long idTipoContaBancaria = null;
  private String dvContaCorrente = null;
  private Integer dvAgencia = null;

  
  /**
   * Identification Code of the register bank data (id)
   **/
  public DadosBancariosContaResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the register bank data (id)")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Identification Code of the account (id)
   **/
  public DadosBancariosContaResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the account (id)")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Bank number
   **/
  public DadosBancariosContaResponse codigoBanco(Long codigoBanco) {
    this.codigoBanco = codigoBanco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Bank number")
  @JsonProperty("codigoBanco")
  public Long getCodigoBanco() {
    return codigoBanco;
  }
  public void setCodigoBanco(Long codigoBanco) {
    this.codigoBanco = codigoBanco;
  }

  
  /**
   * Agency number
   **/
  public DadosBancariosContaResponse numeroAgencia(Long numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Agency number")
  @JsonProperty("numeroAgencia")
  public Long getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(Long numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   * Account number
   **/
  public DadosBancariosContaResponse numeroContaCorrente(String numeroContaCorrente) {
    this.numeroContaCorrente = numeroContaCorrente;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Account number")
  @JsonProperty("numeroContaCorrente")
  public String getNumeroContaCorrente() {
    return numeroContaCorrente;
  }
  public void setNumeroContaCorrente(String numeroContaCorrente) {
    this.numeroContaCorrente = numeroContaCorrente;
  }

  
  /**
   * Identification Code of the register bank account type (id)
   **/
  public DadosBancariosContaResponse idTipoContaBancaria(Long idTipoContaBancaria) {
    this.idTipoContaBancaria = idTipoContaBancaria;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the register bank account type (id)")
  @JsonProperty("idTipoContaBancaria")
  public Long getIdTipoContaBancaria() {
    return idTipoContaBancaria;
  }
  public void setIdTipoContaBancaria(Long idTipoContaBancaria) {
    this.idTipoContaBancaria = idTipoContaBancaria;
  }

  
  /**
   **/
  public DadosBancariosContaResponse dvContaCorrente(String dvContaCorrente) {
    this.dvContaCorrente = dvContaCorrente;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dvContaCorrente")
  public String getDvContaCorrente() {
    return dvContaCorrente;
  }
  public void setDvContaCorrente(String dvContaCorrente) {
    this.dvContaCorrente = dvContaCorrente;
  }

  
  /**
   **/
  public DadosBancariosContaResponse dvAgencia(Integer dvAgencia) {
    this.dvAgencia = dvAgencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dvAgencia")
  public Integer getDvAgencia() {
    return dvAgencia;
  }
  public void setDvAgencia(Integer dvAgencia) {
    this.dvAgencia = dvAgencia;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DadosBancariosContaResponse dadosBancariosContaResponse = (DadosBancariosContaResponse) o;
    return Objects.equals(this.id, dadosBancariosContaResponse.id) &&
        Objects.equals(this.idConta, dadosBancariosContaResponse.idConta) &&
        Objects.equals(this.codigoBanco, dadosBancariosContaResponse.codigoBanco) &&
        Objects.equals(this.numeroAgencia, dadosBancariosContaResponse.numeroAgencia) &&
        Objects.equals(this.numeroContaCorrente, dadosBancariosContaResponse.numeroContaCorrente) &&
        Objects.equals(this.idTipoContaBancaria, dadosBancariosContaResponse.idTipoContaBancaria) &&
        Objects.equals(this.dvContaCorrente, dadosBancariosContaResponse.dvContaCorrente) &&
        Objects.equals(this.dvAgencia, dadosBancariosContaResponse.dvAgencia);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idConta, codigoBanco, numeroAgencia, numeroContaCorrente, idTipoContaBancaria, dvContaCorrente, dvAgencia);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosBancariosContaResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    codigoBanco: ").append(toIndentedString(codigoBanco)).append("\n");
    sb.append("    numeroAgencia: ").append(toIndentedString(numeroAgencia)).append("\n");
    sb.append("    numeroContaCorrente: ").append(toIndentedString(numeroContaCorrente)).append("\n");
    sb.append("    idTipoContaBancaria: ").append(toIndentedString(idTipoContaBancaria)).append("\n");
    sb.append("    dvContaCorrente: ").append(toIndentedString(dvContaCorrente)).append("\n");
    sb.append("    dvAgencia: ").append(toIndentedString(dvAgencia)).append("\n");
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

