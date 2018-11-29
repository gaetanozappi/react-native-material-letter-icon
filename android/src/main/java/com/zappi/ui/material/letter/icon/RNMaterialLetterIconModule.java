package com.zappi.ui.material.letter.icon;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;

public class RNMaterialLetterIconModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public RNMaterialLetterIconModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "RNMaterialLetterIcon";
    }
}
