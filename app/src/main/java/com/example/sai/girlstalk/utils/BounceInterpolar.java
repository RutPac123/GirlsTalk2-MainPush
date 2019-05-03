package com.example.sai.girlstalk.utils;

public class BounceInterpolar implements android.view.animation.Interpolator
{
    private double mAmplitude;
    private double mFrequency;

    public BounceInterpolar(double amplitude, double frequency) {
        mAmplitude = amplitude;
        mFrequency = frequency;
    }

    public float getInterpolation(float time) {
        return (float) (-1 * Math.pow(Math.E, -time/ mAmplitude) *
                Math.cos(mFrequency * time) + 1);
    }
}