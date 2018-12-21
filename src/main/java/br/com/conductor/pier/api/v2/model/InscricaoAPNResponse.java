package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.AplicacaoMobileEmissorResponse;
import br.com.conductor.pier.api.v2.model.CartaoEmissorResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Represents a subscription response
 **/

@ApiModel(description = "Represents a subscription response")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class InscricaoAPNResponse   {
  
  private AplicacaoMobileEmissorResponse aplicacaoMobile = null;
  private Boolean ativo = null;
  private CartaoEmissorResponse cartao = null;
  private String dataCriacao = null;
  private String dataDesativacao = null;
  private String deviceToken = null;
  private Long id = null;

  
  /**
   * Represents the mobile application associated to the subscription
   **/
  public InscricaoAPNResponse aplicacaoMobile(AplicacaoMobileEmissorResponse aplicacaoMobile) {
    this.aplicacaoMobile = aplicacaoMobile;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Represents the mobile application associated to the subscription")
  @JsonProperty("aplicacaoMobile")
  public AplicacaoMobileEmissorResponse getAplicacaoMobile() {
    return aplicacaoMobile;
  }
  public void setAplicacaoMobile(AplicacaoMobileEmissorResponse aplicacaoMobile) {
    this.aplicacaoMobile = aplicacaoMobile;
  }

  
  /**
   * Indicates is the subscription is active
   **/
  public InscricaoAPNResponse ativo(Boolean ativo) {
    this.ativo = ativo;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Indicates is the subscription is active")
  @JsonProperty("ativo")
  public Boolean getAtivo() {
    return ativo;
  }
  public void setAtivo(Boolean ativo) {
    this.ativo = ativo;
  }

  
  /**
   * Represents the card associated to the subscription
   **/
  public InscricaoAPNResponse cartao(CartaoEmissorResponse cartao) {
    this.cartao = cartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Represents the card associated to the subscription")
  @JsonProperty("cartao")
  public CartaoEmissorResponse getCartao() {
    return cartao;
  }
  public void setCartao(CartaoEmissorResponse cartao) {
    this.cartao = cartao;
  }

  
  /**
   * The subscription creation date
   **/
  public InscricaoAPNResponse dataCriacao(String dataCriacao) {
    this.dataCriacao = dataCriacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The subscription creation date")
  @JsonProperty("dataCriacao")
  public String getDataCriacao() {
    return dataCriacao;
  }
  public void setDataCriacao(String dataCriacao) {
    this.dataCriacao = dataCriacao;
  }

  
  /**
   * The subscription deactivation date
   **/
  public InscricaoAPNResponse dataDesativacao(String dataDesativacao) {
    this.dataDesativacao = dataDesativacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The subscription deactivation date")
  @JsonProperty("dataDesativacao")
  public String getDataDesativacao() {
    return dataDesativacao;
  }
  public void setDataDesativacao(String dataDesativacao) {
    this.dataDesativacao = dataDesativacao;
  }

  
  /**
   * The device token
   **/
  public InscricaoAPNResponse deviceToken(String deviceToken) {
    this.deviceToken = deviceToken;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The device token")
  @JsonProperty("deviceToken")
  public String getDeviceToken() {
    return deviceToken;
  }
  public void setDeviceToken(String deviceToken) {
    this.deviceToken = deviceToken;
  }

  
  /**
   * Subscription id
   **/
  public InscricaoAPNResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Subscription id")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InscricaoAPNResponse inscricaoAPNResponse = (InscricaoAPNResponse) o;
    return Objects.equals(this.aplicacaoMobile, inscricaoAPNResponse.aplicacaoMobile) &&
        Objects.equals(this.ativo, inscricaoAPNResponse.ativo) &&
        Objects.equals(this.cartao, inscricaoAPNResponse.cartao) &&
        Objects.equals(this.dataCriacao, inscricaoAPNResponse.dataCriacao) &&
        Objects.equals(this.dataDesativacao, inscricaoAPNResponse.dataDesativacao) &&
        Objects.equals(this.deviceToken, inscricaoAPNResponse.deviceToken) &&
        Objects.equals(this.id, inscricaoAPNResponse.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aplicacaoMobile, ativo, cartao, dataCriacao, dataDesativacao, deviceToken, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InscricaoAPNResponse {\n");
    
    sb.append("    aplicacaoMobile: ").append(toIndentedString(aplicacaoMobile)).append("\n");
    sb.append("    ativo: ").append(toIndentedString(ativo)).append("\n");
    sb.append("    cartao: ").append(toIndentedString(cartao)).append("\n");
    sb.append("    dataCriacao: ").append(toIndentedString(dataCriacao)).append("\n");
    sb.append("    dataDesativacao: ").append(toIndentedString(dataDesativacao)).append("\n");
    sb.append("    deviceToken: ").append(toIndentedString(deviceToken)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

