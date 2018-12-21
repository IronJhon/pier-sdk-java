package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Representation of the attached document for a notification
 **/

@ApiModel(description = "Representation of the attached document for a notification")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class AnexoNotificacaoEmailRequest   {
  
  private Long idDocumento = null;

  
  /**
   * ID of the Document will be attached to the notification
   **/
  public AnexoNotificacaoEmailRequest idDocumento(Long idDocumento) {
    this.idDocumento = idDocumento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID of the Document will be attached to the notification")
  @JsonProperty("idDocumento")
  public Long getIdDocumento() {
    return idDocumento;
  }
  public void setIdDocumento(Long idDocumento) {
    this.idDocumento = idDocumento;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnexoNotificacaoEmailRequest anexoNotificacaoEmailRequest = (AnexoNotificacaoEmailRequest) o;
    return Objects.equals(this.idDocumento, anexoNotificacaoEmailRequest.idDocumento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idDocumento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnexoNotificacaoEmailRequest {\n");
    
    sb.append("    idDocumento: ").append(toIndentedString(idDocumento)).append("\n");
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

