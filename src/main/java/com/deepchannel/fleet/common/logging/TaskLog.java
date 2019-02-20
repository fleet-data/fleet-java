package com.deepchannel.fleet.common.logging;

import java.time.LocalDateTime;

public class TaskLog {

    public LocalDateTime ts;
    public String level;
    public String message;

    public TaskLog(String level, String message) {
        this.ts = LocalDateTime.now();
        this.level = level;
        this.message = message;
    }
}
