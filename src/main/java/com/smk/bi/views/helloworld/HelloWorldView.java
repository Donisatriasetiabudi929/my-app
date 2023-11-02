package com.smk.bi.views.helloworld;

import com.smk.bi.views.MainLayout;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

@PageTitle("Doni TFT")
@Route(value = "hello", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
public class HelloWorldView extends HorizontalLayout {

    private TextField name;
    private TextField Keterangan;
    private Button sayHello;

    public HelloWorldView() {
        name = new TextField("Nama Anda");
        Keterangan = new TextField("Quote Anda"); 
        sayHello = new Button("Klik Dong");
        sayHello.addClickListener(e -> {
            Notification.show("Halo " + name.getValue() + "\n" + Keterangan.getValue());
        });
        sayHello.addClickShortcut(Key.ENTER);

        setMargin(true);
        setVerticalComponentAlignment(Alignment.END, name, Keterangan, sayHello);

        add(name,Keterangan, sayHello);
    }

}
