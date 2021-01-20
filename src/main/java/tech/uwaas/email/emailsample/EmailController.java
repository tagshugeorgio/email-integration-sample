package tech.uwaas.email.emailsample;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tech.uwaas.email.emailsample.email.EmailCommand;
import tech.uwaas.email.emailsample.email.EmailService;

@RestController
@RequiredArgsConstructor
public class EmailController {

    final EmailService emailService;

    @PostMapping("/email/send")
    public ResponseEntity<?> sendEmail(@RequestBody EmailCommand emailCommand) {
        emailService.send(emailCommand.getReceiver(), emailCommand.getContent());
        return ResponseEntity.ok().build();
    }
}
