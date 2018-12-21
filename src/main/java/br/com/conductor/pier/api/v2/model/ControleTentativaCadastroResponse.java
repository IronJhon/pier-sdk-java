package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Return of the attempts registration
 **/

@ApiModel(description = "Return of the attempts registration")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ControleTentativaCadastroResponse   {
  
  private String cpf = null;
  private String login = null;
  private Integer tentativas = null;

  
  /**
   * User CPF
   **/
  public ControleTentativaCadastroResponse cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User CPF")
  @JsonProperty("cpf")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * Login
   **/
  public ControleTentativaCadastroResponse login(String login) {
    this.login = login;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Login")
  @JsonProperty("login")
  public String getLogin() {
    return login;
  }
  public void setLogin(String login) {
    this.login = login;
  }

  
  /**
   * Number of attempts
   **/
  public ControleTentativaCadastroResponse tentativas(Integer tentativas) {
    this.tentativas = tentativas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of attempts")
  @JsonProperty("tentativas")
  public Integer getTentativas() {
    return tentativas;
  }
  public void setTentativas(Integer tentativas) {
    this.tentativas = tentativas;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ControleTentativaCadastroResponse controleTentativaCadastroResponse = (ControleTentativaCadastroResponse) o;
    return Objects.equals(this.cpf, controleTentativaCadastroResponse.cpf) &&
        Objects.equals(this.login, controleTentativaCadastroResponse.login) &&
        Objects.equals(this.tentativas, controleTentativaCadastroResponse.tentativas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpf, login, tentativas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ControleTentativaCadastroResponse {\n");
    
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    tentativas: ").append(toIndentedString(tentativas)).append("\n");
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

