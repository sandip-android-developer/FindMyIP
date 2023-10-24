package com.example.findmyip

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.findmyip.model.FindMyIpModel
import com.example.findmyip.ui.theme.FindMyIPTheme
import com.example.findmyip.utils.ApiState
import com.example.findmyip.view.ShowIPScreen
import com.example.findmyip.viewmodels.FindMyIPViewModel
import dagger.hilt.android.AndroidEntryPoint
import java.lang.reflect.Field

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private val viewModel: FindMyIPViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FindMyIPTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    ShowIPScreen()
                }
            }
        }
    }
}

/*

@Composable
fun IpScreen(viewModel: FindMyIPViewModel) {
    when (val result = viewModel.response.value) {
        is ApiState.Success -> {
            IpItems(result.data)
        }

        is ApiState.Failure -> {
            Box(modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center) {
                Text(text = "${result.msg}",
                        textAlign = TextAlign.Center)
            }
        }

        ApiState.Loading -> {
            CircularProgressIndicator(
                    modifier = Modifier
                            .fillMaxSize()
                            .wrapContentSize(align = Alignment.Center)
            )
        }

        ApiState.Empty -> {
            Box(modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center) {
                Text(text = "Data is empty!!",
                        textAlign = TextAlign.Center)
            }
        }
    }
}

@Composable
fun IpItems(findMyIp: FindMyIpModel) {
    val modelClass: Class<*> = findMyIp.javaClass
    val fields: Array<Field> = modelClass.declaredFields
    Column(modifier = Modifier.padding(10.dp)) {
        for (field in fields) {
            var fieldName: String = ""
            var value: Any? = ""
            try {
                field.isAccessible = true
                fieldName = field.name
                value = field.get(findMyIp)
                // Do something with the field name and its value
                println("Field: $fieldName, Value: $value")
            } catch (e: IllegalAccessException) {
                e.printStackTrace()
            }
            Text(text = "$fieldName : $value", fontSize = 16.sp)
        }
    }
}*/
