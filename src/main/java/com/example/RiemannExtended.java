package com.example;

import com.codahale.metrics.riemann.Riemann;
import io.riemann.riemann.client.IRiemannClient;

public class RiemannExtended extends Riemann {
    public RiemannExtended(IRiemannClient client) {
        super(client);
    }
}
