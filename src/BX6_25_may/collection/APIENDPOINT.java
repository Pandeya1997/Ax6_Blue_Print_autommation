package BX6_25_may.collection;

public enum APIENDPOINT {
Home("https://app.vwo.com","home page "),
Login("https://app.vwo.com/#/login", "login-page"),
DashBoard ("ttps://app.vwo.com/#/dashboard","Dashboard");
String url;
String page;
    // Home --> https://app.vwo.com
// login --> https://app.vwo.com/#/login
// Dashboard -->https://app.vwo.com/#/dashboard


    APIENDPOINT(String url, String page) {
        this.url = url;
        this.page = page;
    }

    public String getUrl() {
        return url;
    }

    public String getPage() {
        return page;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    public void setPage(String page) {
        this.page = page;
    }

    APIENDPOINT(java.lang.String page) {
        this.page = page;
    }


}

