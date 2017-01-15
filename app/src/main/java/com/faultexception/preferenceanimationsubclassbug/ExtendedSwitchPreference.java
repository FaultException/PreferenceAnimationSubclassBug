package com.faultexception.preferenceanimationsubclassbug;

import android.content.Context;
import android.preference.SwitchPreference;
import android.util.AttributeSet;

/**
 * Duplicated SwitchPreference. Somehow this breaks animation.
 */
public class ExtendedSwitchPreference extends SwitchPreference {

    public ExtendedSwitchPreference(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public ExtendedSwitchPreference(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public ExtendedSwitchPreference(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ExtendedSwitchPreference(Context context) {
        super(context);
    }

}
