package com.daomtthuan.chatnow.ejb.facade;

import com.daomtthuan.chatnow.ejb.entity.Role;
import java.util.List;
import javax.ejb.Local;

@Local
public interface RoleFacadeLocal {

  Role create(Role role);

  void edit(Role role);

  void remove(Role role);

  Role find(Object id);

  List<Role> findAll();

  List<Role> findRange(int[] range);

  int count();

  Role findByName(String name);

}
