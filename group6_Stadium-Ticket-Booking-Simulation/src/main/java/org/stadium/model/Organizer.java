package org.stadium.model;

public class Organizer extends Account {

    private String orgName;

    public Organizer() {
    }

    @Override
    public String getId() {
        return accountId;
    }

    public String getOrgName() {
        return orgName;
    }

    @Override
    public String toCsvLine() {
        return String.join(",",
                accountId,
                username,
                passwordHash,
                orgName,
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
        this.orgName = parts[3].trim();
        this.email = parts[4].trim();
        this.phone = parts[5].trim();
        this.status = AccountStatus.valueOf(parts[6].trim());
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    @Override
    public String toString() {
        return "Organizer{" +
                "organizerId='" + accountId + '\'' +
                ", username='" + username + '\'' +
                ", orgName='" + orgName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", status=" + status +
                '}';
    }
}
