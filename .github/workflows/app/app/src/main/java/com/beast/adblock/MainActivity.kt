package com.beast.adblock

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(modifier = Modifier.fillMaxSize(), color = Color.Black) {
                Column(modifier = Modifier.padding(24.dp)) {
                    Text("THE BEAST", color = Color.Red, style = MaterialTheme.typography.displayMedium)
                    Spacer(modifier = Modifier.height(10.dp))
                    Text("STATUS: HUNTING IN PROGRESS", color = Color.Gray)
                    
                    Spacer(modifier = Modifier.weight(1f))
                    
                    Button(
                        onClick = { },
                        colors = ButtonDefaults.buttonColors(containerColor = Color.Red),
                        modifier = Modifier.fillMaxWidth().height(60.dp)
                    ) {
                        Text("BEAST UNLEASHED", color = Color.Black)
                    }
                }
            }
        }
    }
}
