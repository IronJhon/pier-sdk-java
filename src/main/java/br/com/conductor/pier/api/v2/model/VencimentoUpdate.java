package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Representation Object Update for Expirations
 **/

@ApiModel(description = "Representation Object Update for Expirations")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class VencimentoUpdate   {
  
  private String dataPrevistaCorte = null;

  
  /**
   * expected expiring date
   **/
  public VencimentoUpdate dataPrevistaCorte(String dataPrevistaCorte) {
    this.dataPrevistaCorte = dataPrevistaCorte;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "expected expiring date")
  @JsonProperty("dataPrevistaCorte")
  public String getDataPrevistaCorte() {
    return dataPrevistaCorte;
  }
  public void setDataPrevistaCorte(String dataPrevistaCorte) {
    this.dataPrevistaCorte = dataPrevistaCorte;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VencimentoUpdate vencimentoUpdate = (VencimentoUpdate) o;
    return Objects.equals(this.dataPrevistaCorte, vencimentoUpdate.dataPrevistaCorte);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataPrevistaCorte);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VencimentoUpdate {\n");
    
    sb.append("    dataPrevistaCorte: ").append(toIndentedString(dataPrevistaCorte)).append("\n");
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

