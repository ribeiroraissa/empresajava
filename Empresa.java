

package com.mycompany.empresa;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Empresa {

    public static void main(String[] args) {
        
        Cep cep = new Cep();
       
        Scanner teclado= new Scanner(System.in);
       
        System.out.println("Digite o Cep da sua empresa:");
        
        String formCep = teclado.next();
       
        cep.consultaCep(formCep);
        
        System.out.println(cep.cep);
        System.out.println(cep.logradouro);
        System.out.println(cep.bairro);
        System.out.println(cep.cidade);
        System.out.println(cep.uf);
      
        Cnpj cnpj = new Cnpj();
        Cnpj  validar = new Cnpj();
      
        System.out.println("Digite o CNPJ da sua empresa:");
        
        String formCnpj = teclado.next();
        
        cnpj.validar(formCnpj);
        
          if (validar.validar(formCnpj)) {
           cnpj.consultaCnpj(formCnpj);
           System.out.println(cnpj.getDados()); 
           
             System.out.println("CNPJ válido!");    
           
        } else {
            System.out.println("CNPJ inválido!");
        }
           
    } 
    
}
