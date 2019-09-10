package com.axelor.contact.service;

import com.google.inject.Inject;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class GmailMessageService implements MessageService {

  @Inject EntityManager em;

  @Override
  public List<Object> Disply() {
    // TODO Auto-generated method stub

    Query query = em.createQuery("from ContactBean ");
    List<Object> al = (List<Object>) query.getResultList();
    System.out.println(al);
    return al;
  }

  @Override
  public String onsaveEvent() {
    return "Data Save SuccessFully..!";
    // TODO Auto-generated method stub

  }
}
