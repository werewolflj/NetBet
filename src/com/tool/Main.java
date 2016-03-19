package com.tool;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        try {
            Robot robot = new Robot();
            robot.delay(5000);

            MyNetBetRobot myRobot = new MyNetBetRobot();

            //做庄绳玩法
            myRobot.doChainBet(robot, 100);


            /*
            for(int i = 0 ; i < 2 ; i ++) {
                Point mousepoint = MouseInfo.getPointerInfo().getLocation();
                System.out.println(mousepoint.x+"\t"+mousepoint.y);
                myRobot.showColor(robot,mousepoint.x,mousepoint.y);
                robot.delay(5000);
            }*/


        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
