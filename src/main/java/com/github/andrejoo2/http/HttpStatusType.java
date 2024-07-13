package com.github.andrejoo2.http;

/**
 * Represents different types of HTTP status categories.
 */
public enum HttpStatusType {

    /**
     * Informational responses (1XX).
     */
    INFORMATIONAL("Informational"),

    /**
     * Successful responses (2XX).
     */
    SUCCESS("Success"),

    /**
     * Redirection messages (3XX).
     */
    REDIRECTION("Redirection"),

    /**
     * Client error responses (4XX).
     */
    CLIENT_ERROR("Client error"),

    /**
     * Server error responses (5XX).
     */
    SERVER_ERROR("Server Error");

    private final String type;

    HttpStatusType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

}
