package com;

public enum Role {

    USER() {
        public void getInfo() {
            System.out.println("User - individual who is not involved with supporting or developing a computer or service.");
        }
    },

    ADMIN() {
        public void getInfo() {
            System.out.println("Admin - somebody who has access to all the administration feature");
        }
    };

    public void getInfo() {
    }
}
