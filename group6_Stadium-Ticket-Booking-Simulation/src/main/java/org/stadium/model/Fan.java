package org.stadium.model;

public class Fan extends Account {
    private String fullName;
    private String fanType;

    public Fan() {
    }

    @Override
    public String getId() {
        return accountId;
    }

    public String getFullName() {
        return fullName;
    }

    public String getFanType() {
        return fanType;
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
                fanType,
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
        this.fanType = parts[6].trim();
        this.status = AccountStatus.valueOf(parts[7].trim());
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setFanType(String fanType) {
        this.fanType = fanType;
    }

    @Override
    public String toString() {
        return "Fan{" +
                "fanId='" + accountId + '\'' +
                ", username='" + username + '\'' +
                ", fullName='" + fullName + '\'' +
                ", fanType='" + fanType + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", status=" + status +
                '}';
    }
}
