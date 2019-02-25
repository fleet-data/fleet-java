package com.deepchannel.fleet.target;

import java.util.HashMap;

public class Mapping {

    private HashMap<String, Class> connections = new HashMap<>();
    private HashMap<String, Class> targetTaskConfigs = new HashMap<>();

    public Mapping() {

        this.setConnections();
        this.setConfigs();
    }

    public Class getTargetConnectionByKey(String key) {
        return connections.get(key);
    }

    public Class getTargetConfigByKey(String key) {
        return targetTaskConfigs.get(key);
    }

    private void setConnections() {
        connections.put("redshift", com.deepchannel.fleet.target.redshift.Connection.class);
        connections.put("snowflake", com.deepchannel.fleet.target.snowflake.Connection.class);
    }

    private void setConfigs() {
        targetTaskConfigs.put("redshift", com.deepchannel.fleet.target.redshift.Config.class);
        targetTaskConfigs.put("snowflake", com.deepchannel.fleet.target.snowflake.Config.class);
    }

}