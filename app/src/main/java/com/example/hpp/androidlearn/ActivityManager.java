package com.example.hpp.androidlearn;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vico13 on 2018/1/12.
 */

public class ActivityManager {
    private static List<Activity> activities = new ArrayList<>();

    public static void Add(Activity a){
        activities.add(a);
    }

    public static void Remove(Activity a){
        activities.remove(a);
    }

    public static void FinishAll(){
        for(Activity a : activities){
            if(!a.isFinishing()){
                a.finish();
            }
        }
        activities.clear();
    }
}
