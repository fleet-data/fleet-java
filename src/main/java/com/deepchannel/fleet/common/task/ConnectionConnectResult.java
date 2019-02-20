package com.deepchannel.fleet.common.task;

import com.deepchannel.fleet.common.logging.TaskLog;

import java.util.ArrayList;
import java.util.List;

public class ConnectionConnectResult {

    public ConnectionConnectResult(boolean success) {
        this.success = success;
    }

    public ConnectionConnectResult(boolean success, ArrayList<TaskLog> logs) {
        this.success = success;
        this.logs = logs;
    }

    boolean success;
    List<TaskLog> logs = new ArrayList<>();
}
