package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.AntecipacaoSimuladaDetalhesResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;



/**
 * Response Representation of the Simulated Antecipation resource
 **/

@ApiModel(description = "Response Representation of the Simulated Antecipation resource")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class AntecipacaoSimuladaResponse   {
  
  private Long mcc = null;
  private String uf = null;
  private Long idAntecipacaoSimulada = null;
  private Long idConta = null;
  private Long idCompra = null;
  private Long idTipoTransacao = null;
  private Integer quantidadeParcelasAntecipaveis = null;
  private BigDecimal valorParcela = null;
  private String dataHoraSimulacao = null;
  private BigDecimal taxaAntecipacaoAno = null;
  private String nomeEstabelecimento = null;
  private String status = null;
  private String dataCompra = null;
  private String tipoOrigemTransacao = null;
  private String cidade = null;
  private String pais = null;
  private String latitude = null;
  private String longitude = null;
  private Long idGrupoMCC = null;
  private String descricaoGrupoMCC = null;
  private Long idProduto = null;
  private String descricaoProduto = null;
  private String descricaoEstabelecimento = null;
  private String nomeFantasiaEstabelecimento = null;
  private List<AntecipacaoSimuladaDetalhesResponse> detalhes = new ArrayList<AntecipacaoSimuladaDetalhesResponse>();

  
  /**
   **/
  public AntecipacaoSimuladaResponse mcc(Long mcc) {
    this.mcc = mcc;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("mcc")
  public Long getMcc() {
    return mcc;
  }
  public void setMcc(Long mcc) {
    this.mcc = mcc;
  }

  
  /**
   **/
  public AntecipacaoSimuladaResponse uf(String uf) {
    this.uf = uf;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("uf")
  public String getUf() {
    return uf;
  }
  public void setUf(String uf) {
    this.uf = uf;
  }

  
  /**
   * Identifier Code of the simulation of antecipation
   **/
  public AntecipacaoSimuladaResponse idAntecipacaoSimulada(Long idAntecipacaoSimulada) {
    this.idAntecipacaoSimulada = idAntecipacaoSimulada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identifier Code of the simulation of antecipation")
  @JsonProperty("idAntecipacaoSimulada")
  public Long getIdAntecipacaoSimulada() {
    return idAntecipacaoSimulada;
  }
  public void setIdAntecipacaoSimulada(Long idAntecipacaoSimulada) {
    this.idAntecipacaoSimulada = idAntecipacaoSimulada;
  }

  
  /**
   * Identifier Code of the Account
   **/
  public AntecipacaoSimuladaResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identifier Code of the Account")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Identifier Code of the shop event
   **/
  public AntecipacaoSimuladaResponse idCompra(Long idCompra) {
    this.idCompra = idCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identifier Code of the shop event")
  @JsonProperty("idCompra")
  public Long getIdCompra() {
    return idCompra;
  }
  public void setIdCompra(Long idCompra) {
    this.idCompra = idCompra;
  }

  
  /**
   * Identifier Code of type of the shop event
   **/
  public AntecipacaoSimuladaResponse idTipoTransacao(Long idTipoTransacao) {
    this.idTipoTransacao = idTipoTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identifier Code of type of the shop event")
  @JsonProperty("idTipoTransacao")
  public Long getIdTipoTransacao() {
    return idTipoTransacao;
  }
  public void setIdTipoTransacao(Long idTipoTransacao) {
    this.idTipoTransacao = idTipoTransacao;
  }

  
  /**
   * Quantity of the antecipated parcels
   **/
  public AntecipacaoSimuladaResponse quantidadeParcelasAntecipaveis(Integer quantidadeParcelasAntecipaveis) {
    this.quantidadeParcelasAntecipaveis = quantidadeParcelasAntecipaveis;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quantity of the antecipated parcels")
  @JsonProperty("quantidadeParcelasAntecipaveis")
  public Integer getQuantidadeParcelasAntecipaveis() {
    return quantidadeParcelasAntecipaveis;
  }
  public void setQuantidadeParcelasAntecipaveis(Integer quantidadeParcelasAntecipaveis) {
    this.quantidadeParcelasAntecipaveis = quantidadeParcelasAntecipaveis;
  }

  
  /**
   * Value of the parcel
   **/
  public AntecipacaoSimuladaResponse valorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Value of the parcel")
  @JsonProperty("valorParcela")
  public BigDecimal getValorParcela() {
    return valorParcela;
  }
  public void setValorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
  }

  
  /**
   * Date and time which the simulation was made
   **/
  public AntecipacaoSimuladaResponse dataHoraSimulacao(String dataHoraSimulacao) {
    this.dataHoraSimulacao = dataHoraSimulacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date and time which the simulation was made")
  @JsonProperty("dataHoraSimulacao")
  public String getDataHoraSimulacao() {
    return dataHoraSimulacao;
  }
  public void setDataHoraSimulacao(String dataHoraSimulacao) {
    this.dataHoraSimulacao = dataHoraSimulacao;
  }

  
  /**
   * Taxe of the antecipation applied (to the year)
   **/
  public AntecipacaoSimuladaResponse taxaAntecipacaoAno(BigDecimal taxaAntecipacaoAno) {
    this.taxaAntecipacaoAno = taxaAntecipacaoAno;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Taxe of the antecipation applied (to the year)")
  @JsonProperty("taxaAntecipacaoAno")
  public BigDecimal getTaxaAntecipacaoAno() {
    return taxaAntecipacaoAno;
  }
  public void setTaxaAntecipacaoAno(BigDecimal taxaAntecipacaoAno) {
    this.taxaAntecipacaoAno = taxaAntecipacaoAno;
  }

  
  /**
   * Establishment where the transaction was made
   **/
  public AntecipacaoSimuladaResponse nomeEstabelecimento(String nomeEstabelecimento) {
    this.nomeEstabelecimento = nomeEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Establishment where the transaction was made")
  @JsonProperty("nomeEstabelecimento")
  public String getNomeEstabelecimento() {
    return nomeEstabelecimento;
  }
  public void setNomeEstabelecimento(String nomeEstabelecimento) {
    this.nomeEstabelecimento = nomeEstabelecimento;
  }

  
  /**
   * Description of status of the shop authorization
   **/
  public AntecipacaoSimuladaResponse status(String status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Description of status of the shop authorization")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * Date of the shop
   **/
  public AntecipacaoSimuladaResponse dataCompra(String dataCompra) {
    this.dataCompra = dataCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date of the shop")
  @JsonProperty("dataCompra")
  public String getDataCompra() {
    return dataCompra;
  }
  public void setDataCompra(String dataCompra) {
    this.dataCompra = dataCompra;
  }

  
  /**
   * Transaction type of the shop
   **/
  public AntecipacaoSimuladaResponse tipoOrigemTransacao(String tipoOrigemTransacao) {
    this.tipoOrigemTransacao = tipoOrigemTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Transaction type of the shop")
  @JsonProperty("tipoOrigemTransacao")
  public String getTipoOrigemTransacao() {
    return tipoOrigemTransacao;
  }
  public void setTipoOrigemTransacao(String tipoOrigemTransacao) {
    this.tipoOrigemTransacao = tipoOrigemTransacao;
  }

  
  /**
   * City where the shop was made
   **/
  public AntecipacaoSimuladaResponse cidade(String cidade) {
    this.cidade = cidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "City where the shop was made")
  @JsonProperty("cidade")
  public String getCidade() {
    return cidade;
  }
  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  
  /**
   * Country where the shop was made
   **/
  public AntecipacaoSimuladaResponse pais(String pais) {
    this.pais = pais;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Country where the shop was made")
  @JsonProperty("pais")
  public String getPais() {
    return pais;
  }
  public void setPais(String pais) {
    this.pais = pais;
  }

  
  /**
   * Latitudinal Coordinate of location of the shop
   **/
  public AntecipacaoSimuladaResponse latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Latitudinal Coordinate of location of the shop")
  @JsonProperty("latitude")
  public String getLatitude() {
    return latitude;
  }
  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  
  /**
   * Longitudinal Coordinate of the shop location
   **/
  public AntecipacaoSimuladaResponse longitude(String longitude) {
    this.longitude = longitude;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Longitudinal Coordinate of the shop location")
  @JsonProperty("longitude")
  public String getLongitude() {
    return longitude;
  }
  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  
  /**
   * Identification Code of the MCC group of the shop
   **/
  public AntecipacaoSimuladaResponse idGrupoMCC(Long idGrupoMCC) {
    this.idGrupoMCC = idGrupoMCC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the MCC group of the shop")
  @JsonProperty("idGrupoMCC")
  public Long getIdGrupoMCC() {
    return idGrupoMCC;
  }
  public void setIdGrupoMCC(Long idGrupoMCC) {
    this.idGrupoMCC = idGrupoMCC;
  }

  
  /**
   * Description of the Group MCC of the shop
   **/
  public AntecipacaoSimuladaResponse descricaoGrupoMCC(String descricaoGrupoMCC) {
    this.descricaoGrupoMCC = descricaoGrupoMCC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Description of the Group MCC of the shop")
  @JsonProperty("descricaoGrupoMCC")
  public String getDescricaoGrupoMCC() {
    return descricaoGrupoMCC;
  }
  public void setDescricaoGrupoMCC(String descricaoGrupoMCC) {
    this.descricaoGrupoMCC = descricaoGrupoMCC;
  }

  
  /**
   * Identification Code of the shop product
   **/
  public AntecipacaoSimuladaResponse idProduto(Long idProduto) {
    this.idProduto = idProduto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the shop product")
  @JsonProperty("idProduto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * Description of the shop product
   **/
  public AntecipacaoSimuladaResponse descricaoProduto(String descricaoProduto) {
    this.descricaoProduto = descricaoProduto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Description of the shop product")
  @JsonProperty("descricaoProduto")
  public String getDescricaoProduto() {
    return descricaoProduto;
  }
  public void setDescricaoProduto(String descricaoProduto) {
    this.descricaoProduto = descricaoProduto;
  }

  
  /**
   * Description of the establishment of the shop
   **/
  public AntecipacaoSimuladaResponse descricaoEstabelecimento(String descricaoEstabelecimento) {
    this.descricaoEstabelecimento = descricaoEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Description of the establishment of the shop")
  @JsonProperty("descricaoEstabelecimento")
  public String getDescricaoEstabelecimento() {
    return descricaoEstabelecimento;
  }
  public void setDescricaoEstabelecimento(String descricaoEstabelecimento) {
    this.descricaoEstabelecimento = descricaoEstabelecimento;
  }

  
  /**
   * Fantasy name of the Establishment
   **/
  public AntecipacaoSimuladaResponse nomeFantasiaEstabelecimento(String nomeFantasiaEstabelecimento) {
    this.nomeFantasiaEstabelecimento = nomeFantasiaEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Fantasy name of the Establishment")
  @JsonProperty("nomeFantasiaEstabelecimento")
  public String getNomeFantasiaEstabelecimento() {
    return nomeFantasiaEstabelecimento;
  }
  public void setNomeFantasiaEstabelecimento(String nomeFantasiaEstabelecimento) {
    this.nomeFantasiaEstabelecimento = nomeFantasiaEstabelecimento;
  }

  
  /**
   * Details of the simulation
   **/
  public AntecipacaoSimuladaResponse detalhes(List<AntecipacaoSimuladaDetalhesResponse> detalhes) {
    this.detalhes = detalhes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Details of the simulation")
  @JsonProperty("detalhes")
  public List<AntecipacaoSimuladaDetalhesResponse> getDetalhes() {
    return detalhes;
  }
  public void setDetalhes(List<AntecipacaoSimuladaDetalhesResponse> detalhes) {
    this.detalhes = detalhes;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AntecipacaoSimuladaResponse antecipacaoSimuladaResponse = (AntecipacaoSimuladaResponse) o;
    return Objects.equals(this.mcc, antecipacaoSimuladaResponse.mcc) &&
        Objects.equals(this.uf, antecipacaoSimuladaResponse.uf) &&
        Objects.equals(this.idAntecipacaoSimulada, antecipacaoSimuladaResponse.idAntecipacaoSimulada) &&
        Objects.equals(this.idConta, antecipacaoSimuladaResponse.idConta) &&
        Objects.equals(this.idCompra, antecipacaoSimuladaResponse.idCompra) &&
        Objects.equals(this.idTipoTransacao, antecipacaoSimuladaResponse.idTipoTransacao) &&
        Objects.equals(this.quantidadeParcelasAntecipaveis, antecipacaoSimuladaResponse.quantidadeParcelasAntecipaveis) &&
        Objects.equals(this.valorParcela, antecipacaoSimuladaResponse.valorParcela) &&
        Objects.equals(this.dataHoraSimulacao, antecipacaoSimuladaResponse.dataHoraSimulacao) &&
        Objects.equals(this.taxaAntecipacaoAno, antecipacaoSimuladaResponse.taxaAntecipacaoAno) &&
        Objects.equals(this.nomeEstabelecimento, antecipacaoSimuladaResponse.nomeEstabelecimento) &&
        Objects.equals(this.status, antecipacaoSimuladaResponse.status) &&
        Objects.equals(this.dataCompra, antecipacaoSimuladaResponse.dataCompra) &&
        Objects.equals(this.tipoOrigemTransacao, antecipacaoSimuladaResponse.tipoOrigemTransacao) &&
        Objects.equals(this.cidade, antecipacaoSimuladaResponse.cidade) &&
        Objects.equals(this.pais, antecipacaoSimuladaResponse.pais) &&
        Objects.equals(this.latitude, antecipacaoSimuladaResponse.latitude) &&
        Objects.equals(this.longitude, antecipacaoSimuladaResponse.longitude) &&
        Objects.equals(this.idGrupoMCC, antecipacaoSimuladaResponse.idGrupoMCC) &&
        Objects.equals(this.descricaoGrupoMCC, antecipacaoSimuladaResponse.descricaoGrupoMCC) &&
        Objects.equals(this.idProduto, antecipacaoSimuladaResponse.idProduto) &&
        Objects.equals(this.descricaoProduto, antecipacaoSimuladaResponse.descricaoProduto) &&
        Objects.equals(this.descricaoEstabelecimento, antecipacaoSimuladaResponse.descricaoEstabelecimento) &&
        Objects.equals(this.nomeFantasiaEstabelecimento, antecipacaoSimuladaResponse.nomeFantasiaEstabelecimento) &&
        Objects.equals(this.detalhes, antecipacaoSimuladaResponse.detalhes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mcc, uf, idAntecipacaoSimulada, idConta, idCompra, idTipoTransacao, quantidadeParcelasAntecipaveis, valorParcela, dataHoraSimulacao, taxaAntecipacaoAno, nomeEstabelecimento, status, dataCompra, tipoOrigemTransacao, cidade, pais, latitude, longitude, idGrupoMCC, descricaoGrupoMCC, idProduto, descricaoProduto, descricaoEstabelecimento, nomeFantasiaEstabelecimento, detalhes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AntecipacaoSimuladaResponse {\n");
    
    sb.append("    mcc: ").append(toIndentedString(mcc)).append("\n");
    sb.append("    uf: ").append(toIndentedString(uf)).append("\n");
    sb.append("    idAntecipacaoSimulada: ").append(toIndentedString(idAntecipacaoSimulada)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    idCompra: ").append(toIndentedString(idCompra)).append("\n");
    sb.append("    idTipoTransacao: ").append(toIndentedString(idTipoTransacao)).append("\n");
    sb.append("    quantidadeParcelasAntecipaveis: ").append(toIndentedString(quantidadeParcelasAntecipaveis)).append("\n");
    sb.append("    valorParcela: ").append(toIndentedString(valorParcela)).append("\n");
    sb.append("    dataHoraSimulacao: ").append(toIndentedString(dataHoraSimulacao)).append("\n");
    sb.append("    taxaAntecipacaoAno: ").append(toIndentedString(taxaAntecipacaoAno)).append("\n");
    sb.append("    nomeEstabelecimento: ").append(toIndentedString(nomeEstabelecimento)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    dataCompra: ").append(toIndentedString(dataCompra)).append("\n");
    sb.append("    tipoOrigemTransacao: ").append(toIndentedString(tipoOrigemTransacao)).append("\n");
    sb.append("    cidade: ").append(toIndentedString(cidade)).append("\n");
    sb.append("    pais: ").append(toIndentedString(pais)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    idGrupoMCC: ").append(toIndentedString(idGrupoMCC)).append("\n");
    sb.append("    descricaoGrupoMCC: ").append(toIndentedString(descricaoGrupoMCC)).append("\n");
    sb.append("    idProduto: ").append(toIndentedString(idProduto)).append("\n");
    sb.append("    descricaoProduto: ").append(toIndentedString(descricaoProduto)).append("\n");
    sb.append("    descricaoEstabelecimento: ").append(toIndentedString(descricaoEstabelecimento)).append("\n");
    sb.append("    nomeFantasiaEstabelecimento: ").append(toIndentedString(nomeFantasiaEstabelecimento)).append("\n");
    sb.append("    detalhes: ").append(toIndentedString(detalhes)).append("\n");
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

