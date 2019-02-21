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
        connections.put("appsflyer", com.deepchannel.fleet.source.appsflyer.Connection.class);
        connections.put("bigcommerce", com.deepchannel.fleet.source.bigcommerce.Connection.class);
        connections.put("delighted", com.deepchannel.fleet.source.delighted.Connection.class);
        connections.put("intercom", com.deepchannel.fleet.source.intercom.Connection.class);
        connections.put("itunes-connect", com.deepchannel.fleet.source.itunesConnect.Connection.class);
        connections.put("mixpanel", com.deepchannel.fleet.source.mixpanel.Connection.class);
        connections.put("mongodb", com.deepchannel.fleet.source.mongodb.Connection.class);
        connections.put("msa", com.deepchannel.fleet.source.msa.Connection.class);
        connections.put("open-exchange-rates", com.deepchannel.fleet.source.openExchangeRates.Connection.class);
        connections.put("paypal", com.deepchannel.fleet.source.paypal.Connection.class);
        connections.put("postgresql", com.deepchannel.fleet.source.postgresql.Connection.class);
        connections.put("recharge", com.deepchannel.fleet.source.recharge.Connection.class);
        connections.put("sailthru", com.deepchannel.fleet.source.sailthruDataExporter.Connection.class);
        connections.put("salesforce", com.deepchannel.fleet.source.salesforce.Connection.class);
        connections.put("salesforce-marketing-cloud", com.deepchannel.fleet.source.salesforceMarketingCloud.Connection.class);
        connections.put("shopify", com.deepchannel.fleet.source.shopify.Connection.class);
        connections.put("zendesk", com.deepchannel.fleet.source.zendesk.Connection.class);
    }

    private void setConfigs() {

        sourceTaskConfigs.put("postgresql", com.deepchannel.fleet.source.postgresql.Config.class);
        sourceTaskConfigs.put("salesforce", com.deepchannel.fleet.source.salesforce.Config.class);
        sourceTaskConfigs.put("bigcommerce", com.deepchannel.fleet.source.bigcommerce.Config.class);
        sourceTaskConfigs.put("mongodb", com.deepchannel.fleet.source.mongodb.Config.class);
    }

}
