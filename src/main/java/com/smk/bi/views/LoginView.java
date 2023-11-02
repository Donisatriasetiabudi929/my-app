package com.smk.bi.views;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;

@Route("login")
@PageTitle("LOGIN") //Untuk title dalam halaman
@AnonymousAllowed //Agar semua orang bisa masuk 

public class LoginView extends VerticalLayout {
    private final LoginForm login = new LoginForm();
    public LoginView(){
        addClassName("login-view"); //Untuk CSS
        setSizeFull(); //Untuk full
        setAlignItems(Alignment.CENTER); //Untuk posisi agar di tengah / center
        setJustifyContentMode(JustifyContentMode.CENTER);
        
        login.setAction("login");

        add(new H1("Login Page"), login);

    }
}
