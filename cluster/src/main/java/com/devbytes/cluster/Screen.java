
package com.devbytes.cluster;

import android.content.Context;
import android.content.res.Configuration;

/**
 * Utility class for common screen related tasks.
 * 
 * @author tperrien
 */
public class Screen {
    
    private static final int TABLET_SMALLEST_SCREEN_WIDTH_DP = 600;

    /**
     * Helper to determine screen orientation.
     * 
     * @param context The context.
     * @return True if the device orientation is landscape.
     */
    public static boolean isLandscape(Context context) {
        Configuration config = context.getResources().getConfiguration();
        return config.orientation == Configuration.ORIENTATION_LANDSCAPE;
    }

    /**
     * Helper to determine if the device is a tablet.
     * 
     * @param context The context.
     * @return True if the device is a tablet.
     */
    public static boolean isTablet(Context context) {
        Configuration config = context.getResources().getConfiguration();
        return config.smallestScreenWidthDp >= TABLET_SMALLEST_SCREEN_WIDTH_DP;
    }

}
