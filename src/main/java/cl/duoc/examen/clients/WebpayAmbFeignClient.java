package cl.duoc.examen.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import cl.duoc.examen.model.dto.webpay.WebpayTransactionRequest;
import cl.duoc.examen.model.dto.webpay.WebpayTransactionResponse;

@FeignClient(name = "svc-webpay-amb", url = "http://localhost:8282/webpay-amb")
public interface WebpayAmbFeignClient {
    
    @PostMapping(path = "/transactions", produces = { "application/json" })
    public WebpayTransactionResponse initTransaction(@RequestBody WebpayTransactionRequest request);
}
