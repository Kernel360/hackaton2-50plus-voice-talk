package com.example.hackaton250plusvoicetalk.user.web.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@Builder
@ToString
public class User {
    private Long id;
    private String username;
}