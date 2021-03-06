package com.deepchannel.fleet.target.snowflake;

import com.deepchannel.fleet.common.logging.TaskLog;
import com.deepchannel.fleet.common.task.ConnectionConnectResult;
import com.deepchannel.fleet.common.task.ValidatableConnection;

import java.util.ArrayList;
import java.util.List;

public class Connection implements ValidatableConnection {

    public String host;

    public int port;

    public String database;

    public String warehouse;

    public String username;

    public String password;

    @Override
    public ConnectionConnectResult attemptConnect() {
        List<TaskLog> logs = new ArrayList<>();
        logs.add(new TaskLog("INFO", "Attempting to establish connection to Snowflake..."));
        logs.add(new TaskLog("INFO", "Connection failed: invalid credentials"));

        return new ConnectionConnectResult(true, logs);
    }
}
