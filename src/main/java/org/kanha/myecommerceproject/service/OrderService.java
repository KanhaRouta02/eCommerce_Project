package org.kanha.myecommerceproject.service;

import jakarta.transaction.Transactional;
import org.kanha.myecommerceproject.payload.OrderDTO;

public interface OrderService {
    @Transactional
    OrderDTO placeOrder(String emailId, Long addressId, String paymentMethod, String pgName, String pgPaymentId, String pgStatus, String pgResponseMessage);
}
