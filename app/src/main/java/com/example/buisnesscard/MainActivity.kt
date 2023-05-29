package com.example.buisnesscard


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.buisnesscard.ui.theme.BuisnessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BuisnessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeBusinessCard()
                }
            }
        }
    }
}

@Composable
fun ComposeBusinessCard() {

        Column{
            ComposeBusinessImage(
                name = stringResource(R.string.name),
                title = stringResource(R.string.title),
                backgroundColor = Color(0xFFC0F5FF),
                modifier = Modifier.weight(1f)
            )

            ComposeBusinessBottom(
                phone = stringResource(R.string.phone),
                email = stringResource(R.string.email),
                social_name = stringResource(R.string.social_name),
                backgroundColor = Color(0xFFC0F5FF),
                modifier = Modifier.weight(1f)
            )


        }
    }

@Composable
fun ComposeBusinessImage(
    name: String,
    title: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
){

        Column(
            modifier = modifier
                .fillMaxWidth()
                .background(backgroundColor),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally,

            ) {
            val image = painterResource(R.drawable.android_logo)
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .height(120.dp)
                    .width(120.dp)
                    .aspectRatio(1f)
            )
            Text(
                text = name,
                modifier = Modifier.padding(bottom = 16.dp),
                fontWeight = FontWeight.Bold,
                fontSize = 32.sp,
                fontFamily = FontFamily.SansSerif,
                color = Color.Black
            )
            Text(
                text = title,
                modifier = Modifier.padding(bottom = 16.dp),
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                fontFamily = FontFamily.SansSerif,
                color = Color.Black
            )
        }
}

@Composable
fun ComposeBusinessBottom(
    phone: String,
    email: String,
    social_name: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier
            .fillMaxWidth()
            .background(backgroundColor),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

    ){

        Row(
            verticalAlignment = Alignment.CenterVertically

        ) {
            val image = painterResource(R.drawable.baseline_phone_android_black_24dp)
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .size(24.dp)
                    .aspectRatio(1f)
                    .padding(end = 8.dp)
            )

            Text(
                text = phone,

                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                fontFamily = FontFamily.SansSerif,
                color = Color.Black
            )
        }
        Row(verticalAlignment = Alignment.CenterVertically

        ){
            val image = painterResource(R.drawable.baseline_mail_black_24dp)
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .size(24.dp)
                    .aspectRatio(1f)
                    .padding(end = 8.dp)
            )
            Text(
                text = email,

                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                fontFamily = FontFamily.SansSerif,
                color = Color.Black
            )
        }
        Row(verticalAlignment = Alignment.CenterVertically

        ){
            val image = painterResource(R.drawable.baseline_person_black_24dp)
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .size(24.dp)
                    .aspectRatio(1f)
                    .padding(end = 8.dp)
            )
            Text(
                text = social_name,

                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                fontFamily = FontFamily.SansSerif,
                color = Color.Black
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ComposeBusinessCardPreview() {
        BuisnessCardTheme {
            ComposeBusinessCard()

    }
}