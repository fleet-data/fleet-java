package com.deepchannel.fleet.source.s3;

public class Config {

    public String folderPath;

    public String fileNamePattern;

    public String fileType;

    public String delimiter;

    public String compressionType;

    public String errorHandlingType;

    public boolean useLatestFile;

    public int skipHeaderLines;

    public int skipFooterLines;

    public String fileNameTimestampRegex;

    public String fileNameTimestampFormat;

    public String fileNameTimestampColumnName;

    public String maxTimestampValueField;

}
