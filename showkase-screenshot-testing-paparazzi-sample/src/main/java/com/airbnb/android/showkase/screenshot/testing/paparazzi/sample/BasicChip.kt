package com.airbnb.android.showkase.screenshot.testing.paparazzi.sample

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.dp
import com.airbnb.android.showkase.annotation.ShowkaseComposable

@Composable
fun BasicChip(
    text: String,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier.graphicsLayer(
            clip = true,
            shape = RoundedCornerShape(12.dp)
        )
    ) {
        BasicText(
            text = text,
            modifier = Modifier.padding(16.dp),
        )
    }
}

@ShowkaseComposable(name = "Basic Chip", group = "Chips", defaultStyle = true)
@Composable
fun BasicChipPreview() {
    BasicChip(text = "Chip Component")
}

@ShowkaseComposable(name = "Basic Chip", group = "Chips", styleName = "Yellow Background")
@Composable
fun BasicChipYellowPreview() {
    BasicChip(
        text = "Chip Component",
        modifier = Modifier.background(color = Color.Yellow)
    )
}
