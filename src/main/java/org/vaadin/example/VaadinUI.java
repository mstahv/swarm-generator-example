package org.vaadin.example;

import com.vaadin.cdi.CDIUI;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

import javax.inject.Inject;

/**
 *
 * @author mstahv
 */
@CDIUI("")
public class VaadinUI extends UI {

    @Inject
    GreeterBean greeterBean;
    
    @Override
    protected void init(VaadinRequest request) {
        setContent(new Label(greeterBean.sayHi()));
    }
    
}
