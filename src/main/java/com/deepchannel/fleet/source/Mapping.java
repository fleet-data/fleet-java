package com.deepchannel.fleet.source;

import java.util.HashMap;

public class Mapping {

    private HashMap<String, Class> connections = new HashMap<String, Class>();
    private HashMap<String, Class> sourceTaskConfigs = new HashMap<String, Class>();

    public Mapping() {

        this.setConnections();
        this.setConfigs();
    }

    public Class getSourceConnectionByKey(String key) {
        return connections.get(key);
    }

    public Class getSourceConfigByKey(String key) { return sourceTaskConfigs.get(key); }

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
        connections.put("sftp", com.deepchannel.fleet.source.sftp.Connection.class);
        connections.put("s3", com.deepchannel.fleet.source.s3.Connection.class);
        connections.put("file-upload", com.deepchannel.fleet.source.fileUpload.Connection.class);
        connections.put("email", com.deepchannel.fleet.source.email.Connection.class);
        connections.put("facebook-ads", com.deepchannel.fleet.source.facebookAds.Connection.class);
        connections.put("google-analytics", com.deepchannel.fleet.source.googleAnalytics.Connection.class);
        connections.put("adwords", com.deepchannel.fleet.source.googleAdwords.Connection.class);
        connections.put("box", com.deepchannel.fleet.source.box.Connection.class);
        connections.put("google-sheets", com.deepchannel.fleet.source.googleSheets.Connection.class);
        connections.put("airtable", com.deepchannel.fleet.source.airtable.Connection.class);
    }

    private void setConfigs() {

        sourceTaskConfigs.put("appsflyer", com.deepchannel.fleet.source.appsflyer.Config.class);
        sourceTaskConfigs.put("bigcommerce", com.deepchannel.fleet.source.bigcommerce.Config.class);
        sourceTaskConfigs.put("delighted", com.deepchannel.fleet.source.delighted.Config.class);
        sourceTaskConfigs.put("intercom", com.deepchannel.fleet.source.intercom.Config.class);
        sourceTaskConfigs.put("itunes-connect", com.deepchannel.fleet.source.itunesConnect.Config.class);
        sourceTaskConfigs.put("mixpanel", com.deepchannel.fleet.source.mixpanel.Config.class);
        sourceTaskConfigs.put("mongodb", com.deepchannel.fleet.source.mongodb.Config.class);
        sourceTaskConfigs.put("msa", com.deepchannel.fleet.source.msa.Config.class);
        sourceTaskConfigs.put("open-exchange-rates", com.deepchannel.fleet.source.openExchangeRates.Config.class);
        sourceTaskConfigs.put("paypal", com.deepchannel.fleet.source.paypal.Config.class);
        sourceTaskConfigs.put("postgresql", com.deepchannel.fleet.source.postgresql.Config.class);
        sourceTaskConfigs.put("recharge", com.deepchannel.fleet.source.recharge.Config.class);
        sourceTaskConfigs.put("sailthru", com.deepchannel.fleet.source.sailthruDataExporter.Config.class);
        sourceTaskConfigs.put("salesforce", com.deepchannel.fleet.source.salesforce.Config.class);
        sourceTaskConfigs.put("salesforce-marketing-cloud", com.deepchannel.fleet.source.salesforceMarketingCloud.Config.class);
        sourceTaskConfigs.put("shopify", com.deepchannel.fleet.source.shopify.Config.class);
        sourceTaskConfigs.put("zendesk", com.deepchannel.fleet.source.zendesk.Config.class);
        sourceTaskConfigs.put("sftp", com.deepchannel.fleet.source.sftp.Config.class);
        sourceTaskConfigs.put("s3", com.deepchannel.fleet.source.s3.Config.class);
        sourceTaskConfigs.put("file-upload", com.deepchannel.fleet.source.fileUpload.Config.class);
        sourceTaskConfigs.put("email", com.deepchannel.fleet.source.email.Config.class);
        sourceTaskConfigs.put("facebook-ads", com.deepchannel.fleet.source.facebookAds.Config.class);
        sourceTaskConfigs.put("google-analytics", com.deepchannel.fleet.source.googleAnalytics.Config.class);
        sourceTaskConfigs.put("adwords", com.deepchannel.fleet.source.googleAdwords.Config.class);
        sourceTaskConfigs.put("box", com.deepchannel.fleet.source.box.Config.class);
        sourceTaskConfigs.put("google-sheets", com.deepchannel.fleet.source.googleSheets.Config.class);
        sourceTaskConfigs.put("airtable", com.deepchannel.fleet.source.airtable.Config.class);
    }

}
