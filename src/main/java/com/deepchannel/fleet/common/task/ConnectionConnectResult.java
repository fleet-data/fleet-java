package com.deepchannel.fleet.common.task;

import com.deepchannel.fleet.common.logging.TaskLog;

import java.util.ArrayList;
import java.util.List;

public class ConnectionConnectResult {

    public boolean success;
    public List<TaskLog> logs = new ArrayList<>();

    public ConnectionConnectResult(boolean success) {
        this.success = success;
    }

    public ConnectionConnectResult(boolean success, List<TaskLog> logs) {
        this.success = success;
        this.logs = logs;
    }
}
