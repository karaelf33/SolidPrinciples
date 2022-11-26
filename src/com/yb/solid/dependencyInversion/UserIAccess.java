package com.yb.solid.dependencyInversion;

public class UserIAccess implements IAccessService {


    @Override
    public void access() {
        System.out.println("Here give the access for user class");
    }
}
