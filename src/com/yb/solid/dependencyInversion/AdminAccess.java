package com.yb.solid.dependencyInversion;

public class AdminAccess implements IAccessService{
    @Override
    public void access() {
        System.out.println("It is from admin access service");
    }
}
