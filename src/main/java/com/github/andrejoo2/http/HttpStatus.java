package com.github.andrejoo2.http;

import static com.github.andrejoo2.http.HttpStatusType.*;

/**
 * Represents an HTTP status with its code, reason phrase, and type.
 *
 * @author Andrzej Szczap
 */
public class HttpStatus {

    /**
     * Http status code.
     */
    private final int code;

    /**
     * The reason phrase associated with the status code.
     */
    private final String reason;

    /**
     * The type of HTTP status.
     */
    private final HttpStatusType type;

    private HttpStatus(int code, String reason, HttpStatusType type) {
        this.code = code;
        this.reason = reason;
        this.type = type;
    }

    /**
     * Informational codes (1XX).
     */
    public final static int CONTINUE = 100;
    public final static int SWITCHING_PROTOCOLS = 101;
    public final static int PROCESSING = 102;
    public final static int EARLY_HINTS = 103;

    /**
     * Successful codes (2XX).
     */
    public final static int OK = 200;
    public final static int CREATED = 201;
    public final static int ACCEPTED = 202;
    public final static int NON_AUTHORITATIVE_INFORMATION = 203;
    public final static int NO_CONTENT = 204;
    public final static int RESET_CONTENT = 205;
    public final static int PARTIAL_CONTENT = 206;
    public final static int MULTI_STATUS = 207;
    public final static int ALREADY_REPORTED = 208;
    public final static int IM_USED = 226;

    /**
     * Redirection codes (3XX).
     */
    public final static int MULTIPLE_CHOICES = 300;
    public final static int MOVED_PERMANENTLY = 301;
    public final static int FOUND = 302;
    public final static int SEE_OTHER = 303;
    public final static int NOT_MODIFIED = 304;
    public final static int USE_PROXY = 305;
    public final static int SWITCH_PROXY = 306;
    public final static int TEMPORARY_REDIRECT = 307;
    public final static int PERMANENT_REDIRECT = 308;

    /**
     * Client error codes (4XX).
     */
    public final static int BAD_REQUEST = 400;
    public final static int UNAUTHORIZED = 401;
    public final static int PAYMENT_REQUIRED = 402;
    public final static int FORBIDDEN = 403;
    public final static int NOT_FOUND = 404;
    public final static int METHOD_NOT_ALLOWED = 405;
    public final static int NOT_ACCEPTABLE = 406;
    public final static int PROXY_AUTHENTICATION_REQUIRED = 407;
    public final static int REQUEST_TIMEOUT = 408;
    public final static int CONFLICT = 409;
    public final static int GONE = 410;
    public final static int LENGTH_REQUIRED = 411;
    public final static int PRECONDITION_FAILED = 412;
    public final static int PAYLOAD_TOO_LARGE = 413;
    public final static int URI_TOO_LONG = 414;
    public final static int UNSUPPORTED_MEDIA_TYPE = 415;
    public final static int RANGE_NOT_SATISFIABLE = 416;
    public final static int EXPECTATION_FAILED = 417;
    public final static int I_AM_A_TEAPOT = 418;
    public final static int MISDIRECTED_REQUEST = 421;
    public final static int UNPROCESSABLE_ENTITY = 422;
    public final static int LOCKED = 423;
    public final static int FAILED_DEPENDENCY = 424;
    public final static int TOO_EARLY = 425;
    public final static int UPGRADE_REQUIRED = 426;
    public final static int PRECONDITION_REQUIRED = 428;
    public final static int TOO_MANY_REQUESTS = 429;
    public final static int HTTP_STATUS_CODE = 430;
    public final static int REQUEST_HEADER_FIELDS_TOO_LARGE = 431;
    public final static int LOGIN_TIME_OUT = 440;
    public final static int NO_RESPONSE = 444;
    public final static int RETRY_WITH = 449;
    public final static int BLOCKED_BY_WINDOWS_PARENTAL_CONTROLS = 450;
    public final static int UNAVAILABLE_FOR_LEGAL_REASONS = 451;
    public final static int CLIENT_CLOSED_CONNECTION_PREMATURELY = 460;
    public final static int TOO_MANY_FORWARDED_IP_ADDRESSES = 463;
    public final static int INCOMPATIBLE_PROTOCOL = 464;
    public final static int REQUEST_HEADER_TOO_LARGE = 494;
    public final static int SSL_CERTIFICATE_ERROR = 495;
    public final static int SSL_CERTIFICATE_REQUIRED = 496;
    public final static int HTTP_REQUEST_SENT_TO_HTTPS_PORT = 497;
    public final static int INVALID_TOKEN = 498;
    public final static int TOKEN_REQUIRED_OR_CLIENT_CLOSED_REQUEST = 499;

