/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2;

/**
 *
 * @author alexa
 */
public class ClienteApp {
    
    public static void main(String[]args) {
        
        ClientePF clientepf1 = new ClientePF (" asdfas "," asdad "," 312412543 ");
        
        ClientePJ clientepj1 = new ClientePJ (" asdghs "," adfh "," 3345677 ");
        
        System.out.println("Nome do objeto : "+clientepf1.getNome()+ "  Endereço do objeto : "+ clientepf1.getEndereco());
        
        System.out.println(clientepf1.toString());
        
        System.out.println(clientepj1.toString());
        
    }
    
    
}
