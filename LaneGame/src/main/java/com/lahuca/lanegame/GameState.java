package com.lahuca.lanegame;

import com.lahuca.lane.LaneGameState;
import com.lahuca.lane.LaneStateProperty;

import java.util.HashMap;

/**
 * @author _Neko1
 * @date 14.03.2024
 **/

public class GameState implements LaneGameState {

    private final String name;
    private boolean joinable;
    private boolean playable;
    private HashMap<String, StateProperty> properties;

    public GameState(String name, boolean joinable, boolean playable, HashMap<String, StateProperty> properties) {
        this.name = name;
        this.joinable = joinable;
        this.playable = playable;
        this.properties = properties;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isJoinable() {
        return joinable;
    }

    @Override
    public boolean isPlayable() {
        return playable;
    }

    @Override
    public HashMap<String, ? extends LaneStateProperty> getProperties() {
        return properties;
    }
}