    /**
     * Server error codes (5XX).
     */
    public final static int INTERNAL_SERVER_ERROR = 500;
    public final static int NOT_IMPLEMENTED = 501;
    public final static int BAD_GATEWAY = 502;
    public final static int SERVICE_UNAVAILABLE = 503;
    public final static int GATEWAY_TIMEOUT = 504;
    public final static int HTTP_VERSION_NOT_SUPPORTED = 505;
    public final static int VARIANT_ALSO_NEGOTIATES = 506;
    public final static int INSUFFICIENT_STORAGE = 507;
    public final static int LOOP_DETECTED = 508;
    public final static int BANDWIDTH_LIMIT_EXCEEDED = 509;
    public final static int NOT_EXTENDED = 510;
    public final static int NETWORK_AUTHENTICATION_REQUIRED = 511;
    public final static int WEB_SERVER_IS_RETURNING_AN_UNKNOWN_ERROR = 520;
    public final static int WEB_SERVER_IS_DOWN = 521;
    public final static int CONNECTION_TIMED_OUT = 522;
    public final static int ORIGIN_IS_UNREACHABLE = 523;
    public final static int A_TIMEOUT_OCCURRED = 524;
    public final static int SSL_HANDSHAKE_FAILED = 525;
    public final static int INVALID_SSL_CERTIFICATE = 526;
    public final static int RAILGUN_LISTENER_TO_ORIGIN = 527;
    public final static int THE_SERVICE_IS_OVERLOADED = 529;
    public final static int SITE_FROZEN = 530;
    public final static int UNAUTHORIZED_AWS = 561;
    public final static int NETWORK_READ_TIMEOUT_ERROR = 598;
    public final static int NETWORK_CONNECTION_TIMEOUT_ERROR = 599;

    /**
     * Container array of all HttpStatus instances, sorted by code.
     */
    private final static HttpStatus[] ALL_SORTED_STATUSES;

