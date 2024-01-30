package com.example.nykka_assignment

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.nykka_assignment.ui.theme.Nykka_AssignmentTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Nykka_AssignmentTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LazyColumn(content = {
                        items(getDataList()) { it ->
                            TextWidget(title = it)
                        }
                    })
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    val coroutineScope = rememberCoroutineScope()
    Button(onClick = {


    }) {
        Text("Filled")
    }
}

@Composable
fun TextWidget(title: String) {
    Text(title)
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Nykka_AssignmentTheme {
        Greeting("Android")
    }
}

fun getDataList(): MutableList<String> {

    val list = mutableListOf<String>()
    list.add("Hello")
    list.add("World")
    list.add("Abhishek")
    list.add("Singh")
    list.add("Hello")
    list.add("World")
    list.add("Abhishek")
    list.add("Singh")
    list.add("Hello")
    list.add("World")
    list.add("Abhishek")
    list.add("Singh")
    list.add("Hello")
    list.add("World")
    list.add("Abhishek")
    list.add("Singh")
    list.add("World")
    list.add("Abhishek")
    list.add("Singh")

    return list

}