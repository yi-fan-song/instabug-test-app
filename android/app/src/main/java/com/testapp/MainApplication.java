package com.testapp;

import android.app.Application;

import com.facebook.react.ReactApplication;
import com.instabug.reactlibrary.RNInstabugReactnativePackage;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;

import java.util.Arrays;
import java.util.List;

public class MainApplication extends Application implements ReactApplication {

  private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
    @Override
    public boolean getUseDeveloperSupport() {
      return BuildConfig.DEBUG;
    }

    @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
          new MainReactPackage(),
            		new RNInstabugReactnativePackage.Builder("8467070837361a54458352da23bcb995",MainApplication.this)
							.setInvocationEvent("shake")
							.setPrimaryColor("#1D82DC")
							.setFloatingEdge("left")
							.setFloatingButtonOffsetFromTop(250)
							.build()
      );
    }

    @Override
    protected String getJSMainModuleName() {
      return "index";
    }
  };

  @Override
  public ReactNativeHost getReactNativeHost() {
    return mReactNativeHost;
  }

  @Override
  public void onCreate() {
    super.onCreate();
    SoLoader.init(this, /* native exopackage */ false);
  }
}