    static {
        ALL_SORTED_STATUSES = new HttpStatus[]{
                // 100
                new HttpStatus(CONTINUE, "Continue", INFORMATIONAL),
                new HttpStatus(SWITCHING_PROTOCOLS, "Switching Protocols", INFORMATIONAL),
                new HttpStatus(PROCESSING, "Processing", INFORMATIONAL),
                new HttpStatus(EARLY_HINTS, "Early hints", INFORMATIONAL),

                // 200
                new HttpStatus(OK, "OK", SUCCESS),
                new HttpStatus(CREATED, "Created", SUCCESS),
                new HttpStatus(ACCEPTED, "Accepted", SUCCESS),
                new HttpStatus(NON_AUTHORITATIVE_INFORMATION, "Non-Authoritative Information", SUCCESS),
                new HttpStatus(NO_CONTENT, "No Content", SUCCESS),
                new HttpStatus(RESET_CONTENT, "Reset Content", SUCCESS),
                new HttpStatus(PARTIAL_CONTENT, "Partial Content", SUCCESS),
                new HttpStatus(MULTI_STATUS, "Multi-Status", SUCCESS),
                new HttpStatus(ALREADY_REPORTED, "Already Reported", SUCCESS),
                new HttpStatus(IM_USED, "IM Used", SUCCESS),

                // 300
                new HttpStatus(MULTIPLE_CHOICES, "Multiple Choices", REDIRECTION),
                new HttpStatus(MOVED_PERMANENTLY, "Moved Permanently", REDIRECTION),
                new HttpStatus(FOUND, "Found", REDIRECTION),
                new HttpStatus(SEE_OTHER, "See Other", REDIRECTION),
                new HttpStatus(NOT_MODIFIED, "Not Modified", REDIRECTION),
                new HttpStatus(USE_PROXY, "Use Proxy", REDIRECTION),
                new HttpStatus(SWITCH_PROXY, "Switch Proxy", REDIRECTION),
                new HttpStatus(TEMPORARY_REDIRECT, "Temporary Redirect", REDIRECTION),
                new HttpStatus(PERMANENT_REDIRECT, "Permanent Redirect", REDIRECTION),

                // 400
                new HttpStatus(BAD_REQUEST, "Bad Request", CLIENT_ERROR),
                new HttpStatus(UNAUTHORIZED, "Unauthorized", CLIENT_ERROR),
                new HttpStatus(PAYMENT_REQUIRED, "Payment Required", CLIENT_ERROR),
                new HttpStatus(FORBIDDEN, "Forbidden", CLIENT_ERROR),
                new HttpStatus(NOT_FOUND, "Not Found", CLIENT_ERROR),
                new HttpStatus(METHOD_NOT_ALLOWED, "Method Not Allowed", CLIENT_ERROR),
                new HttpStatus(NOT_ACCEPTABLE, "Not Acceptable", CLIENT_ERROR),
                new HttpStatus(PROXY_AUTHENTICATION_REQUIRED, "Proxy Authentication Required", CLIENT_ERROR),
                new HttpStatus(REQUEST_TIMEOUT, "Request Timeout", CLIENT_ERROR),
                new HttpStatus(CONFLICT, "Conflict", CLIENT_ERROR),
                new HttpStatus(GONE, "Gone", CLIENT_ERROR),
                new HttpStatus(LENGTH_REQUIRED, "Length Required", CLIENT_ERROR),
                new HttpStatus(PRECONDITION_FAILED, "Precondition Failed", CLIENT_ERROR),
                new HttpStatus(PAYLOAD_TOO_LARGE, "Payload Too Large", CLIENT_ERROR),
                new HttpStatus(URI_TOO_LONG, "URI Too Long", CLIENT_ERROR),
                new HttpStatus(UNSUPPORTED_MEDIA_TYPE, "Unsupported Media Type", CLIENT_ERROR),
                new HttpStatus(RANGE_NOT_SATISFIABLE, "Range Not Satisfiable", CLIENT_ERROR),
                new HttpStatus(EXPECTATION_FAILED, "Expectation Failed", CLIENT_ERROR),
                new HttpStatus(I_AM_A_TEAPOT, "I'm a Teapot", CLIENT_ERROR),
                new HttpStatus(MISDIRECTED_REQUEST, "Misdirected Request", CLIENT_ERROR),
                new HttpStatus(UNPROCESSABLE_ENTITY, "Unprocessable Entity", CLIENT_ERROR),
                new HttpStatus(LOCKED, "Locked", CLIENT_ERROR),
                new HttpStatus(FAILED_DEPENDENCY, "Failed Dependency", CLIENT_ERROR),
                new HttpStatus(TOO_EARLY, "Too Early", CLIENT_ERROR),
                new HttpStatus(UPGRADE_REQUIRED, "Upgrade Required", CLIENT_ERROR),
                new HttpStatus(PRECONDITION_REQUIRED, "Precondition Required", CLIENT_ERROR),
                new HttpStatus(TOO_MANY_REQUESTS, "Too Many Requests", CLIENT_ERROR),
                new HttpStatus(HTTP_STATUS_CODE, "HTTP Status Code", CLIENT_ERROR),
                new HttpStatus(REQUEST_HEADER_FIELDS_TOO_LARGE, "Request Header Fields Too Large", CLIENT_ERROR),
                new HttpStatus(LOGIN_TIME_OUT, "Login Time-Out", CLIENT_ERROR),
                new HttpStatus(NO_RESPONSE, "No Response", CLIENT_ERROR),
                new HttpStatus(RETRY_WITH, "Retry With", CLIENT_ERROR),
                new HttpStatus(BLOCKED_BY_WINDOWS_PARENTAL_CONTROLS, "Blocked by Windows Parental Controls", CLIENT_ERROR),
                new HttpStatus(UNAVAILABLE_FOR_LEGAL_REASONS, "Unavailable For Legal Reasons", CLIENT_ERROR),
                new HttpStatus(CLIENT_CLOSED_CONNECTION_PREMATURELY, "Client Closed Connection Prematurely", CLIENT_ERROR),
                new HttpStatus(TOO_MANY_FORWARDED_IP_ADDRESSES, "Too Many Forwarded IP Addresses", CLIENT_ERROR),
                new HttpStatus(INCOMPATIBLE_PROTOCOL, "Incompatible Protocol", CLIENT_ERROR),
                new HttpStatus(REQUEST_HEADER_TOO_LARGE, "Request Header Too Large", CLIENT_ERROR),
                new HttpStatus(SSL_CERTIFICATE_ERROR, "SSL Certificate Error", CLIENT_ERROR),
                new HttpStatus(SSL_CERTIFICATE_REQUIRED, "SSL Certificate Required", CLIENT_ERROR),
                new HttpStatus(HTTP_REQUEST_SENT_TO_HTTPS_PORT, "HTTP Request Sent to HTTPS Port", CLIENT_ERROR),
                new HttpStatus(INVALID_TOKEN, "Invalid Token", CLIENT_ERROR),
                new HttpStatus(TOKEN_REQUIRED_OR_CLIENT_CLOSED_REQUEST, "Token Required or Client Closed Request", CLIENT_ERROR),

                // 500
                new HttpStatus(INTERNAL_SERVER_ERROR, "Internal Server Error", SERVER_ERROR),
                new HttpStatus(NOT_IMPLEMENTED, "Not Implemented", SERVER_ERROR),
                new HttpStatus(BAD_GATEWAY, "Bad Gateway", SERVER_ERROR),
                new HttpStatus(SERVICE_UNAVAILABLE, "Service Unavailable", SERVER_ERROR),
                new HttpStatus(GATEWAY_TIMEOUT, "Gateway Timeout", SERVER_ERROR),
                new HttpStatus(HTTP_VERSION_NOT_SUPPORTED, "HTTP Version Not Supported", SERVER_ERROR),
                new HttpStatus(VARIANT_ALSO_NEGOTIATES, "Variant Also Negotiates", SERVER_ERROR),
                new HttpStatus(INSUFFICIENT_STORAGE, "Insufficient Storage", SERVER_ERROR),
                new HttpStatus(LOOP_DETECTED, "Loop Detected", SERVER_ERROR),
                new HttpStatus(BANDWIDTH_LIMIT_EXCEEDED, "Bandwidth Limit Exceeded", SERVER_ERROR),
                new HttpStatus(NOT_EXTENDED, "Not Extended", SERVER_ERROR),
                new HttpStatus(NETWORK_AUTHENTICATION_REQUIRED, "Network Authentication Required", SERVER_ERROR),
                new HttpStatus(WEB_SERVER_IS_RETURNING_AN_UNKNOWN_ERROR, "Web Server Is Returning an Unknown Error", SERVER_ERROR),
                new HttpStatus(WEB_SERVER_IS_DOWN, "Web Server Is Down", SERVER_ERROR),
                new HttpStatus(CONNECTION_TIMED_OUT, "Connection Timed Out", SERVER_ERROR),
                new HttpStatus(ORIGIN_IS_UNREACHABLE, "Origin Is Unreachable", SERVER_ERROR),
                new HttpStatus(A_TIMEOUT_OCCURRED, "A Timeout Occurred", SERVER_ERROR),
                new HttpStatus(SSL_HANDSHAKE_FAILED, "SSL Handshake Failed", SERVER_ERROR),
                new HttpStatus(INVALID_SSL_CERTIFICATE, "Invalid SSL Certificate", SERVER_ERROR),
                new HttpStatus(RAILGUN_LISTENER_TO_ORIGIN, "Railgun Listener to Origin", SERVER_ERROR),
                new HttpStatus(THE_SERVICE_IS_OVERLOADED, "The Service Is Overloaded", SERVER_ERROR),
                new HttpStatus(SITE_FROZEN, "Site Frozen", SERVER_ERROR),
                new HttpStatus(UNAUTHORIZED_AWS, "Unauthorized", SERVER_ERROR),
                new HttpStatus(NETWORK_READ_TIMEOUT_ERROR, "Network Read Timeout Error", SERVER_ERROR),
                new HttpStatus(NETWORK_CONNECTION_TIMEOUT_ERROR, "Network Connect Timeout Error", SERVER_ERROR)
        };
    }

