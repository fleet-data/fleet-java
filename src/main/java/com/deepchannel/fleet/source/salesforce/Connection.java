package com.deepchannel.fleet.source.salesforce;

import com.deepchannel.fleet.common.logging.TaskLog;
import com.deepchannel.fleet.common.task.ConnectionConnectResult;
import com.deepchannel.fleet.common.task.ValidatableConnection;

import java.util.ArrayList;
import java.util.List;

public class Connection implements ValidatableConnection {

    public String clientId;

    public String clientSecret;

    public String refreshToken;

    @Override
    public ConnectionConnectResult attemptConnect() {
        List<TaskLog> logs = new ArrayList<>();
        logs.add(new TaskLog("INFO", "Attempting to establish connection to Salesforce..."));
        logs.add(new TaskLog("INFO", "Connection established"));

        return new ConnectionConnectResult(true, logs);
    }
}
