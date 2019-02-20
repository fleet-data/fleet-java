package com.deepchannel.fleet.source.bigcommerce;

import com.deepchannel.fleet.common.logging.TaskLog;
import com.deepchannel.fleet.common.task.ConnectionConnectResult;
import com.deepchannel.fleet.common.task.ValidatableConnection;

import java.util.ArrayList;
import java.util.List;

public class Connection implements ValidatableConnection {

    public String storeHash;

    public String clientId;

    public String authToken;

    @Override
    public ConnectionConnectResult attemptConnect() {
        List<TaskLog> logs = new ArrayList<>();
        logs.add(new TaskLog("INFO", "Connceting to establish connection..."));
        logs.add(new TaskLog("INFO", "Connection etablished..."));

        return new ConnectionConnectResult(true, logs);
    }
}
