package com.axelor.contact.controler;

import com.axelor.contact.db.ContactBean;
import com.axelor.contact.service.MessageService;
import com.axelor.rpc.ActionRequest;
import com.axelor.rpc.ActionResponse;
import com.google.inject.Inject;
import com.google.inject.servlet.RequestScoped;

@RequestScoped
public class MsgControler {

  @Inject MessageService service;

  public void msg(ActionRequest request, ActionResponse response) {

    ContactBean contact = request.getContext().asType(ContactBean.class);

    // java.util.List<Object> message = service.Disply();

    String massage = service.onsaveEvent();
    response.setNotify(massage);
  }
}
