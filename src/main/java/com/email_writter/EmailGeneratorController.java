package com.email_writter;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/api/email")
@AllArgsConstructor
public class EmailGeneratorController {
    private  final  EmailGeneratorService emailGeneratorService;
    @CrossOrigin(origins = "*")
    @PostMapping("/generate")
    public ResponseEntity<String> generateResponse(@RequestBody EmailRequest emailRequest ){
        String response =  emailGeneratorService.generateEmailReply(emailRequest);
        return  ResponseEntity.ok(response);
    }
}
