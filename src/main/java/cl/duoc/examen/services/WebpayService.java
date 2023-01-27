package cl.duoc.examen.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cl.duoc.examen.clients.WebpayAmbFeignClient;
import cl.duoc.examen.model.dto.webpay.WebpayTransactionRequest;
import cl.duoc.examen.model.dto.webpay.WebpayTransactionResponse;

@Service
public class WebpayService {
    
    @Autowired
    WebpayAmbFeignClient webPayFeignClient;

    public WebpayTransactionResponse initTransaction(WebpayTransactionRequest request){
        return webPayFeignClient.initTransaction(request);
        
    }
}