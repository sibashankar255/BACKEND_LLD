package DesignPattern.Builder.URL;

public class Client {
    public static void main(String[] args) {
        URL url = new URL();
        url.setProtocol("https://");
        url.setHostName("myWebsite");
        url.setPort(":8080/");
        url.setPathParam("homePage");
        url.setPathParam("random");

        System.out.print(url.getProtocol());
        System.out.print(url.getHostName());
        System.out.print(url.getPort());
        System.out.print(url.getPathParam());

    }
}
