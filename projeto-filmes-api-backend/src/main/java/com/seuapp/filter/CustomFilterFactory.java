package com.seuapp.filter;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.stereotype.Component;

@Component
public class CustomFilterFactory extends AbstractGatewayFilterFactory<CustomFilterFactory.Config> {

    public static class Config {
        private int limit;
        private int duration;

        // Getters e Setters
        public int getLimit() {
            return limit;
        }

        public void setLimit(int limit) {
            this.limit = limit;
        }

        public int getDuration() {
            return duration;
        }

        public void setDuration(int duration) {
            this.duration = duration;
        }
    }

    public CustomFilterFactory() {
        super(Config.class);
    }

    @Override
    public GatewayFilter apply(Config config) {
        return (exchange, chain) -> {
            // Aqui você pode implementar a lógica do filtro.
            System.out.println("Limite: " + config.getLimit() + ", Duração: " + config.getDuration());
            return chain.filter(exchange);
        };
    }

    public String getName() {
        return "CustomFilter";
    }
}