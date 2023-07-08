
package com.mycompany.empresa;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Cnpj {
    
    public String Cnpj;
    public String id;
    public String numeroDeInscricao;
    public String tipo;
    public String abertura;
    public String nomefantasia;
    public String atividadePrincipalNome;
    public String atividadePrincipalCode;
    public String naturezaJuridica;
    public String logradouro;
    public String numero;
    public String complemento;
    public String cep;
    public String bairro;
    public String municipio;
    public String uf;
    public String email;
    public String telefone;
    public String entidadeFederativoResponsavel;
    public String situacao;
    public String dtSituacaoCadastral;
    public String situacaoEspecial;
    public String capitalSocial;
    public String ieOrigem;
    public String createdAt;

    
       private String request(String cnpj) 
    {
        String json;        

        try {
            URL url = new URL("https://sisdel.com.br/api/hub/cnpjHub/"+ cnpj);
            
            URLConnection urlConnection = url.openConnection();
            
            InputStream is = urlConnection.getInputStream();
            
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            StringBuilder jsonSb = new StringBuilder();

            br.lines().forEach(l -> jsonSb.append(l.trim()));
            
            json = jsonSb.toString();
            
            
           return json;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
     
    public void consultaCnpj(String cnpj){
        
        String resposta = request(cnpj);
        
        resposta = resposta.replaceAll("[{},:]", "");
        
        resposta = resposta.replaceAll("\"", "\n");        
        
        String array[] = new String[50];
        
        array = resposta.split("\n");        
       
        this.setCnpj(cnpj);
        this.setId(array[2]);
        this.setNumeroDeInscricao(array[5 ]);
        this.setTipo(array[9]);
        this.setAbertura(array[13]);
        this.setNomefantasia(array[17]);
        this.setAtividadePrincipalNome(array[25]);
        this.setAtividadePrincipalCode(array[29]); 
        this.setNaturezaJuridica(array[33]);
        this.setLogradouro(array[37]);
        this.setNumero(array[41]);
        this.setComplemento(array[45]);
        this.setCep(array[49]);
        this.setBairro(array[53]);
        this.setMunicipio(array[57]);
        this.setUf(array[61]);
        this.setEmail(array[65]);
        this.setTelefone(array[69]);
        this.setEntidadeFederativoResponsavel(array[73]);
        this.setSituacao(array[77]);
        this.setDtSituacaoCadastral(array[81]);
        this.setSituacaoEspecial(array[85]);
        this.setCapitalSocial(array[93]);
        this.setIeOrigem(array[96]);
        this.setCreatedAt(array[99]);
        
    }  
    
    public void setCnpj(String Cnpj) {
        this.Cnpj = Cnpj;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNumeroDeInscricao(String numeroDeInscricao) {
        this.numeroDeInscricao = numeroDeInscricao;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setAbertura(String abertura) {
        this.abertura = abertura;
    }

    public void setNomefantasia(String nomefantasia) {
        this.nomefantasia = nomefantasia;
    }

    public void setAtividadePrincipalNome(String atividadePrincipalNome) {
        this.atividadePrincipalNome = atividadePrincipalNome;
    }

    public void setAtividadePrincipalCode(String atividadePrincipalCode) {
        this.atividadePrincipalCode = atividadePrincipalCode;
    }

    public void setNaturezaJuridica(String naturezaJuridica) {
        this.naturezaJuridica = naturezaJuridica;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEntidadeFederativoResponsavel(String entidadeFederativoResponsavel) {
        this.entidadeFederativoResponsavel = entidadeFederativoResponsavel;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public void setDtSituacaoCadastral(String dtSituacaoCadastral) {
        this.dtSituacaoCadastral = dtSituacaoCadastral;
    }

    public void setSituacaoEspecial(String situacaoEspecial) {
        this.situacaoEspecial = situacaoEspecial;
    }

    public void setCapitalSocial(String capitalSocial) {
        this.capitalSocial = capitalSocial;
    }

    public void setIeOrigem(String ieOrigem) {
        this.ieOrigem = ieOrigem;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
    
    public String getDados() {
        
        return "" +       
        "|----------------------------------------------------------|\n"+
        "CNPJ: " + this.Cnpj +    
        "|----------------------------------------------------------|\n"+
        "ID:" + this.id +        
        "|----------------------------------------------------------|\n"+
         "NUMERO DE INSCRIÇÃO:" + this.numeroDeInscricao + 
        "|----------------------------------------------------------|\n"+
        "TIPO:" + this.tipo +      
        "|----------------------------------------------------------|\n"+
          "ABERTURA:" +  this.abertura +     
        "|----------------------------------------------------------|\n"+
         "NOME FANTASIA:" + this.nomefantasia +      
        "|----------------------------------------------------------|\n"+
         "ATIVIDADE PRINCIPAL NOME:" + this.atividadePrincipalNome +       
        "|----------------------------------------------------------|\n"+
         "ATIVIDADE PRINCIPAL CODE:" + this.atividadePrincipalCode +       
        "|----------------------------------------------------------|\n"+
         "NATUREZA JURIDICA:" +this.naturezaJuridica +      
        "|----------------------------------------------------------|\n"+
         "LOGRADOURO:" + this.logradouro +        
        "|----------------------------------------------------------|\n"+
        "NUMERO:" +  this.numero +      
        "|----------------------------------------------------------|\n"+
        "COMPLEMENTO:" + this.complemento +       
        "|----------------------------------------------------------|\n"+
        "CEP:" + this.cep +       
        "|----------------------------------------------------------|\n"+
         "BAIRRO:" + this.bairro +       
        "|----------------------------------------------------------|\n"+
        "MUNICIPIO:" + this.municipio +     
        "|----------------------------------------------------------|\n"+
        "UF:" + this.uf +       
        "|----------------------------------------------------------|\n"+
        "EMAIL:" +this.email +             
        "|----------------------------------------------------------|\n"+
        "TELEFONE:" +  this.telefone +                
        "|----------------------------------------------------------|\n"+
        "ENTIDADE FEDERATIVO RESPONSAVEL:" +this.entidadeFederativoResponsavel +      
        "|----------------------------------------------------------|\n"+                                                 
        "SITUAÇÃO:" + this.situacao +                                   
        "|----------------------------------------------------------|\n"+      
        "DT SITUAÇÃO CADASTRAL:" +  this.dtSituacaoCadastral +             
        "|----------------------------------------------------------|\n"+            
        "SITUAÇÃO ESPECIAL:" +  this.situacaoEspecial +                  
        "|----------------------------------------------------------|\n"+          
        "CAPITAL SOCIAL:" + this.capitalSocial +                  
        "|----------------------------------------------------------|\n"+          
        "IE ORIGEM:" + this.ieOrigem +      
        "|----------------------------------------------------------|\n"+ 
        "CREATED AT:" + this.createdAt;
             
    }
   
    public static int primeiroDigito(int[] numeros){
        int[] multiplicadores = {5,4,3,2,9,8,7,6,5,4,3,2};
        int soma      = 0;
        int resultado = 0;
        
        for (int i = 0; i < multiplicadores.length; i++) {
            soma += numeros[i] * multiplicadores[i];
        }
            
            resultado = 11 - (soma % 11);
            
            if((resultado == 10 ) || (resultado == 11)){
            return 0;
            }
            
        return resultado;
        
    }
    public static int segundoDigito(int[] numeros){
        int[] multiplicadores = {5,4,3,2,9,8,7,6,5,4,3,2};
        int soma      = 0;
        int resultado = 0;
        
        for (int i = 0; i < multiplicadores.length; i++) {
            soma += numeros[i] * multiplicadores[i];
        }
            
            resultado = 11 - (soma % 11);
            
            if((resultado == 10 ) || (resultado == 11)){
            return 0;
            }
            
        return resultado;
        
    }
    
    public static boolean validar(String Cnpj) {
      
        if (Cnpj.length() != 11) {
            return false;
        }
        
        int[] numeros = new int[11];
      
        for (int i = 0; i < 11; i++) {
            numeros[i] = Integer.parseInt(Cnpj.substring(i, i + 1));
        }
        
        if(primeiroDigito(numeros) != numeros[9] || segundoDigito(numeros) != numeros[10]){
            return false;
        }
        
        return true;
    }
    
}

    
    
    
    
    
    
    
    

