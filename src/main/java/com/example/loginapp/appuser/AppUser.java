package com.example.loginapp.appuser;

public class AppUser implements  UserDetails{
private long id;
private String name;
private String username;
private String email;
private String password;
private AppUserRole appUserRole;
private Boolean locked;
private Boolean enabled;
}
