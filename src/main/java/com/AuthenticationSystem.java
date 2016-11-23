package com;

import java.lang.reflect.Field;

public class AuthenticationSystem {

    //@UserRoleAnnotation(field = Role.USER)
    @UserRoleAnnotation(value = Role.ADMIN)
    private User user;

    public AuthenticationSystem(User user) {
        this.user = user;
    }

    public static void getAnnotation(AuthenticationSystem authentication) throws NoSuchFieldException {
        Class<?> userClass = authentication.getClass();
        Field userField = userClass.getDeclaredField("user");
        UserRoleAnnotation annotation = userField.getAnnotation(UserRoleAnnotation.class);
        annotation.value().getInfo();
    }

    public static void main(String[] args) throws NoSuchFieldException {

        AuthenticationSystem user = new AuthenticationSystem(new User("name", "surname", 15));

        getAnnotation(user);
    }
}

