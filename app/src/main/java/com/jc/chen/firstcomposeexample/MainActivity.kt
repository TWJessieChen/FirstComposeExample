package com.jc.chen.firstcomposeexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jc.chen.firstcomposeexample.ui.theme.FirstComposeExampleTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewsStory()
//            Greeting("JC666")
        }
    }
}

@Composable
fun NewsStory() {
    val image = imageResource(R.drawable.header)
    MaterialTheme {
        Column(modifier = Modifier.padding(16.dp))
        {
            val imageModifier = Modifier
                .preferredHeight(180.dp)
                .fillMaxWidth()
                .clip(shape = RoundedCornerShape(4.dp))


            Spacer(Modifier.preferredHeight(8.dp))

            Image(
                image,
                modifier = imageModifier,
                contentScale = ContentScale.Crop
            )

            Spacer(Modifier.preferredHeight(16.dp))

            Text("The COVID-19 is FxxK!!!")
            Text("The World will be Good.")
            Text("January 2021 JC666")
        }
    }
}

@Preview
@Composable
fun DefaultPreview() {
    NewsStory()
}


//@Composable
//fun Greeting(name: String) {
//    Text (text = "Hello $name!")
//}
//
//@Preview
//@Composable
//fun PreviewGreeting() {
//    Greeting("JC666")
//}