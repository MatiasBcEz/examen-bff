package cl.duoc.examen.model.dto.webpay;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WebpayTransactionResponse {
    
    @JsonProperty("token")
    private String token;
    @JsonProperty("url")
    private String url;
    
    public WebpayTransactionResponse() {
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    
    
}
