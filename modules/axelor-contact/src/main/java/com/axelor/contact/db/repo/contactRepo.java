package com.axelor.contact.db.repo;

import com.axelor.contact.db.ContactBean;
import java.util.Map;

public class contactRepo extends ContactBeanRepository {
  @Override
  public Map<String, Object> populate(Map<String, Object> json, Map<String, Object> context) {
    if (!context.containsKey("json-enhance")) {
      return json;
    }

    System.err.println(json);

    try {
      Long id = (Long) json.get("id");
      System.err.println("id : " + id);
      ContactBean contact = find(id);

      json.put("add", contact.getAddresses().get(0));
      json.put("hasImage", contact.getImage() != null);
    } catch (Exception e) {
    }

    return json;
  }

  @Override
  public ContactBean save(ContactBean entity) {

    ContactBean cantact = new ContactBean();
    String mobile = cantact.getContactNo();
    if (mobile.length() == 10) {}

    return super.save(entity);
  }
}
