package com.airbnb.android.showkase_processor_testing

import androidx.compose.ui.graphics.Color
import com.airbnb.android.showkase.annotation.ShowkaseColor

public class WrapperClass {
    @ShowkaseColor
    public val red: Color = Color(0xffff0000)
}