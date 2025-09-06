package com.example.cartevisite

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import com.example.cartevisite.ui.theme.CarteVisiteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CarteVisiteTheme {

                    CarteVisite()

            }
        }
    }
}

@Composable
fun CarteVisite() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Color(0xFF2B3545)
            ),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.padding(16.dp)
        ) {

            Image(
                painter = painterResource(id = R.drawable.android_logo),
                contentDescription = stringResource(R.string.descriplogo),
                modifier = Modifier .width(300.dp)
                    .height(300.dp),
                contentScale = ContentScale.Fit
            )
            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = stringResource(R.string.moi),
                fontSize = 32.sp,
                color=Color(0xFF3ddc84),
                fontWeight = FontWeight.Bold
            )
            Text(
                text = stringResource(R.string.fonction),
                fontSize = 20.sp,
                color=Color(0xFFF2F2F2),
            )
            Spacer(modifier = Modifier.height(50.dp))


            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.Top,
                modifier = Modifier.fillMaxWidth()
            ) {

                Column(
                    verticalArrangement = Arrangement.spacedBy(8.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Icon(
                        Icons.Default.Phone,
                        contentDescription = stringResource(R.string.descriptel),
                        tint = Color(0xFF3ddc84)
                    )
                    Icon(
                        Icons.Default.Email,
                        contentDescription = stringResource(R.string.descripmail),
                        tint = Color(0xFF3ddc84)
                    )
                    Icon(
                        Icons.Default.Share,
                        contentDescription = stringResource(R.string.descripreseausocial),
                        tint = Color(0xFF3ddc84)
                    )
                }

                Spacer(modifier = Modifier.width(16.dp))


                Column(
                    verticalArrangement = Arrangement.spacedBy(8.dp),
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(
                        stringResource(R.string.phonenumber),
                        fontSize = 18.sp,
                        color = Color(0xFFF2F2F2),
                        fontWeight = FontWeight.SemiBold
                    )
                    Text(
                        stringResource(R.string.email),
                        fontSize = 18.sp,
                        color = Color(0xFFF2F2F2),
                        fontWeight = FontWeight.SemiBold
                    )
                    Text(
                        stringResource(R.string.socialmedia),
                        fontSize = 18.sp,
                        color = Color(0xFFF2F2F2),
                        fontWeight = FontWeight.SemiBold
                    )
                }
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun CarteVisitePreview() {
    CarteVisiteTheme {
        CarteVisite()
    }
}
