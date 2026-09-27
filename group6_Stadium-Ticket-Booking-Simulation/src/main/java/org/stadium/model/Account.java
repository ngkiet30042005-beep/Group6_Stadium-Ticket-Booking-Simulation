package org.stadium.model;

public abstract class Account extends BaseEntity {

    protected String accountId;
    protected String username;
    protected String passwordHash;
    protected String email;
    protected String phone;
    protected AccountStatus status;

    @Override
    public String getId() {
        return accountId;
    }

    public String getUsername() {
        return username;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public boolean validatePassword(String rawPass) {
        if (rawPass == null || passwordHash == null)
            return false;
        return passwordHash.equals(rawPass) || passwordHash.equals("hash_pass_" + rawPass);
    }

    public void changePassword(String newHash) {
        this.passwordHash = newHash;
    }

    public void updateContactInfo(String email, String phone) {
        this.email = email;
        this.phone = phone;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
