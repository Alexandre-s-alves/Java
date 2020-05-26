/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula;

/**
 *
 * @author alexa
 */
public class PessoaApp {
    
    public static void main (String[] args){
        
        Pessoa pessoal = new Pessoa(1,"alex");
        
        Pessoa pessoa2 = new Pessoa(2,"Ana");
        
        System.out.println("o nome do objeto = "+pessoal.getNome());
        
        pessoal.setNome("Alexandre");
        
        System.out.println("o nome do objeto = "+pessoal.getNome());
       
        
 
        
    }
    
}
