package com.deepchannel.fleet.source.s3;

public class Config {

    public String folderPath;

    public String filePrefix;

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
