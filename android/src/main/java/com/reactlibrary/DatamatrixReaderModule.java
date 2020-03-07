package com.reactlibrary;

import android.content.Intent;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.reactlibrary.datamatrix.DetectorActivity;

public class DatamatrixReaderModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext = getReactApplicationContext();

    public DatamatrixReaderModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "DatamatrixReader";
    }

    @ReactMethod
    public void OpenScanner() {
        Intent intent = new Intent(reactContext, DetectorActivity.class);
        if(intent.resolveActivity(reactContext.getPackageManager())!=null){
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            reactContext.startActivity(intent);
        }
    }
}
