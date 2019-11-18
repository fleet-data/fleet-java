package com.deepchannel.fleet.source.sftp;

public class Config {

    public String folderPath;

    public String fileNamePattern;

    public String fileType;

    public String delimiter;

    public String compressionType;

    public String errorHandlingType;

    public boolean useLatest;

    public int headerLineNumber;

    public int skipFooterLines;

    public String fileNameTimestampRegex;

    public String fileNameTimestampFormat;

    public String fileNameTimestampColumnName;

    public String maxTimestampValueField;

    public String subFileNameRegex;

    public Integer skipTableLines;

    public Integer sheetNumber;
}
