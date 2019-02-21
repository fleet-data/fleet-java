package com.deepchannel.fleet;

import com.deepchannel.fleet.common.logging.TaskLog;
import com.deepchannel.fleet.common.task.ConnectionConnectResult;
import com.deepchannel.fleet.common.task.ValidatableConnection;

public class FleetRunner {

    public static void main(String[] args) {
        ValidatableConnection con = new com.deepchannel.fleet.target.snowflake.Connection();
        ConnectionConnectResult connectionConnectResult = con.attemptConnect();

        for (TaskLog tl : connectionConnectResult.logs) {
            System.out.println(tl.message);
        }
    }
}
