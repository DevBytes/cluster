
package com.devbytes.cluster;

import static org.fest.assertions.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import android.content.Context;
import android.content.res.Configuration;

@RunWith(RobolectricTestRunner.class)
@Config(manifest = Config.NONE)
public class ScreenTest {

    @Test
    public void landscapeCheck() {
        Context context = Robolectric.application;
        Configuration config = context.getResources().getConfiguration();
        config.orientation = Configuration.ORIENTATION_LANDSCAPE;
        assertThat(Screen.isLandscape(context)).isTrue();
    }

    @Test
    public void tabletCheckOnTablet1() {
        Context context = Robolectric.application;
        Configuration config = context.getResources().getConfiguration();
        config.smallestScreenWidthDp = 600;
        assertThat(Screen.isTablet(context)).isTrue();
    }

    @Test
    public void tabletCheckOnTablet2() {
        Context context = Robolectric.application;
        Configuration config = context.getResources().getConfiguration();
        config.smallestScreenWidthDp = 800;
        assertThat(Screen.isTablet(context)).isTrue();
    }

    @Test
    public void tabletCheckOnHandset() {
        Context context = Robolectric.application;
        Configuration config = context.getResources().getConfiguration();
        config.smallestScreenWidthDp = 500;
        assertThat(Screen.isTablet(context)).isFalse();
    }

}
