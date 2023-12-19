package DesignPattern.Builder.URL;

public class URL {
    private String protocol;
    private String hostName;
    private String port;
    private String pathParam;
    private String queryParam;

    public URL(String protocol, String hostName, String port, String pathParam, String queryParam) {
        this.protocol = protocol;
        this.hostName = hostName;
        this.port = port;
        this.pathParam = pathParam;
        this.queryParam = queryParam;
    }

    public URL(){
    }
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getPathParam() {
        return pathParam;
    }

    public void setPathParam(String pathParam) {
        this.pathParam = pathParam;
    }

    public String getQueryParam() {
        return queryParam;
    }

    public void setQueryParam(String queryParam) {
        this.queryParam = queryParam;
    }
}
