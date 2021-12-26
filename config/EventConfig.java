package com.replace.replace.api.event.config;

import com.replace.replace.api.event.EventSubscriber;
import com.replace.replace.api.event.annotation.Subscribers;
import com.replace.replace.api.event.annotation.UnitEvent;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Romain Lavabre <romainlavabre98@gmail.com>
 * {@see https://github.com/romainlavabre/spring-starter-event.git}
 */
@Service
public class EventConfig implements Event {


    public EventConfig() {
    }


    @UnitEvent( name = Event.TRANSACTION_SUCCESS )
    public Map< String, Class > transactionSuccess() {
        return new HashMap<>();
    }


    @Subscribers( event = Event.TRANSACTION_SUCCESS )
    public List< EventSubscriber > subscribersTransactionSuccess() {
        return List.of();
    }
}
