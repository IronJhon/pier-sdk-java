package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class PessoaJuridicaUpdate   {
  
  private String contato = null;
  private String razaoSocial = null;
  private String numeroReceitaFederal = null;
  private String inscricaoEstadual = null;
  private Integer banco = null;
  private Integer agencia = null;
  private String digitoAgencia = null;
  private String contaCorrente = null;
  private String digitoContaCorrente = null;

  
  /**
   * Pessoa jur\u00EDdica contato
   **/
  public PessoaJuridicaUpdate contato(String contato) {
    this.contato = contato;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Pessoa jur\u00EDdica contato")
  @JsonProperty("contato")
  public String getContato() {
    return contato;
  }
  public void setContato(String contato) {
    this.contato = contato;
  }

  
  /**
   * Raz\u00E3o social pessoa jur\u00EDdica
   **/
  public PessoaJuridicaUpdate razaoSocial(String razaoSocial) {
    this.razaoSocial = razaoSocial;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Raz\u00E3o social pessoa jur\u00EDdica")
  @JsonProperty("razaoSocial")
  public String getRazaoSocial() {
    return razaoSocial;
  }
  public void setRazaoSocial(String razaoSocial) {
    this.razaoSocial = razaoSocial;
  }

  
  /**
   * CGC(CNPJ) pessoa jur\u00EDdica
   **/
  public PessoaJuridicaUpdate numeroReceitaFederal(String numeroReceitaFederal) {
    this.numeroReceitaFederal = numeroReceitaFederal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "CGC(CNPJ) pessoa jur\u00EDdica")
  @JsonProperty("numeroReceitaFederal")
  public String getNumeroReceitaFederal() {
    return numeroReceitaFederal;
  }
  public void setNumeroReceitaFederal(String numeroReceitaFederal) {
    this.numeroReceitaFederal = numeroReceitaFederal;
  }

  
  /**
   * Inscri\u00E7\u00E3o estadual pessoa jur\u00EDdica
   **/
  public PessoaJuridicaUpdate inscricaoEstadual(String inscricaoEstadual) {
    this.inscricaoEstadual = inscricaoEstadual;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Inscri\u00E7\u00E3o estadual pessoa jur\u00EDdica")
  @JsonProperty("inscricaoEstadual")
  public String getInscricaoEstadual() {
    return inscricaoEstadual;
  }
  public void setInscricaoEstadual(String inscricaoEstadual) {
    this.inscricaoEstadual = inscricaoEstadual;
  }

  
  /**
   * Banco da pessoa jur\u00EDdica
   **/
  public PessoaJuridicaUpdate banco(Integer banco) {
    this.banco = banco;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Banco da pessoa jur\u00EDdica")
  @JsonProperty("banco")
  public Integer getBanco() {
    return banco;
  }
  public void setBanco(Integer banco) {
    this.banco = banco;
  }

  
  /**
   * Ag\u00EAncia da pessoa jur\u00EDdica
   **/
  public PessoaJuridicaUpdate agencia(Integer agencia) {
    this.agencia = agencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Ag\u00EAncia da pessoa jur\u00EDdica")
  @JsonProperty("agencia")
  public Integer getAgencia() {
    return agencia;
  }
  public void setAgencia(Integer agencia) {
    this.agencia = agencia;
  }

  
  /**
   * D\u00EDgito da agencia
   **/
  public PessoaJuridicaUpdate digitoAgencia(String digitoAgencia) {
    this.digitoAgencia = digitoAgencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "D\u00EDgito da agencia")
  @JsonProperty("digitoAgencia")
  public String getDigitoAgencia() {
    return digitoAgencia;
  }
  public void setDigitoAgencia(String digitoAgencia) {
    this.digitoAgencia = digitoAgencia;
  }

  
  /**
   * Conta corrente pessoa jur\u00EDdica
   **/
  public PessoaJuridicaUpdate contaCorrente(String contaCorrente) {
    this.contaCorrente = contaCorrente;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Conta corrente pessoa jur\u00EDdica")
  @JsonProperty("contaCorrente")
  public String getContaCorrente() {
    return contaCorrente;
  }
  public void setContaCorrente(String contaCorrente) {
    this.contaCorrente = contaCorrente;
  }

  
  /**
   * D\u00EDgito conta corrente
   **/
  public PessoaJuridicaUpdate digitoContaCorrente(String digitoContaCorrente) {
    this.digitoContaCorrente = digitoContaCorrente;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "D\u00EDgito conta corrente")
  @JsonProperty("digitoContaCorrente")
  public String getDigitoContaCorrente() {
    return digitoContaCorrente;
  }
  public void setDigitoContaCorrente(String digitoContaCorrente) {
    this.digitoContaCorrente = digitoContaCorrente;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PessoaJuridicaUpdate pessoaJuridicaUpdate = (PessoaJuridicaUpdate) o;
    return Objects.equals(this.contato, pessoaJuridicaUpdate.contato) &&
        Objects.equals(this.razaoSocial, pessoaJuridicaUpdate.razaoSocial) &&
        Objects.equals(this.numeroReceitaFederal, pessoaJuridicaUpdate.numeroReceitaFederal) &&
        Objects.equals(this.inscricaoEstadual, pessoaJuridicaUpdate.inscricaoEstadual) &&
        Objects.equals(this.banco, pessoaJuridicaUpdate.banco) &&
        Objects.equals(this.agencia, pessoaJuridicaUpdate.agencia) &&
        Objects.equals(this.digitoAgencia, pessoaJuridicaUpdate.digitoAgencia) &&
        Objects.equals(this.contaCorrente, pessoaJuridicaUpdate.contaCorrente) &&
        Objects.equals(this.digitoContaCorrente, pessoaJuridicaUpdate.digitoContaCorrente);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contato, razaoSocial, numeroReceitaFederal, inscricaoEstadual, banco, agencia, digitoAgencia, contaCorrente, digitoContaCorrente);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PessoaJuridicaUpdate {\n");
    
    sb.append("    contato: ").append(toIndentedString(contato)).append("\n");
    sb.append("    razaoSocial: ").append(toIndentedString(razaoSocial)).append("\n");
    sb.append("    numeroReceitaFederal: ").append(toIndentedString(numeroReceitaFederal)).append("\n");
    sb.append("    inscricaoEstadual: ").append(toIndentedString(inscricaoEstadual)).append("\n");
    sb.append("    banco: ").append(toIndentedString(banco)).append("\n");
    sb.append("    agencia: ").append(toIndentedString(agencia)).append("\n");
    sb.append("    digitoAgencia: ").append(toIndentedString(digitoAgencia)).append("\n");
    sb.append("    contaCorrente: ").append(toIndentedString(contaCorrente)).append("\n");
    sb.append("    digitoContaCorrente: ").append(toIndentedString(digitoContaCorrente)).append("\n");
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

