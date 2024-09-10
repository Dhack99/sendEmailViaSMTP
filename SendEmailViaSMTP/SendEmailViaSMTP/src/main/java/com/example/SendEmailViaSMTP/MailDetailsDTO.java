package com.example.SendEmailViaSMTP;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MailDetailsDTO {

    private String toMail;
    private String message;
    private String subject;
}
