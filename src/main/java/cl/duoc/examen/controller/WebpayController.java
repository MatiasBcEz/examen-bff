package cl.duoc.examen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.duoc.examen.model.dto.webpay.WebpayTransactionRequest;
import cl.duoc.examen.model.dto.webpay.WebpayTransactionResponse;
import cl.duoc.examen.services.WebpayService;

@RestController
@RequestMapping("/webpay-amb")
public class WebpayController {

    @Autowired
    WebpayService webpayService;

    @PostMapping(path = "/transactions")
    public WebpayTransactionResponse initTransaction(@RequestBody WebpayTransactionRequest request){
                return webpayService.initTransaction(request);                                            
    }
    
}
