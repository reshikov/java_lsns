package ru.stqa.pft.newcustomer;

public class PhonesData {
    private final String workphone;
    private final String mobile;
    private final String homephone;

    public PhonesData(String workphone, String mobile, String homephone) {
        this.workphone = workphone;
        this.mobile = mobile;
        this.homephone = homephone;
    }

    public String getWorkphone() {
        return workphone;
    }

    public String getMobile() {
        return mobile;
    }

    public String getHomephone() {
        return homephone;
    }
}
