package com.deepchannel.fleet.target;

import java.util.HashMap;

public class Mapping {

    private HashMap<String, Object> connections = new HashMap<String, Object>();
    private HashMap<String, Object> sourceTaskConfigs = new HashMap<String, Object>();

    public Mapping() {

        this.setConnections();
        this.setConfigs();
    }

    public Object getTargetConnectionByKey(String key) {
        return connections.get(key);
    }

    private void setConnections() {
        connections.put("redshift", com.deepchannel.fleet.target.redshift.Connection.class);
        connections.put("snowflake", com.deepchannel.fleet.target.snowflake.Connection.class);
    }

    private void setConfigs() {
        sourceTaskConfigs.put("redshift", com.deepchannel.fleet.target.redshift.Config.class);
        sourceTaskConfigs.put("snowflake", com.deepchannel.fleet.target.snowflake.Config.class);
    }

}