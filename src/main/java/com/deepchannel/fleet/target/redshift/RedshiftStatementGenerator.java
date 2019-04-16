package com.deepchannel.fleet.target.redshift;

import com.deepchannel.fleet.common.DataStoreColumn;

import java.util.List;

public class RedshiftStatementGenerator {

    public String getCreateTableStatement(
            String schemaName,
            List<DataStoreColumn> columns
    ) {
        StringBuilder statement = new StringBuilder();

        statement.append(String.format("CREATE SCHEMA %s IF NOT EXISTS;", schemaName));

        return statement.toString();
    }
}
