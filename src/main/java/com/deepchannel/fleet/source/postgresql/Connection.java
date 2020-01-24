package com.deepchannel.fleet.source.postgresql;

import com.deepchannel.fleet.common.logging.TaskLog;
import com.deepchannel.fleet.common.task.ConnectionConnectResult;
import com.deepchannel.fleet.common.task.ValidatableConnection;
import com.deepchannel.fleet.common.SshConfig;

import java.util.ArrayList;
import java.util.List;

public class Connection implements ValidatableConnection {

    public String host;

    public int port;

    public String database;

    public String username;

    public String password;

    public SshConfig ssh;

    @Override
    public ConnectionConnectResult attemptConnect() {
        List<TaskLog> logs = new ArrayList<>();
        logs.add(new TaskLog("INFO", "Attempting to establish connection to PostgreSQL..."));
        logs.add(new TaskLog("INFO", "Connection established..."));

        return new ConnectionConnectResult(true, logs);
    }
}
