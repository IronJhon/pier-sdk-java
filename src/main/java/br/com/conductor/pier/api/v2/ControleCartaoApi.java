package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.ControleLimiteCartaoResponse;
import br.com.conductor.pier.api.v2.model.ControleLimiteCartaoUpdate;
import br.com.conductor.pier.api.v2.model.ConfiguracaoControleCartaoResponse;
import br.com.conductor.pier.api.v2.model.ConfiguracaoControleCartaoUpdate;
import br.com.conductor.pier.api.v2.model.PageControleLimiteCartaoResponse;
import br.com.conductor.pier.api.v2.model.PageConfiguracaoControleCartaoResponse;
import br.com.conductor.pier.api.v2.model.ControleLimitesCartaoPersist;
import br.com.conductor.pier.api.v2.model.ConfiguracaoControleCartao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ControleCartaoApi {
  private ApiClient apiClient;

  public ControleCartaoApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ControleCartaoApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Altera um controle de limites de um cart\u00E3o
   * Este recurso permite que seja alterado o controle de limites de um cart\u00E3o, o controle de limites tem por finalidade gerenciar a utiliza\u00E7\u00E3o do limite dipon\u00EDvel global da conta, limitando o gasto di\u00E1rio, semanal ou mensal, por cart\u00E3o
   * @param id C\u00F3digo de identifica\u00E7\u00E3o do cart\u00E3o (id)
   * @param idControleLimite C\u00F3digo de identifica\u00E7\u00E3o do controle de limites do cart\u00E3o (id)
   * @param controleLimitesCartaoUpdate controleLimitesCartaoUpdate
   * @return ControleLimiteCartaoResponse
   */
  public ControleLimiteCartaoResponse alterar(Long id, Long idControleLimite, ControleLimiteCartaoUpdate controleLimitesCartaoUpdate) throws ApiException {
    Object postBody = controleLimitesCartaoUpdate;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterar");
     }
     
     // verify the required parameter 'idControleLimite' is set
     if (idControleLimite == null) {
        throw new ApiException(400, "Missing the required parameter 'idControleLimite' when calling alterar");
     }
     
     // verify the required parameter 'controleLimitesCartaoUpdate' is set
     if (controleLimitesCartaoUpdate == null) {
        throw new ApiException(400, "Missing the required parameter 'controleLimitesCartaoUpdate' when calling alterar");
     }
     
    // create path and map variables
    String path = "/api/cartoes/{id}/controles-limites/{idControleLimite}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "idControleLimite" + "\\}", apiClient.escapeString(idControleLimite.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<ControleLimiteCartaoResponse> returnType = new GenericType<ControleLimiteCartaoResponse>() {};
    return apiClient.invokeAPI(path, "PATCH", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Altera qualquer parte do log de configura\u00E7\u00E3o
   * Esse m\u00E9todo permite alterar qualquer parte da configura\u00E7\u00E3o de bloqueio do cart\u00E3o ao validar o ticket de transa\u00E7\u00E3o.
   * @param idConfiguracaoCartao C\u00F3digo da configura\u00E7\u00E3o controle cart\u00E3o
   * @param id id
   * @param configuracaoControleCartaoUpdate configuracaoControleCartaoUpdate
   * @return ConfiguracaoControleCartaoResponse
   */
  public ConfiguracaoControleCartaoResponse alterarConfiguracaoControleCartao(Long idConfiguracaoCartao, Long id, ConfiguracaoControleCartaoUpdate configuracaoControleCartaoUpdate) throws ApiException {
    Object postBody = configuracaoControleCartaoUpdate;
    
     // verify the required parameter 'idConfiguracaoCartao' is set
     if (idConfiguracaoCartao == null) {
        throw new ApiException(400, "Missing the required parameter 'idConfiguracaoCartao' when calling alterarConfiguracaoControleCartao");
     }
     
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarConfiguracaoControleCartao");
     }
     
     // verify the required parameter 'configuracaoControleCartaoUpdate' is set
     if (configuracaoControleCartaoUpdate == null) {
        throw new ApiException(400, "Missing the required parameter 'configuracaoControleCartaoUpdate' when calling alterarConfiguracaoControleCartao");
     }
     
    // create path and map variables
    String path = "/api/cartoes/{id}/controles-configuracoes/{idConfiguracaoCartao}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "idConfiguracaoCartao" + "\\}", apiClient.escapeString(idConfiguracaoCartao.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<ConfiguracaoControleCartaoResponse> returnType = new GenericType<ConfiguracaoControleCartaoResponse>() {};
    return apiClient.invokeAPI(path, "PATCH", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Ativa um controle de limites de um cart\u00E3o
   * Este recurso permite que seja ativado o controle de limites de um cart\u00E3o, o controle de limites tem por finalidade gerenciar a utiliza\u00E7\u00E3o do limite dipon\u00EDvel global da conta, limitando o gasto di\u00E1rio, semanal ou mensal, por cart\u00E3o
   * @param id C\u00F3digo de identifica\u00E7\u00E3o do cart\u00E3o (id)
   * @param idControleLimite C\u00F3digo de identifica\u00E7\u00E3o do controle de limites do cart\u00E3o (id)
   * @return ControleLimiteCartaoResponse
   */
  public ControleLimiteCartaoResponse ativarControleLimiteCartao(Long id, Long idControleLimite) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling ativarControleLimiteCartao");
     }
     
     // verify the required parameter 'idControleLimite' is set
     if (idControleLimite == null) {
        throw new ApiException(400, "Missing the required parameter 'idControleLimite' when calling ativarControleLimiteCartao");
     }
     
    // create path and map variables
    String path = "/api/cartoes/{id}/controles-limites/{idControleLimite}/ativar".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "idControleLimite" + "\\}", apiClient.escapeString(idControleLimite.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<ControleLimiteCartaoResponse> returnType = new GenericType<ControleLimiteCartaoResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Apresenta o controle de limites do cart\u00E3o
   * Este recurso permite que seja mostrado o controle de limites do cart\u00E3o, o controle de limites tem por finalidade gerenciar a utiliza\u00E7\u00E3o do limite dipon\u00EDvel global da conta, limitando o gasto di\u00E1rio, semanal ou mensal, por cart\u00E3o
   * @param id C\u00F3digo de identifica\u00E7\u00E3o do cart\u00E3o (id)
   * @param idControleLimite C\u00F3digo de identifica\u00E7\u00E3o do controle de limites do cart\u00E3o (id)
   * @return ControleLimiteCartaoResponse
   */
  public ControleLimiteCartaoResponse consultar(Long id, Long idControleLimite) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultar");
     }
     
     // verify the required parameter 'idControleLimite' is set
     if (idControleLimite == null) {
        throw new ApiException(400, "Missing the required parameter 'idControleLimite' when calling consultar");
     }
     
    // create path and map variables
    String path = "/api/cartoes/{id}/controles-limites/{idControleLimite}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "idControleLimite" + "\\}", apiClient.escapeString(idControleLimite.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<ControleLimiteCartaoResponse> returnType = new GenericType<ControleLimiteCartaoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Exibe as configura\u00E7\u00F5es de bloqueio para um cart\u00E3o espec\u00EDfico.
   * Este m\u00E9todo permite consultar a informa\u00E7\u00E3o da permiss\u00E3o em transa\u00E7\u00F5es de um certo Cart\u00E3o do c\u00F3digo de identifica\u00E7\u00E3o (id)
   * @param idConfiguracaoCartao C\u00F3digo da configura\u00E7\u00E3o controle cart\u00E3o
   * @param id id
   * @return ConfiguracaoControleCartaoResponse
   */
  public ConfiguracaoControleCartaoResponse consultarConfiguracaoControleCartao(Long idConfiguracaoCartao, Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'idConfiguracaoCartao' is set
     if (idConfiguracaoCartao == null) {
        throw new ApiException(400, "Missing the required parameter 'idConfiguracaoCartao' when calling consultarConfiguracaoControleCartao");
     }
     
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarConfiguracaoControleCartao");
     }
     
    // create path and map variables
    String path = "/api/cartoes/{id}/controles-configuracoes/{idConfiguracaoCartao}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "idConfiguracaoCartao" + "\\}", apiClient.escapeString(idConfiguracaoCartao.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<ConfiguracaoControleCartaoResponse> returnType = new GenericType<ConfiguracaoControleCartaoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Deletar uma configura\u00E7\u00E3o de um cart\u00E3o.
   * O metodo Deleta a configura\u00E7\u00E3o que est\u00E1 vinculada ao cart\u00E3o e deixar sem bloqueio nas transa\u00E7\u00F5es relacionadas ao mesmo.
   * @param idConfiguracaoCartao C\u00F3digo da configura\u00E7\u00E3o controle cart\u00E3o
   * @param id id
   * @return ConfiguracaoControleCartaoResponse
   */
  public ConfiguracaoControleCartaoResponse deletarConfiguracaoControleCartao(Long idConfiguracaoCartao, Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'idConfiguracaoCartao' is set
     if (idConfiguracaoCartao == null) {
        throw new ApiException(400, "Missing the required parameter 'idConfiguracaoCartao' when calling deletarConfiguracaoControleCartao");
     }
     
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling deletarConfiguracaoControleCartao");
     }
     
    // create path and map variables
    String path = "/api/cartoes/{id}/controles-configuracoes/{idConfiguracaoCartao}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "idConfiguracaoCartao" + "\\}", apiClient.escapeString(idConfiguracaoCartao.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<ConfiguracaoControleCartaoResponse> returnType = new GenericType<ConfiguracaoControleCartaoResponse>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Desativa um controle de limites de um cart\u00E3o
   * Este recurso permite que seja desativado o controle de limites de um cart\u00E3o, o controle de limites tem por finalidade gerenciar a utiliza\u00E7\u00E3o do limite dipon\u00EDvel global da conta, limitando o gasto di\u00E1rio, semanal ou mensal, por cart\u00E3o
   * @param id C\u00F3digo de identifica\u00E7\u00E3o do cart\u00E3o (id)
   * @param idControleLimite C\u00F3digo de identifica\u00E7\u00E3o do controle de limites do cart\u00E3o (id)
   * @return ControleLimiteCartaoResponse
   */
  public ControleLimiteCartaoResponse desativarControleLimiteCartao(Long id, Long idControleLimite) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling desativarControleLimiteCartao");
     }
     
     // verify the required parameter 'idControleLimite' is set
     if (idControleLimite == null) {
        throw new ApiException(400, "Missing the required parameter 'idControleLimite' when calling desativarControleLimiteCartao");
     }
     
    // create path and map variables
    String path = "/api/cartoes/{id}/controles-limites/{idControleLimite}/desativar".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "idControleLimite" + "\\}", apiClient.escapeString(idControleLimite.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<ControleLimiteCartaoResponse> returnType = new GenericType<ControleLimiteCartaoResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista o controle de limites dos cart\u00F5es
   * Este recurso permite que sejam listados todos os controles de limites por cart\u00E3o, o controle de limites tem por finalidade gerenciar a utiliza\u00E7\u00E3o do limite dipon\u00EDvel global da conta, limitando o gasto di\u00E1rio, semanal ou mensal, por cart\u00E3o
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param idCartao Id do cart\u00E3o
   * @return PageControleLimiteCartaoResponse
   */
  public PageControleLimiteCartaoResponse listar(List<String> sort, Integer page, Integer limit, Long idCartao) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/cartoes/controles-limites".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idCartao", idCartao));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<PageControleLimiteCartaoResponse> returnType = new GenericType<PageControleLimiteCartaoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista os cart\u00F5es configurados pelo remetente
   * Esse m\u00E9todo permite listar os cart\u00F5es configurados para bloqueios de transa\u00E7\u00E3o na base do remetente
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param idCartao C\u00F3digo Identificador do cartao na base (id)
   * @param permiteEcommerce Flag para autoriza\u00E7\u00E3o de transa\u00E7\u00F5es ecommerce
   * @param permiteSaque Flag para autoriza\u00E7\u00E3o de transa\u00E7\u00F5es de saque
   * @param permiteWallet Flag para autoriza\u00E7\u00E3o de transa\u00E7\u00F5es por meio wallet
   * @return PageConfiguracaoControleCartaoResponse
   */
  public PageConfiguracaoControleCartaoResponse listarConfiguracaoControleCartao(List<String> sort, Integer page, Integer limit, Long idCartao, Integer permiteEcommerce, Integer permiteSaque, Integer permiteWallet) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/cartoes/controles-configuracoes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idCartao", idCartao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "permiteEcommerce", permiteEcommerce));
    
    queryParams.addAll(apiClient.parameterToPairs("", "permiteSaque", permiteSaque));
    
    queryParams.addAll(apiClient.parameterToPairs("", "permiteWallet", permiteWallet));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<PageConfiguracaoControleCartaoResponse> returnType = new GenericType<PageConfiguracaoControleCartaoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Cadastra um controle de limites para um cart\u00E3o
   * Este recurso permite que seja cadastrado um controle de limites para um cart\u00E3o, o controle de limites tem por finalidade gerenciar a utiliza\u00E7\u00E3o do limite dipon\u00EDvel global da conta, limitando o gasto di\u00E1rio, semanal ou mensal, por cart\u00E3o
   * @param id C\u00F3digo de identifica\u00E7\u00E3o do cart\u00E3o (id)
   * @param controleLimitesCartaoPersist controleLimitesCartaoPersist
   * @return ControleLimiteCartaoResponse
   */
  public ControleLimiteCartaoResponse salvar(Long id, ControleLimitesCartaoPersist controleLimitesCartaoPersist) throws ApiException {
    Object postBody = controleLimitesCartaoPersist;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling salvar");
     }
     
     // verify the required parameter 'controleLimitesCartaoPersist' is set
     if (controleLimitesCartaoPersist == null) {
        throw new ApiException(400, "Missing the required parameter 'controleLimitesCartaoPersist' when calling salvar");
     }
     
    // create path and map variables
    String path = "/api/cartoes/{id}/controles-limites".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<ControleLimiteCartaoResponse> returnType = new GenericType<ControleLimiteCartaoResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Registra a configura\u00E7\u00E3o do cart\u00E3o.
   * O m\u00E9todo registra a configura\u00E7\u00E3o do bloqueio ou n\u00E3o algum tipo de transa\u00E7\u00E3o de uma determinada carta portadora.
   * @param id id
   * @param configuracaoControleCartaoPersist configuracaoControleCartaoPersist
   * @return ConfiguracaoControleCartaoResponse
   */
  public ConfiguracaoControleCartaoResponse salvarConfiguracaoControleCartao(Long id, ConfiguracaoControleCartao configuracaoControleCartaoPersist) throws ApiException {
    Object postBody = configuracaoControleCartaoPersist;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling salvarConfiguracaoControleCartao");
     }
     
     // verify the required parameter 'configuracaoControleCartaoPersist' is set
     if (configuracaoControleCartaoPersist == null) {
        throw new ApiException(400, "Missing the required parameter 'configuracaoControleCartaoPersist' when calling salvarConfiguracaoControleCartao");
     }
     
    // create path and map variables
    String path = "/api/cartoes/{id}/controles-configuracoes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<ConfiguracaoControleCartaoResponse> returnType = new GenericType<ConfiguracaoControleCartaoResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
