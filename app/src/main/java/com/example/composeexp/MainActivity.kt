package com.example.composeexp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val fontFamily = FontFamily(
            Font(R.font.roboto_light, FontWeight.Light),
            Font(R.font.roboto_medium, FontWeight.Medium),
            Font(R.font.roboto_black, FontWeight.Black),
            Font(R.font.roboto_black_italic, FontWeight.Black, FontStyle.Italic),
        )
        setContent {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Black)
            ) {
                Text(
                    modifier = Modifier.align(Alignment.Center),
                    text = buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                color = Color.Blue,
                                fontSize = 40.sp,
                                fontStyle = FontStyle.Italic,
                                fontWeight = FontWeight.Medium
                            )
                        ) {
                            append("Simple ")
                        }
                        append("String")
                    },
                    color = Color.White,
                    fontSize = 32.sp,
                    fontFamily = fontFamily,
                    fontWeight = FontWeight.Light,
                    textAlign = TextAlign.Center,
                    textDecoration = TextDecoration.Underline
                )
            }
        }
    }
}
