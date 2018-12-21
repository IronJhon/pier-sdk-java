package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Object Notification SMS
 **/

@ApiModel(description = "Object Notification SMS")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class NotificacaoResponse   {
  
  private String protocolo = null;
  private String mensagem = null;

  
  /**
   * Protocol Number of the notification sending
   **/
  public NotificacaoResponse protocolo(String protocolo) {
    this.protocolo = protocolo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Protocol Number of the notification sending")
  @JsonProperty("protocolo")
  public String getProtocolo() {
    return protocolo;
  }
  public void setProtocolo(String protocolo) {
    this.protocolo = protocolo;
  }

  
  /**
   * Response Message of the sending resquests
   **/
  public NotificacaoResponse mensagem(String mensagem) {
    this.mensagem = mensagem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Response Message of the sending resquests")
  @JsonProperty("mensagem")
  public String getMensagem() {
    return mensagem;
  }
  public void setMensagem(String mensagem) {
    this.mensagem = mensagem;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificacaoResponse notificacaoResponse = (NotificacaoResponse) o;
    return Objects.equals(this.protocolo, notificacaoResponse.protocolo) &&
        Objects.equals(this.mensagem, notificacaoResponse.mensagem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(protocolo, mensagem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificacaoResponse {\n");
    
    sb.append("    protocolo: ").append(toIndentedString(protocolo)).append("\n");
    sb.append("    mensagem: ").append(toIndentedString(mensagem)).append("\n");
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

