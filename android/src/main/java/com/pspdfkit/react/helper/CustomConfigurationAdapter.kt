package com.pspdfkit.react.helper;

import com.pspdfkit.configuration.activity.PdfActivityConfiguration;

class CustomConfigurationAdapter {
    companion object {
        @JvmStatic
        fun setMaxZoom(activityConfiguration: PdfActivityConfiguration, maxZoomScale: Float): PdfActivityConfiguration {
            return activityConfiguration.copy(configuration = activityConfiguration.configuration.copy(maxZoomScale = maxZoomScale));
        }
    }
}