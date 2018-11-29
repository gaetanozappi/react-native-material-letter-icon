package com.zappi.ui.material.letter.icon;

import android.graphics.Color;
import android.graphics.Typeface;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.github.ivbaranov.mli.MaterialLetterIcon;

import java.util.ArrayList;
import java.util.Random;

public class RNMaterialLetterIcon extends ViewGroupManager<ViewGroup> {

    public static final String REACT_CLASS = "RNMaterialLetterIcon";

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    protected FrameLayout createViewInstance(final ThemedReactContext reactContext) {
        int randomId;

        Random rand = new Random();
        while (reactContext.getCurrentActivity().findViewById(randomId = rand.nextInt(Integer.MAX_VALUE) + 1) != null);
        final int viewId = randomId;

        Typeface font = Typeface.createFromAsset(reactContext.getAssets(), "fonts/Roboto-Light.ttf");
        MaterialLetterIcon iconicButton = new MaterialLetterIcon.Builder(reactContext.getCurrentActivity())
                .shapeType(MaterialLetterIcon.Shape.CIRCLE)
                .create();

        final FrameLayout frameLayout = new FrameLayout(reactContext.getCurrentActivity());
        frameLayout.addView(iconicButton);

        return frameLayout;
    }

    @ReactProp(name = "shapeColor")
    public void setShapeColor(FrameLayout iconicButtonFrame, String color) {
        MaterialLetterIcon iconicButton = (MaterialLetterIcon) iconicButtonFrame.getChildAt(0);
        iconicButton.setShapeColor(Color.parseColor(color));
    }

    @ReactProp(name = "letter")
    public void setLetter(FrameLayout iconicButtonFrame, String letter) {
        MaterialLetterIcon iconicButton = (MaterialLetterIcon) iconicButtonFrame.getChildAt(0);
        iconicButton.setLetter(letter);
    }

    @ReactProp(name = "letterColor")
    public void setLetterColor(FrameLayout iconicButtonFrame, String color) {
        MaterialLetterIcon iconicButton = (MaterialLetterIcon) iconicButtonFrame.getChildAt(0);
        iconicButton.setLetterColor(Color.parseColor(color));
    }

    @ReactProp(name = "letterSize")
    public void setLetterSize(FrameLayout iconicButtonFrame, int size) {
        MaterialLetterIcon iconicButton = (MaterialLetterIcon) iconicButtonFrame.getChildAt(0);
        iconicButton.setLetterSize(size);
    }

    @ReactProp(name = "lettersNumber")
    public void setLetterNumber(FrameLayout iconicButtonFrame, int num) {
        MaterialLetterIcon iconicButton = (MaterialLetterIcon) iconicButtonFrame.getChildAt(0);
        iconicButton.setLettersNumber(num);
    }

    @ReactProp(name = "initials")
    public void setInitials(FrameLayout iconicButtonFrame, boolean state) {
        MaterialLetterIcon iconicButton = (MaterialLetterIcon) iconicButtonFrame.getChildAt(0);
        iconicButton.setInitials(state);
    }

    @ReactProp(name = "initialsNumber")
    public void setInitialsNumber(FrameLayout iconicButtonFrame, int num) {
        MaterialLetterIcon iconicButton = (MaterialLetterIcon) iconicButtonFrame.getChildAt(0);
        iconicButton.setInitialsNumber(num);
    }

    @ReactProp(name = "shapeType")
    public void setShapeType(FrameLayout iconicButtonFrame, String state) {
        MaterialLetterIcon iconicButton = (MaterialLetterIcon) iconicButtonFrame.getChildAt(0);
        if (state.equalsIgnoreCase("circle")) {
            iconicButton.setShapeType(MaterialLetterIcon.Shape.CIRCLE);
        } else if (state.equalsIgnoreCase("triangle")) {
            iconicButton.setShapeType(MaterialLetterIcon.Shape.TRIANGLE);
        } else if (state.equalsIgnoreCase("rect")) {
            iconicButton.setShapeType(MaterialLetterIcon.Shape.RECT);
        } else if (state.equalsIgnoreCase("round")) {
            iconicButton.setShapeType(MaterialLetterIcon.Shape.ROUND_RECT);
        } else {
            iconicButton.setShapeType(MaterialLetterIcon.Shape.CIRCLE);
        }
    }

    @ReactProp(name = "border")
    public void setBorder(FrameLayout iconicButtonFrame, boolean state) {
        MaterialLetterIcon iconicButton = (MaterialLetterIcon) iconicButtonFrame.getChildAt(0);
        iconicButton.setBorder(state);
    }

    @ReactProp(name = "borderColor")
    public void setBorderColor(FrameLayout iconicButtonFrame, String color) {
        MaterialLetterIcon iconicButton = (MaterialLetterIcon) iconicButtonFrame.getChildAt(0);
        iconicButton.setBorderColor(Color.parseColor(color));
    }

    @ReactProp(name = "borderSize")
    public void setBorderSize(FrameLayout iconicButtonFrame, int size) {
        MaterialLetterIcon iconicButton = (MaterialLetterIcon) iconicButtonFrame.getChildAt(0);
        iconicButton.setBorderSize(size);
    }

    @ReactProp(name = "borderRy")
    public void setBorderRy(FrameLayout iconicButtonFrame, int size) {
        MaterialLetterIcon iconicButton = (MaterialLetterIcon) iconicButtonFrame.getChildAt(0);
        iconicButton.setRoundRectRy(size);
    }

    @ReactProp(name = "borderRx")
    public void setBorderRx(FrameLayout iconicButtonFrame, int size) {
        MaterialLetterIcon iconicButton = (MaterialLetterIcon) iconicButtonFrame.getChildAt(0);
        iconicButton.setRoundRectRx(size);
    }

}