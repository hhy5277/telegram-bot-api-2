package io.github.biezhi.tgbot.api.request;

import java.io.Serializable;

/**
 * Stas Parshin
 * 06 May 2016
 */
public class InputContactMessageContent extends InputMessageContent implements Serializable {
    private final static long serialVersionUID = 0L;

    private String phone_number;
    private String first_name;
    private String last_name;

    public InputContactMessageContent(String phoneNumber, String firstName) {
        this.phone_number = phoneNumber;
        this.first_name = firstName;
    }

    public InputContactMessageContent lastName(String lastName) {
        this.last_name = lastName;
        return this;
    }
}
