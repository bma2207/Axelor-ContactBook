package com.axelor.contact.module;

import com.axelor.app.AxelorModule;
import com.axelor.contact.service.GmailMessageService;
import com.axelor.contact.service.MessageService;

public class ContactModule extends AxelorModule {

  @Override
  protected void configure() {

    bind(MessageService.class).to(GmailMessageService.class);
  }
}
