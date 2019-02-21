package com.deepchannel.fleet.source;

import java.util.HashMap;

public class Mapping {

    private HashMap<String, Object> connections = new HashMap<String, Object>();
    private HashMap<String, Object> sourceTaskConfigs = new HashMap<String, Object>();

    public Mapping() {

        this.setConnections();
        this.setConfigs();
    }

    public Object getSourceConnectionByKey(String key) {
        return connections.get(key);
    }

    private void setConnections() {
        connections.put("postgresql", com.deepchannel.fleet.source.postgresql.Connection.class);
        connections.put("salesforce", com.deepchannel.fleet.source.salesforce.Connection.class);
        connections.put("bigcommerce", com.deepchannel.fleet.source.bigcommerce.Connection.class);
        connections.put("mongodb", com.deepchannel.fleet.source.mongodb.Connection.class);
    }

    private void setConfigs() {

        sourceTaskConfigs.put("postgresql", com.deepchannel.fleet.source.postgresql.Config.class);
        sourceTaskConfigs.put("salesforce", com.deepchannel.fleet.source.salesforce.Config.class);
        sourceTaskConfigs.put("bigcommerce", com.deepchannel.fleet.source.bigcommerce.Config.class);
        sourceTaskConfigs.put("mongodb", com.deepchannel.fleet.source.mongodb.Config.class);
    }

}
