package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Par\u00E2metros de requisi\u00E7\u00E3o para cadastrar grupo econ\u00F4mico
 **/

@ApiModel(description = "Par\u00E2metros de requisi\u00E7\u00E3o para cadastrar grupo econ\u00F4mico")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class GrupoEconomicoDTO   {
  
  private String razaoSocial = null;
  private String nomeCredor = null;
  private String numeroReceitaFederal = null;
  private String inscricaoEstadual = null;
  private String contato = null;
  private Integer banco = null;
  private Integer agencia = null;
  private String digitoAgencia = null;
  private String contaCorrente = null;
  private String digitoContaCorrente = null;


  public enum PeriodicidadeEnum {
    DIARIO("DIARIO"),
    SEMANAL("SEMANAL"),
    MENSAL("MENSAL"),
    DECENDIAL("DECENDIAL"),
    QUINZENAL("QUINZENAL");

    private String value;

    PeriodicidadeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private PeriodicidadeEnum periodicidade = null;


  public enum PagamentoSemanalEnum {
    SEGUNDA("SEGUNDA"),
    TERCA("TERCA"),
    QUARTA("QUARTA"),
    QUINTA("QUINTA"),
    SEXTA("SEXTA"),
    SABADO("SABADO"),
    DOMINGO("DOMINGO");

    private String value;

    PagamentoSemanalEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private PagamentoSemanalEnum pagamentoSemanal = null;
  private Integer pagamentoMensal = null;
  private Integer pagamentoDecendialPrimeiro = null;
  private Integer pagamentoDecendialSegundo = null;
  private Integer pagamentoDecendialTerceiro = null;
  private Integer pagamentoQuinzenalPrimeiro = null;
  private Integer pagamentoQuinzenalSegundo = null;
  private Long idCredorRAV = null;
  private BigDecimal percentualRAV = null;


  public enum RecebeRAVEnum {
    NAO_TEM_PERMISSAO_RAV("NAO_TEM_PERMISSAO_RAV"),
    CREDITO_RAV("CREDITO_RAV"),
    DEBITO_RAV("DEBITO_RAV");

    private String value;

    RecebeRAVEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private RecebeRAVEnum recebeRAV = null;
  private BigDecimal percentualMultiplica = null;
  private BigDecimal taxaAdm = null;
  private BigDecimal taxaBanco = null;
  private BigDecimal limiteRAV = null;

  
  /**
   * Raz\u00E3o social da pessoa jur\u00EDdica
   **/
  public GrupoEconomicoDTO razaoSocial(String razaoSocial) {
    this.razaoSocial = razaoSocial;
    return this;
  }
  
  @ApiModelProperty(example = "Razão social exemplo", required = true, value = "Raz\u00E3o social da pessoa jur\u00EDdica")
  @JsonProperty("razaoSocial")
  public String getRazaoSocial() {
    return razaoSocial;
  }
  public void setRazaoSocial(String razaoSocial) {
    this.razaoSocial = razaoSocial;
  }

  
  /**
   * Nome do credor
   **/
  public GrupoEconomicoDTO nomeCredor(String nomeCredor) {
    this.nomeCredor = nomeCredor;
    return this;
  }
  
  @ApiModelProperty(example = "Exemplo", value = "Nome do credor")
  @JsonProperty("nomeCredor")
  public String getNomeCredor() {
    return nomeCredor;
  }
  public void setNomeCredor(String nomeCredor) {
    this.nomeCredor = nomeCredor;
  }

  
  /**
   * N\u00FAmero da Receita Federal
   **/
  public GrupoEconomicoDTO numeroReceitaFederal(String numeroReceitaFederal) {
    this.numeroReceitaFederal = numeroReceitaFederal;
    return this;
  }
  
  @ApiModelProperty(example = "00405702000155", required = true, value = "N\u00FAmero da Receita Federal")
  @JsonProperty("numeroReceitaFederal")
  public String getNumeroReceitaFederal() {
    return numeroReceitaFederal;
  }
  public void setNumeroReceitaFederal(String numeroReceitaFederal) {
    this.numeroReceitaFederal = numeroReceitaFederal;
  }

  
  /**
   * N\u00FAmero da inscri\u00E7\u00E3o estadual
   **/
  public GrupoEconomicoDTO inscricaoEstadual(String inscricaoEstadual) {
    this.inscricaoEstadual = inscricaoEstadual;
    return this;
  }
  
  @ApiModelProperty(example = "14511", value = "N\u00FAmero da inscri\u00E7\u00E3o estadual")
  @JsonProperty("inscricaoEstadual")
  public String getInscricaoEstadual() {
    return inscricaoEstadual;
  }
  public void setInscricaoEstadual(String inscricaoEstadual) {
    this.inscricaoEstadual = inscricaoEstadual;
  }

  
  /**
   * Nome da pessoa para entrar em contato
   **/
  public GrupoEconomicoDTO contato(String contato) {
    this.contato = contato;
    return this;
  }
  
  @ApiModelProperty(example = "NOME DE PESSOA PARA CONTATO", value = "Nome da pessoa para entrar em contato")
  @JsonProperty("contato")
  public String getContato() {
    return contato;
  }
  public void setContato(String contato) {
    this.contato = contato;
  }

  
  /**
   * C\u00F3digo do banco
   **/
  public GrupoEconomicoDTO banco(Integer banco) {
    this.banco = banco;
    return this;
  }
  
  @ApiModelProperty(example = "1", value = "C\u00F3digo do banco")
  @JsonProperty("banco")
  public Integer getBanco() {
    return banco;
  }
  public void setBanco(Integer banco) {
    this.banco = banco;
  }

  
  /**
   * C\u00F3digo da ag\u00EAncia
   **/
  public GrupoEconomicoDTO agencia(Integer agencia) {
    this.agencia = agencia;
    return this;
  }
  
  @ApiModelProperty(example = "4571", value = "C\u00F3digo da ag\u00EAncia")
  @JsonProperty("agencia")
  public Integer getAgencia() {
    return agencia;
  }
  public void setAgencia(Integer agencia) {
    this.agencia = agencia;
  }

  
  /**
   * D\u00EDgito verificador da ag\u00EAncia
   **/
  public GrupoEconomicoDTO digitoAgencia(String digitoAgencia) {
    this.digitoAgencia = digitoAgencia;
    return this;
  }
  
  @ApiModelProperty(example = "XX", value = "D\u00EDgito verificador da ag\u00EAncia")
  @JsonProperty("digitoAgencia")
  public String getDigitoAgencia() {
    return digitoAgencia;
  }
  public void setDigitoAgencia(String digitoAgencia) {
    this.digitoAgencia = digitoAgencia;
  }

  
  /**
   * C\u00F3digo da Conta Corrente
   **/
  public GrupoEconomicoDTO contaCorrente(String contaCorrente) {
    this.contaCorrente = contaCorrente;
    return this;
  }
  
  @ApiModelProperty(example = "100887", value = "C\u00F3digo da Conta Corrente")
  @JsonProperty("contaCorrente")
  public String getContaCorrente() {
    return contaCorrente;
  }
  public void setContaCorrente(String contaCorrente) {
    this.contaCorrente = contaCorrente;
  }

  
  /**
   * D\u00EDgito Verificador da Conta Corrente
   **/
  public GrupoEconomicoDTO digitoContaCorrente(String digitoContaCorrente) {
    this.digitoContaCorrente = digitoContaCorrente;
    return this;
  }
  
  @ApiModelProperty(example = "11", value = "D\u00EDgito Verificador da Conta Corrente")
  @JsonProperty("digitoContaCorrente")
  public String getDigitoContaCorrente() {
    return digitoContaCorrente;
  }
  public void setDigitoContaCorrente(String digitoContaCorrente) {
    this.digitoContaCorrente = digitoContaCorrente;
  }

  
  /**
   * Periodicidade do pagamento
   **/
  public GrupoEconomicoDTO periodicidade(PeriodicidadeEnum periodicidade) {
    this.periodicidade = periodicidade;
    return this;
  }
  
  @ApiModelProperty(example = "DIARIO", required = true, value = "Periodicidade do pagamento")
  @JsonProperty("periodicidade")
  public PeriodicidadeEnum getPeriodicidade() {
    return periodicidade;
  }
  public void setPeriodicidade(PeriodicidadeEnum periodicidade) {
    this.periodicidade = periodicidade;
  }

  
  /**
   * Dia para pagamento semanal
   **/
  public GrupoEconomicoDTO pagamentoSemanal(PagamentoSemanalEnum pagamentoSemanal) {
    this.pagamentoSemanal = pagamentoSemanal;
    return this;
  }
  
  @ApiModelProperty(example = "SEGUNDA", value = "Dia para pagamento semanal")
  @JsonProperty("pagamentoSemanal")
  public PagamentoSemanalEnum getPagamentoSemanal() {
    return pagamentoSemanal;
  }
  public void setPagamentoSemanal(PagamentoSemanalEnum pagamentoSemanal) {
    this.pagamentoSemanal = pagamentoSemanal;
  }

  
  /**
   * Dia da data para o pagamento mensal
   **/
  public GrupoEconomicoDTO pagamentoMensal(Integer pagamentoMensal) {
    this.pagamentoMensal = pagamentoMensal;
    return this;
  }
  
  @ApiModelProperty(example = "10", value = "Dia da data para o pagamento mensal")
  @JsonProperty("pagamentoMensal")
  public Integer getPagamentoMensal() {
    return pagamentoMensal;
  }
  public void setPagamentoMensal(Integer pagamentoMensal) {
    this.pagamentoMensal = pagamentoMensal;
  }

  
  /**
   * Dia da data para o primeiro pagamento decendial
   **/
  public GrupoEconomicoDTO pagamentoDecendialPrimeiro(Integer pagamentoDecendialPrimeiro) {
    this.pagamentoDecendialPrimeiro = pagamentoDecendialPrimeiro;
    return this;
  }
  
  @ApiModelProperty(example = "5", value = "Dia da data para o primeiro pagamento decendial")
  @JsonProperty("pagamentoDecendialPrimeiro")
  public Integer getPagamentoDecendialPrimeiro() {
    return pagamentoDecendialPrimeiro;
  }
  public void setPagamentoDecendialPrimeiro(Integer pagamentoDecendialPrimeiro) {
    this.pagamentoDecendialPrimeiro = pagamentoDecendialPrimeiro;
  }

  
  /**
   * Dia da data para o segundo pagamento decendial
   **/
  public GrupoEconomicoDTO pagamentoDecendialSegundo(Integer pagamentoDecendialSegundo) {
    this.pagamentoDecendialSegundo = pagamentoDecendialSegundo;
    return this;
  }
  
  @ApiModelProperty(example = "15", value = "Dia da data para o segundo pagamento decendial")
  @JsonProperty("pagamentoDecendialSegundo")
  public Integer getPagamentoDecendialSegundo() {
    return pagamentoDecendialSegundo;
  }
  public void setPagamentoDecendialSegundo(Integer pagamentoDecendialSegundo) {
    this.pagamentoDecendialSegundo = pagamentoDecendialSegundo;
  }

  
  /**
   * Dia da data para o terceiro pagamento decendial
   **/
  public GrupoEconomicoDTO pagamentoDecendialTerceiro(Integer pagamentoDecendialTerceiro) {
    this.pagamentoDecendialTerceiro = pagamentoDecendialTerceiro;
    return this;
  }
  
  @ApiModelProperty(example = "25", value = "Dia da data para o terceiro pagamento decendial")
  @JsonProperty("pagamentoDecendialTerceiro")
  public Integer getPagamentoDecendialTerceiro() {
    return pagamentoDecendialTerceiro;
  }
  public void setPagamentoDecendialTerceiro(Integer pagamentoDecendialTerceiro) {
    this.pagamentoDecendialTerceiro = pagamentoDecendialTerceiro;
  }

  
  /**
   * Dia da data para o primeiro pagamento quinzenal
   **/
  public GrupoEconomicoDTO pagamentoQuinzenalPrimeiro(Integer pagamentoQuinzenalPrimeiro) {
    this.pagamentoQuinzenalPrimeiro = pagamentoQuinzenalPrimeiro;
    return this;
  }
  
  @ApiModelProperty(example = "5", value = "Dia da data para o primeiro pagamento quinzenal")
  @JsonProperty("pagamentoQuinzenalPrimeiro")
  public Integer getPagamentoQuinzenalPrimeiro() {
    return pagamentoQuinzenalPrimeiro;
  }
  public void setPagamentoQuinzenalPrimeiro(Integer pagamentoQuinzenalPrimeiro) {
    this.pagamentoQuinzenalPrimeiro = pagamentoQuinzenalPrimeiro;
  }

  
  /**
   * Dia da data para o segundo pagamento quinzenal
   **/
  public GrupoEconomicoDTO pagamentoQuinzenalSegundo(Integer pagamentoQuinzenalSegundo) {
    this.pagamentoQuinzenalSegundo = pagamentoQuinzenalSegundo;
    return this;
  }
  
  @ApiModelProperty(example = "20", value = "Dia da data para o segundo pagamento quinzenal")
  @JsonProperty("pagamentoQuinzenalSegundo")
  public Integer getPagamentoQuinzenalSegundo() {
    return pagamentoQuinzenalSegundo;
  }
  public void setPagamentoQuinzenalSegundo(Integer pagamentoQuinzenalSegundo) {
    this.pagamentoQuinzenalSegundo = pagamentoQuinzenalSegundo;
  }

  
  /**
   * Identificador do credor RAV
   **/
  public GrupoEconomicoDTO idCredorRAV(Long idCredorRAV) {
    this.idCredorRAV = idCredorRAV;
    return this;
  }
  
  @ApiModelProperty(example = "1", required = true, value = "Identificador do credor RAV")
  @JsonProperty("idCredorRAV")
  public Long getIdCredorRAV() {
    return idCredorRAV;
  }
  public void setIdCredorRAV(Long idCredorRAV) {
    this.idCredorRAV = idCredorRAV;
  }

  
  /**
   * Valor percentual do RAV do credor
   **/
  public GrupoEconomicoDTO percentualRAV(BigDecimal percentualRAV) {
    this.percentualRAV = percentualRAV;
    return this;
  }
  
  @ApiModelProperty(example = "0.015", required = true, value = "Valor percentual do RAV do credor")
  @JsonProperty("percentualRAV")
  public BigDecimal getPercentualRAV() {
    return percentualRAV;
  }
  public void setPercentualRAV(BigDecimal percentualRAV) {
    this.percentualRAV = percentualRAV;
  }

  
  /**
   * Indica se o credor recebe RAV e o tipo
   **/
  public GrupoEconomicoDTO recebeRAV(RecebeRAVEnum recebeRAV) {
    this.recebeRAV = recebeRAV;
    return this;
  }
  
  @ApiModelProperty(example = "NAO_TEM_PERMISSAO_RAV", value = "Indica se o credor recebe RAV e o tipo")
  @JsonProperty("recebeRAV")
  public RecebeRAVEnum getRecebeRAV() {
    return recebeRAV;
  }
  public void setRecebeRAV(RecebeRAVEnum recebeRAV) {
    this.recebeRAV = recebeRAV;
  }

  
  /**
   * Percentual Multiplica
   **/
  public GrupoEconomicoDTO percentualMultiplica(BigDecimal percentualMultiplica) {
    this.percentualMultiplica = percentualMultiplica;
    return this;
  }
  
  @ApiModelProperty(example = "0.1", value = "Percentual Multiplica")
  @JsonProperty("percentualMultiplica")
  public BigDecimal getPercentualMultiplica() {
    return percentualMultiplica;
  }
  public void setPercentualMultiplica(BigDecimal percentualMultiplica) {
    this.percentualMultiplica = percentualMultiplica;
  }

  
  /**
   * Taxa Administrativa
   **/
  public GrupoEconomicoDTO taxaAdm(BigDecimal taxaAdm) {
    this.taxaAdm = taxaAdm;
    return this;
  }
  
  @ApiModelProperty(example = "0.1", value = "Taxa Administrativa")
  @JsonProperty("taxaAdm")
  public BigDecimal getTaxaAdm() {
    return taxaAdm;
  }
  public void setTaxaAdm(BigDecimal taxaAdm) {
    this.taxaAdm = taxaAdm;
  }

  
  /**
   * Taxa do Banco
   **/
  public GrupoEconomicoDTO taxaBanco(BigDecimal taxaBanco) {
    this.taxaBanco = taxaBanco;
    return this;
  }
  
  @ApiModelProperty(example = "0.1", value = "Taxa do Banco")
  @JsonProperty("taxaBanco")
  public BigDecimal getTaxaBanco() {
    return taxaBanco;
  }
  public void setTaxaBanco(BigDecimal taxaBanco) {
    this.taxaBanco = taxaBanco;
  }

  
  /**
   * Valor limite do RAV
   **/
  public GrupoEconomicoDTO limiteRAV(BigDecimal limiteRAV) {
    this.limiteRAV = limiteRAV;
    return this;
  }
  
  @ApiModelProperty(example = "0.015", value = "Valor limite do RAV")
  @JsonProperty("limiteRAV")
  public BigDecimal getLimiteRAV() {
    return limiteRAV;
  }
  public void setLimiteRAV(BigDecimal limiteRAV) {
    this.limiteRAV = limiteRAV;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GrupoEconomicoDTO grupoEconomicoDTO = (GrupoEconomicoDTO) o;
    return Objects.equals(this.razaoSocial, grupoEconomicoDTO.razaoSocial) &&
        Objects.equals(this.nomeCredor, grupoEconomicoDTO.nomeCredor) &&
        Objects.equals(this.numeroReceitaFederal, grupoEconomicoDTO.numeroReceitaFederal) &&
        Objects.equals(this.inscricaoEstadual, grupoEconomicoDTO.inscricaoEstadual) &&
        Objects.equals(this.contato, grupoEconomicoDTO.contato) &&
        Objects.equals(this.banco, grupoEconomicoDTO.banco) &&
        Objects.equals(this.agencia, grupoEconomicoDTO.agencia) &&
        Objects.equals(this.digitoAgencia, grupoEconomicoDTO.digitoAgencia) &&
        Objects.equals(this.contaCorrente, grupoEconomicoDTO.contaCorrente) &&
        Objects.equals(this.digitoContaCorrente, grupoEconomicoDTO.digitoContaCorrente) &&
        Objects.equals(this.periodicidade, grupoEconomicoDTO.periodicidade) &&
        Objects.equals(this.pagamentoSemanal, grupoEconomicoDTO.pagamentoSemanal) &&
        Objects.equals(this.pagamentoMensal, grupoEconomicoDTO.pagamentoMensal) &&
        Objects.equals(this.pagamentoDecendialPrimeiro, grupoEconomicoDTO.pagamentoDecendialPrimeiro) &&
        Objects.equals(this.pagamentoDecendialSegundo, grupoEconomicoDTO.pagamentoDecendialSegundo) &&
        Objects.equals(this.pagamentoDecendialTerceiro, grupoEconomicoDTO.pagamentoDecendialTerceiro) &&
        Objects.equals(this.pagamentoQuinzenalPrimeiro, grupoEconomicoDTO.pagamentoQuinzenalPrimeiro) &&
        Objects.equals(this.pagamentoQuinzenalSegundo, grupoEconomicoDTO.pagamentoQuinzenalSegundo) &&
        Objects.equals(this.idCredorRAV, grupoEconomicoDTO.idCredorRAV) &&
        Objects.equals(this.percentualRAV, grupoEconomicoDTO.percentualRAV) &&
        Objects.equals(this.recebeRAV, grupoEconomicoDTO.recebeRAV) &&
        Objects.equals(this.percentualMultiplica, grupoEconomicoDTO.percentualMultiplica) &&
        Objects.equals(this.taxaAdm, grupoEconomicoDTO.taxaAdm) &&
        Objects.equals(this.taxaBanco, grupoEconomicoDTO.taxaBanco) &&
        Objects.equals(this.limiteRAV, grupoEconomicoDTO.limiteRAV);
  }

  @Override
  public int hashCode() {
    return Objects.hash(razaoSocial, nomeCredor, numeroReceitaFederal, inscricaoEstadual, contato, banco, agencia, digitoAgencia, contaCorrente, digitoContaCorrente, periodicidade, pagamentoSemanal, pagamentoMensal, pagamentoDecendialPrimeiro, pagamentoDecendialSegundo, pagamentoDecendialTerceiro, pagamentoQuinzenalPrimeiro, pagamentoQuinzenalSegundo, idCredorRAV, percentualRAV, recebeRAV, percentualMultiplica, taxaAdm, taxaBanco, limiteRAV);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GrupoEconomicoDTO {\n");
    
    sb.append("    razaoSocial: ").append(toIndentedString(razaoSocial)).append("\n");
    sb.append("    nomeCredor: ").append(toIndentedString(nomeCredor)).append("\n");
    sb.append("    numeroReceitaFederal: ").append(toIndentedString(numeroReceitaFederal)).append("\n");
    sb.append("    inscricaoEstadual: ").append(toIndentedString(inscricaoEstadual)).append("\n");
    sb.append("    contato: ").append(toIndentedString(contato)).append("\n");
    sb.append("    banco: ").append(toIndentedString(banco)).append("\n");
    sb.append("    agencia: ").append(toIndentedString(agencia)).append("\n");
    sb.append("    digitoAgencia: ").append(toIndentedString(digitoAgencia)).append("\n");
    sb.append("    contaCorrente: ").append(toIndentedString(contaCorrente)).append("\n");
    sb.append("    digitoContaCorrente: ").append(toIndentedString(digitoContaCorrente)).append("\n");
    sb.append("    periodicidade: ").append(toIndentedString(periodicidade)).append("\n");
    sb.append("    pagamentoSemanal: ").append(toIndentedString(pagamentoSemanal)).append("\n");
    sb.append("    pagamentoMensal: ").append(toIndentedString(pagamentoMensal)).append("\n");
    sb.append("    pagamentoDecendialPrimeiro: ").append(toIndentedString(pagamentoDecendialPrimeiro)).append("\n");
    sb.append("    pagamentoDecendialSegundo: ").append(toIndentedString(pagamentoDecendialSegundo)).append("\n");
    sb.append("    pagamentoDecendialTerceiro: ").append(toIndentedString(pagamentoDecendialTerceiro)).append("\n");
    sb.append("    pagamentoQuinzenalPrimeiro: ").append(toIndentedString(pagamentoQuinzenalPrimeiro)).append("\n");
    sb.append("    pagamentoQuinzenalSegundo: ").append(toIndentedString(pagamentoQuinzenalSegundo)).append("\n");
    sb.append("    idCredorRAV: ").append(toIndentedString(idCredorRAV)).append("\n");
    sb.append("    percentualRAV: ").append(toIndentedString(percentualRAV)).append("\n");
    sb.append("    recebeRAV: ").append(toIndentedString(recebeRAV)).append("\n");
    sb.append("    percentualMultiplica: ").append(toIndentedString(percentualMultiplica)).append("\n");
    sb.append("    taxaAdm: ").append(toIndentedString(taxaAdm)).append("\n");
    sb.append("    taxaBanco: ").append(toIndentedString(taxaBanco)).append("\n");
    sb.append("    limiteRAV: ").append(toIndentedString(limiteRAV)).append("\n");
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

