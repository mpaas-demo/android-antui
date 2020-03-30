package com.alipay.mobile.antui.viewdemo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.alipay.mobile.framework.LauncherApplicationAgent;
import com.alipay.mobile.framework.app.ActivityApplication;
import com.mpaas.demo.antui.BuildConfig;
import com.mpaas.mobile.metainfo.Application;
import com.mpaas.mobile.metainfo.MetaInfoLibrary;

@MetaInfoLibrary(applicationId = BuildConfig.APPLICATION_ID)
@Application(appId = "33330016")
public class MicroAppEntry extends ActivityApplication {

    @Override
    public String getEntryClassName() {
        return HomeActivity.class.getName();
    }

    /**
     * Application被创建时被调用，实现类可以在这里做些初始化的工作
     *
     * @param bundle
     */
    @Override
    protected void onCreate(Bundle bundle) {
    }

    /**
     * 启动Application时被调用
     * 如果Application还没有被创建，会先去执行create方法，然后再执行onStart()回调
     */
    @Override
    protected void onStart() {
    }

    /**
     * 当Application被销毁时，调用此回调
     *
     * @param bundle
     */
    @Override
    protected void onDestroy(Bundle bundle) {

    }

    /**
     * 启动Application时，如果Application已经被start过了，则不调用onStart()而是调用onRestart()回调
     *
     * @param bundle
     */
    @Override
    protected void onRestart(Bundle bundle) {
        Context ctx = LauncherApplicationAgent.getInstance().getApplicationContext();
        Intent it = new Intent(ctx, HomeActivity.class);
        ctx.startActivity(it.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
    }

    /**
     * 当一个新的Application被start时，当前的Application将被暂停，此方法被回调
     */
    @Override
    protected void onStop() {

    }
}
