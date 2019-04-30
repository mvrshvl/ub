package com.example.a406.ub;


import com.example.a406.ub.common.User;

import java.util.List;

public interface UserView{
     void showUsers(List<User> users);
     void showToast(int resId);
     void showProgress();
     void hideProgress();
}
