package com.deepchannel.fleet.source.postgresql;

import com.deepchannel.fleet.common.logging.TaskLog;
import com.deepchannel.fleet.common.task.ConnectionConnectResult;
import com.deepchannel.fleet.common.task.ValidatableConnection;

import java.util.ArrayList;
import java.util.List;

public class Connection implements ValidatableConnection {

    public String host;

    public int port;

    public String database;

    public String username;

    public String password;

    public boolean useSsh;

    public String sshHost;

    public int sshPort;

    public String sshUser;

    @Override
    public ConnectionConnectResult attempConnect() {
        List<TaskLog> logs = new ArrayList<>();
        logs.add(new TaskLog("INFO", "Connceting to establish connection..."));
        logs.add(new TaskLog("INFO", "Connection etablished..."));

        return new ConnectionConnectResult(true, logs);
    }
}
