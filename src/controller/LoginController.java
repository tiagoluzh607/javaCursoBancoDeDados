/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import view.LoginView;
import view.MenuView;

/**
 *
 * @author tiago
 */
public class LoginController {
    
    private final LoginView view;

    public LoginController(LoginView view) {
        this.view = view;
    }
   
    public void autenticar(){
        
        //Pegar usuario da tela
        
        //Ver se existe no banco de dados
        
        //Se existir no banco de dados passa para o menu
        
        MenuView telaDeMenu = new MenuView();
        telaDeMenu.setVisible(true);
    }
    
    
}
