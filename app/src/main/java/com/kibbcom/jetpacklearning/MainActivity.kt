package com.kibbcom.jetpacklearning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
             Column {
                 ListOfUsers(
                     name = "John Doe",
                     occupation = "Software Engineer",
                     imageId = R.drawable.profile)
                 ListOfUsers(
                     name = "John Doe",
                     occupation = "Software Engineer",
                     imageId = R.drawable.user)
                 ListOfUsers(
                     name = "John Doe",
                     occupation = "Software Engineer",
                     imageId = R.drawable.profile)
                 ListOfUsers(
                     name = "John Doe",
                     occupation = "Software Engineer",
                     imageId = R.drawable.user)
                 ListOfUsers(
                     name = "John Doe",
                     occupation = "Software Engineer",
                     imageId = R.drawable.profile)
                 ListOfUsers(
                     name = "John Doe",
                     occupation = "Software Engineer",
                     imageId = R.drawable.user)
                 /// HOW TO MAKE IT NOW SCROLLABLE IF USERS ARE MORE ??
             }
        }
    }
}

@Composable
fun ListOfUsers(name : String, occupation : String, imageId : Int) {
    Row (
        modifier = Modifier
            .padding(10.dp)
    ) {
        Image(
            painterResource(id = imageId) ,
            contentDescription = "user_img",
            modifier = Modifier.size(100.dp))
        Column (
            modifier = Modifier
                .padding(horizontal = 15.dp, vertical = 20.dp)
        ){
            Text(
                text = name,
                fontWeight = FontWeight.Bold,
                fontSize = 22.sp,
                modifier = Modifier.padding(vertical = 5.dp)
            )
            Text(
                text = occupation,
                fontWeight = FontWeight.Medium,
                fontSize = 22.sp)
        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {

}