package com.replace.replace.api.event;


import com.replace.replace.configuration.event.Event;

import java.util.Map;

/**
 * @author Romain Lavabre <romain.lavabre@fairfair.com>
 * {@see https://github.com/romainlavabre/spring-starter-event.git}
 */
public interface EventDispatcher {

    /**
     * Launch new event
     *
     * @param event
     * @param params
     * @return
     */
    EventDispatcher trigger( Event event, Map< String, Object > params );
}
