package tech.uwaas.email.emailsample.email;

import lombok.*;

@Getter
@NoArgsConstructor(force = true, access = AccessLevel.PRIVATE)
@AllArgsConstructor
public class EmailCommand {

    private String receiver;

    private String content;
}
