package com.tiny.smallhost;

import net.wequick.small.Small;

/**
 * Function：
 * <p/>
 * Created by ${Tiny}
 * on 2016/5/2.
 */
public class Application extends android.app.Application{
    @Override
    public void onCreate() {
        super.onCreate();

        Small.setBaseUri("http://tiny.sample/demo/");

        Small.preSetUp(this);
    }
}
