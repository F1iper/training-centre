package com.shopapp.domain;

public enum OrderStatus {

    INVALID,
    NOT_CONFIRMED,
    CONFIRMED,
    IN_PROGRESS,
    PENDING_FOR_COMPLETION,
    COMPLETED,
    SHIPPED,
    RETURNED,
    CANCELLED,
    WAITING_FOR_PAYMENT,
    READY;
}
