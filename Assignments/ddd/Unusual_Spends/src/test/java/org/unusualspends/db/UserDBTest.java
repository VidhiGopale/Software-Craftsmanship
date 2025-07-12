package org.unusualspends.db;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserDBTest {
  @Test
    void shouldCreateObjectWithEmptyUserList(){
      var userDB=new UserDB();
      var userList=userDB.getUsers();
      assertTrue(userList.isEmpty());
  }
}