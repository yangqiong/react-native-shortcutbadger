package com.yangqiong.shortcutbadger;

import android.app.Activity;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import me.leolin.shortcutbadger.ShortcutBadger;

/**
 * Created by yang on 16/8/17.
 */
public class ShortcutBadgerModule extends ReactContextBaseJavaModule {
    static ReactApplicationContext context;

    public ShortcutBadgerModule(ReactApplicationContext reactContext){
        super(reactContext);
        context = reactContext;
    }

    @Override
    public String getName(){
        return "ShortcutBadger";
    }

    @ReactMethod
    public void applyCount(int badgeCount){
        if (context != null){
            ShortcutBadger.applyCount(context, badgeCount);
        }

    }

    @ReactMethod
    public void removeCount(){
        if (context != null){
            ShortcutBadger.removeCount(context);
        }

    }
}
