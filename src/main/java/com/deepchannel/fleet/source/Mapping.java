package com.deepchannel.fleet.source;

import java.util.HashMap;

public class Mapping {

    private HashMap<String, Object> connections = new HashMap<String, Object>();
    private HashMap<String, Object> sourceTaskConfigs = new HashMap<String, Object>();

    public Mapping() {

        this.setConnections();
        this.setConfigs();
    }

    private Object getSourceConnectionByKey(String key) {
        return connections.get(key);
    }

    private void setConnections() {
        connections.put("postgresql", com.deepchannel.fleet.source.postgresql.Connection.class);
        connections.put("salesforce", com.deepchannel.fleet.source.salesforce.Connection.class);
    }

    private void setConfigs() {

        sourceTaskConfigs.put("postgresql", com.deepchannel.fleet.source.postgresql.Config.class);
        sourceTaskConfigs.put("salesforce", com.deepchannel.fleet.source.salesforce.Config.class);
    }

}
