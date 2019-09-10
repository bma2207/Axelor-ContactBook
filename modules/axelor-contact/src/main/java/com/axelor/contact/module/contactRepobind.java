package com.axelor.contact.module;

import com.axelor.app.AxelorModule;
import com.axelor.contact.db.repo.ContactBeanRepository;
import com.axelor.contact.db.repo.contactRepo;

public class contactRepobind extends AxelorModule {
  @Override
  protected void configure() {

    bind(ContactBeanRepository.class).to(contactRepo.class);
  }
}
