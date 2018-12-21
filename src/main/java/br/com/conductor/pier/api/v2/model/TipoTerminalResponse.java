package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * ObjecttypeTerminal
 **/

@ApiModel(description = "ObjecttypeTerminal")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TipoTerminalResponse   {
  
  private Long id = null;
  private String descricaoTerminal = null;

  
  /**
   * Identification Code of the Terminal Type (id)
   **/
  public TipoTerminalResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the Terminal Type (id)")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Description of the Terminal Type
   **/
  public TipoTerminalResponse descricaoTerminal(String descricaoTerminal) {
    this.descricaoTerminal = descricaoTerminal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Description of the Terminal Type")
  @JsonProperty("descricaoTerminal")
  public String getDescricaoTerminal() {
    return descricaoTerminal;
  }
  public void setDescricaoTerminal(String descricaoTerminal) {
    this.descricaoTerminal = descricaoTerminal;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TipoTerminalResponse tipoTerminalResponse = (TipoTerminalResponse) o;
    return Objects.equals(this.id, tipoTerminalResponse.id) &&
        Objects.equals(this.descricaoTerminal, tipoTerminalResponse.descricaoTerminal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, descricaoTerminal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoTerminalResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    descricaoTerminal: ").append(toIndentedString(descricaoTerminal)).append("\n");
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

