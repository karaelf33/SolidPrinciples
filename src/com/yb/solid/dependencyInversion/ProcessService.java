package com.yb.solid.dependencyInversion;

public class ProcessService {

    public static void accessProcess(IAccessService access){
        access.access();
        // business logic
        // business logic
        // business logic
        // business logic
        // business logic
    }

    public static void main(String[] args) {
        accessProcess(new AdminAccess());
        accessProcess(new UserIAccess());
    }
}