    /**
     * Gets the HttpStatus corresponding to the given HTTP status code.
     *
     * @param code Code of status to be found.
     * @return HttpStatus.
     */
    public static HttpStatus getHttpStatus(int code) {
        validateCode(code);
        return findByCode(code);
    }

    /**
     * Finds the HttpStatus with a corresponding status code in the array, using the binary search algorithm.
     *
     * @param code Code of status to be found.
     * @return HttpStatus.
     */
    private static HttpStatus findByCode(int code) {
        int lp = 0;
        int rp = ALL_SORTED_STATUSES.length - 1;
        while (lp <= rp) {
            int mp = lp + (rp - lp) / 2;
            if (code == ALL_SORTED_STATUSES[mp].code) return ALL_SORTED_STATUSES[mp];
            else if (code < ALL_SORTED_STATUSES[mp].code) rp = mp - 1;
            else lp = mp + 1;
        }
        throw new IllegalStateException(String.format("Status with code: %d, is not found.", code));
    }

    /**
     * Validates if the given code is within allowed range.
     *
     * @param code Code to be verified.
     */
    private static void validateCode(int code) {
        if (code < ALL_SORTED_STATUSES[0].getCode() || code > ALL_SORTED_STATUSES[ALL_SORTED_STATUSES.length - 1].getCode()) {
            throw new IllegalStateException(String.format("Given code is out of range, code: %d.", code));
        }
    }

    public String getReason() {
        return reason;
    }

    public int getCode() {
        return code;
    }

    public HttpStatusType getType() {
        return type;
    }

}
