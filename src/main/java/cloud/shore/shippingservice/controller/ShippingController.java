package cloud.shore.shippingservice.controller;

import cloud.shore.shippingservice.model.ShippingDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShippingController {

    @PostMapping("/shipping/initiate")
    public boolean initiateShipping(@RequestBody ShippingDetails shippingDetails) {
        // Simulate shipping initiation
        return true; // Assume shipping initiation is successful
    }
}

