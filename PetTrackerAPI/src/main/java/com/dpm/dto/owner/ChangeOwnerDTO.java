package com.dpm.dto.owner;

/**
 * @author danielpm.dev
 */
public class ChangeOwnerDTO {

    private Long id;
    private String email;
    private String password;

    public ChangeOwnerDTO() {
    }

    public ChangeOwnerDTO(Long id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
