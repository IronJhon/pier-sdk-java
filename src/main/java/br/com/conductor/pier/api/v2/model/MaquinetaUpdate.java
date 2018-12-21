package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Request Parameters to update POS
 **/

@ApiModel(description = "Request Parameters to update POS")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class MaquinetaUpdate   {
  
  private Long idTerminal = null;
  private Long idTipoMaquineta = null;
  private BigDecimal valor = null;
  private String dataHoraImplantacao = null;

  
  /**
   * Identification Code of the Terminal (id)
   **/
  public MaquinetaUpdate idTerminal(Long idTerminal) {
    this.idTerminal = idTerminal;
    return this;
  }
  
  @ApiModelProperty(example = "11111", required = true, value = "Identification Code of the Terminal (id)")
  @JsonProperty("idTerminal")
  public Long getIdTerminal() {
    return idTerminal;
  }
  public void setIdTerminal(Long idTerminal) {
    this.idTerminal = idTerminal;
  }

  
  /**
   * Identification Code of the POS type (id)
   **/
  public MaquinetaUpdate idTipoMaquineta(Long idTipoMaquineta) {
    this.idTipoMaquineta = idTipoMaquineta;
    return this;
  }
  
  @ApiModelProperty(example = "1", required = true, value = "Identification Code of the POS type (id)")
  @JsonProperty("idTipoMaquineta")
  public Long getIdTipoMaquineta() {
    return idTipoMaquineta;
  }
  public void setIdTipoMaquineta(Long idTipoMaquineta) {
    this.idTipoMaquineta = idTipoMaquineta;
  }

  
  /**
   * Value of Maintenance of the POS
   **/
  public MaquinetaUpdate valor(BigDecimal valor) {
    this.valor = valor;
    return this;
  }
  
  @ApiModelProperty(example = "100.0", required = true, value = "Value of Maintenance of the POS")
  @JsonProperty("valor")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * Date of the POS deploy
   **/
  public MaquinetaUpdate dataHoraImplantacao(String dataHoraImplantacao) {
    this.dataHoraImplantacao = dataHoraImplantacao;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", required = true, value = "Date of the POS deploy")
  @JsonProperty("dataHoraImplantacao")
  public String getDataHoraImplantacao() {
    return dataHoraImplantacao;
  }
  public void setDataHoraImplantacao(String dataHoraImplantacao) {
    this.dataHoraImplantacao = dataHoraImplantacao;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaquinetaUpdate maquinetaUpdate = (MaquinetaUpdate) o;
    return Objects.equals(this.idTerminal, maquinetaUpdate.idTerminal) &&
        Objects.equals(this.idTipoMaquineta, maquinetaUpdate.idTipoMaquineta) &&
        Objects.equals(this.valor, maquinetaUpdate.valor) &&
        Objects.equals(this.dataHoraImplantacao, maquinetaUpdate.dataHoraImplantacao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idTerminal, idTipoMaquineta, valor, dataHoraImplantacao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaquinetaUpdate {\n");
    
    sb.append("    idTerminal: ").append(toIndentedString(idTerminal)).append("\n");
    sb.append("    idTipoMaquineta: ").append(toIndentedString(idTipoMaquineta)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
    sb.append("    dataHoraImplantacao: ").append(toIndentedString(dataHoraImplantacao)).append("\n");
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

