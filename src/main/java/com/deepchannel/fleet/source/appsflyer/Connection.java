package com.deepchannel.fleet.source.appsflyer;

import com.deepchannel.fleet.common.logging.TaskLog;
import com.deepchannel.fleet.common.task.ConnectionConnectResult;
import com.deepchannel.fleet.common.task.ValidatableConnection;

import java.util.ArrayList;
import java.util.List;

public class Connection implements ValidatableConnection {

    public String appId;

    public String apiKey;

    @Override
    public ConnectionConnectResult attemptConnect() {
        List<TaskLog> logs = new ArrayList<>();
        logs.add(new TaskLog("INFO", "Attempting to establish connection to AppsFlyer..."));
        logs.add(new TaskLog("INFO", "Connection failed: invalid credentials"));

        return new ConnectionConnectResult(false, logs);
    }
}
