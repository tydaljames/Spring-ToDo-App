package com.tydal.springboottodoapplication;

import org.apache.catalina.User;

public class Goal {
    String goalName;
    String result; //Specific
    String measurement;
    String action;
    int period;
    boolean realistic;
    int time;
    User accountAbilityPartner;
    /**
    * Reward in multiple ways (similar to rewards in WoW):
     * 1) Levels come fast early. Reach level for each goal early on. Slower with time.
     * 2) Milestones for major goal points (level 20, catform equivalent). Music tickets, dinners, etc?
     * 3) Items come randomly (money). Normally small payouts with random large payouts.
     *
    * */
    String reward;
    String punishment;
}

//SMART goals