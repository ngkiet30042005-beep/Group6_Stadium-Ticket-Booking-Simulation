package org.stadium.model;

public class Admin extends Account {
    private String fullName;

    public Admin() {
    }

    @Override
    public String getId() {
        return accountId;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public String toCsvLine() {
        return String.join(",",
                accountId,
                username,
                passwordHash,
                fullName,
                email,
                phone,
                status.name());
    }

    @Override
    public void fromCsvLine(String line) {
        String[] parts = line.split(",", -1);
        this.accountId = parts[0].trim();
        this.username = parts[1].trim();
        this.passwordHash = parts[2].trim();
        this.fullName = parts[3].trim();
        this.email = parts[4].trim();
        this.phone = parts[5].trim();
        this.status = AccountStatus.valueOf(parts[6].trim());
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminId='" + accountId + '\'' +
                ", username='" + username + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", status=" + status +
                '}';
    }
}
