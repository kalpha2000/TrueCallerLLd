package org.example.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Contact {
    String uId;
    String number;
}
