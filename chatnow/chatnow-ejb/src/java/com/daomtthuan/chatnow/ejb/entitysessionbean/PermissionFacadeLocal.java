package com.daomtthuan.chatnow.ejb.entitysessionbean;

import com.daomtthuan.chatnow.ejb.entity.Permission;
import java.util.List;
import javax.ejb.Local;

@Local
public interface PermissionFacadeLocal {

  void create(Permission permission);

  void edit(Permission permission);

  void remove(Permission permission);

  Permission find(Object id);

  List<Permission> findAll();

  List<Permission> findRange(int[] range);

  int count();

}
