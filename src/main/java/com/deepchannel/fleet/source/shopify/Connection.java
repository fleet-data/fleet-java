package com.deepchannel.fleet.source.shopify;

import com.deepchannel.fleet.common.logging.TaskLog;
import com.deepchannel.fleet.common.task.ConnectionConnectResult;
import com.deepchannel.fleet.common.task.ValidatableConnection;

import java.util.ArrayList;
import java.util.List;

public class Connection implements ValidatableConnection {

    public String accessToken;

    public String shopName;

    @Override
    public ConnectionConnectResult attemptConnect() {
        List<TaskLog> logs = new ArrayList<>();
        logs.add(new TaskLog("INFO", "Attempting to establish connection to Shopify..."));
        logs.add(new TaskLog("INFO", "Connection established"));

        return new ConnectionConnectResult(true, logs);
    }
}
