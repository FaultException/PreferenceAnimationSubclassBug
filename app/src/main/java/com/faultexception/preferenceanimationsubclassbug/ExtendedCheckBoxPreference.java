package com.faultexception.preferenceanimationsubclassbug;

import android.content.Context;
import android.preference.CheckBoxPreference;
import android.preference.SwitchPreference;
import android.util.AttributeSet;

/**
 * Duplicated CheckBoxPreference. Somehow this breaks animation.
 */
public class ExtendedCheckBoxPreference extends CheckBoxPreference {

    public ExtendedCheckBoxPreference(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public ExtendedCheckBoxPreference(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public ExtendedCheckBoxPreference(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ExtendedCheckBoxPreference(Context context) {
        super(context);
    }

}
