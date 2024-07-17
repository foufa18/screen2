package com.example.phone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.phone.ui.theme.PhoneTheme
import com.example.phone.ui.theme.Pink40
import com.example.phone.ui.theme.Pink80
import com.example.phone.ui.theme.Purple40
import com.example.phone.ui.theme.PurpleGrey40

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PhoneTheme {

            }
        }
    }
}
@Composable
fun Trend2Text(modifier: Modifier = Modifier) {
    Column {

        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Spacer(modifier = modifier.width(25.dp))
            Text(
                text = "Discover",
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.SansSerif,
                fontSize = 23.sp,
                color = Color.DarkGray


            )
            Spacer(modifier = modifier.weight(1f))
            Icon(
                painter = painterResource(id = R.drawable.shop
                ),
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.Top)
                    .padding(18.dp),
                tint=Pink40

            )

        }
    }

}



@Preview(showBackground = true, backgroundColor = 0xFF000000)
@Composable
fun TrendText2Preview() {
    Surface {
        Trend2Text()

    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Top(modifier: Modifier = Modifier) {
    Column {
        Spacer(modifier = modifier.height(2.dp))

        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp),

            placeholder = {
                Text(
                    text = "search",
                    style = MaterialTheme.typography.bodyLarge,
                    color=Color.Gray,

                    )
            },
            trailingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.search),
                    contentDescription = null,
                    modifier = modifier.size(30.dp),

                    )
            },
            shape = MaterialTheme.shapes.extraLarge,
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color.LightGray,
                disabledTextColor = Color.LightGray,
                cursorColor = Color.LightGray,
                disabledIndicatorColor = Color.Transparent,
                errorIndicatorColor = Color.Transparent,
                focusedIndicatorColor = Color.Black,
                unfocusedIndicatorColor = Color.LightGray
            ),
            singleLine = true,
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Search),
            textStyle = MaterialTheme.typography.bodySmall,

            )
    }
}
@Preview(showBackground = true, backgroundColor = 0xFF000000, heightDp = 40)
@Composable
fun TopPreview() {
    Surface {
        Top()

    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Image1(@DrawableRes drawable: Int) {
    Box {
        Image(
            painter = painterResource(id =R.drawable.f6), // Replace with your image
            contentDescription = "Image description",
            modifier = Modifier
                .padding(6.dp)
                .width(390.dp)
                .height(180.dp)
                .background(
                    color = PurpleGrey40,
                    shape = RoundedCornerShape(20.dp),

                    )
                .padding(horizontal = 10.dp, vertical = 2.dp)
                .clip(RoundedCornerShape(22.dp)),
            contentScale = ContentScale.Crop
        )

        Text(
            text =  "Clearance \n Sales",
            color = Color.White, // Adjust color as needed
            modifier = Modifier
                .align(Alignment.TopStart) // Position the text
                .padding(16.dp) ,// Add padding around the text
            style=MaterialTheme.typography.titleLarge,
        )
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = Modifier
                .height(49.dp)
                .width(120.dp)
                .align(Alignment.CenterStart)
                .padding(horizontal = 15.dp,),
            placeholder = {
                Text(
                    text = "Up to 50%",
                    style = MaterialTheme.typography.bodySmall,
                    color=Color.DarkGray,

                    )
            },
            shape = MaterialTheme.shapes.extraLarge,
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color.White,
                disabledTextColor = Color.LightGray,
                cursorColor = Color.LightGray,
                disabledIndicatorColor = Color.Transparent,
                errorIndicatorColor = Color.Transparent,
                focusedIndicatorColor = Color.Black,
                unfocusedIndicatorColor = Color.LightGray
            ),
            singleLine = true,
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Search),
            textStyle = MaterialTheme.typography.bodySmall,

            )

    }
}

@Preview(showBackground = true)
@Composable
fun Image1Preview() {
    PhoneTheme {
        Column {

            Image1(
                drawable = R.drawable.f6,)
        }


    }}
@Composable
fun Trend3Text(modifier: Modifier = Modifier) {
    Column {
        Spacer(modifier = modifier.height(10.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Spacer(modifier = modifier.width(25.dp))
            Text(
                text = "Categories",
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.SansSerif,
                fontSize = 23.sp,
                color = Color.DarkGray


            )
            Spacer(modifier = modifier.weight(1f))
            Text(
                text = "See All",
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.SansSerif,
                fontSize = 16.sp,
                color = Pink40



            )
            Spacer(modifier = modifier.width(25.dp))


        }
    }

}
@Preview(showBackground = true, backgroundColor = 0xFF000000)
@Composable
fun TrendText3Preview() {
    Surface {
        Trend3Text()

    }
}
@Composable
fun CategoryBoxes() {
    Row(modifier = Modifier.height(50.dp),

        horizontalArrangement = Arrangement.SpaceEvenly // Distribute boxes evenly
    ) {
        CategoryBox("All")
        CategoryBox("Smartphones")
        CategoryBox("Headphones")
        CategoryBox("Laptop")
        // Add more CategoryBox composables as needed
    }
}

@Composable
fun CategoryBox(text: String) {
    Box(
        modifier = Modifier
            .padding(8.dp)
            .background(
                color = Pink80,
                shape = RoundedCornerShape(20.dp)
            )
            .border( // Add border modifier here
                width = 1.dp, // Adjust border width as needed
                color = Color.Gray,
                shape = RoundedCornerShape(20.dp)
            )
            .padding(horizontal = 16.dp, vertical = 7.dp,)
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.bodyMedium,
            color=Color.DarkGray
        )


    }
}
@Preview(showBackground = true,heightDp = 50)
@Composable
fun CategoryBoxesPreview( ) {


    CategoryBoxes()

}
data class ImageData(
    @DrawableRes val image: Int,
    @StringRes val text1: Int,
    @StringRes val text2: Int,
    @StringRes val text3: Int,
)
@Composable
fun Image3(imageData: ImageData) {
    Column {

    Box {
        Image(
            painter = painterResource(id = imageData.image), // Replace with your image
            contentDescription = "Image description",
            modifier = Modifier
                .padding(8.dp)
                .width(200.dp)
                .height(150.dp)
                .border(width = 1.dp, color = Color.Gray, shape = RoundedCornerShape(20.dp))
                .padding(horizontal = 2.dp, vertical = 2.dp)
                .clip(RoundedCornerShape(20.dp)),
            contentScale = ContentScale.Crop
        )}
        Spacer(modifier = Modifier.height(3.dp))
        Row(
            modifier = Modifier
                .width(200.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Spacer(modifier = Modifier.width(25.dp))
            Text(
                text =  stringResource(id=imageData.text1),
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.SansSerif,
                fontSize = 15.sp,
                color = Color.Gray


            )
            Spacer(modifier = Modifier.width(20.dp))

            Icon(
                painter = painterResource(
                    id = R.drawable.star
                ),
                contentDescription = null,
                modifier = Modifier
                    .padding(10.dp)
                    .width(25.dp),
                tint = Purple40

            )
            Spacer(modifier = Modifier.width(2.dp))
        Text(
            text =  stringResource(id=imageData.text2),
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.SansSerif,
            fontSize = 15.sp,
            color = Color.DarkGray


        )}
            Text(
                modifier = Modifier
                    .padding(start=22.dp),
                text =  stringResource(id=imageData.text3),
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.SansSerif,
                fontSize = 15.sp,
                color = Color.Black


            )

}}
@Preview(showBackground = true)
@Composable
fun Image3Preview() {
    PhoneTheme {
        Column {

            Image1(
                drawable = R.drawable.f2,)
        }


    }}
@Composable
fun ImageLazyRow(imageDataList: List<ImageData>) {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(horizontal = 8.dp)
    ) {
        items(imageDataList) { imageData ->
            Image3(imageData)
        }
    }
}

// Sample data (same as before)
val imageDataList = listOf(
    ImageData(R.drawable.f2, R.string.Y, R.string.a,R.string.c),
    ImageData(R.drawable.f7, R.string.f, R.string.b,R.string.d),
    // ... add more ImageData objects for each item
)
@Preview(showBackground = true)
@Composable
fun ImageLazyRowPreview() {
   PhoneTheme {
        ImageLazyRow(imageDataList)
    }
}
data class ImageData2(
    @DrawableRes val image: Int,
    @StringRes val text1: Int,
    @StringRes val text2: Int,
    @StringRes val text3: Int,
)
@Composable
fun Image4(imageData2: ImageData) {
    Column {

        Box {
            Image(
                painter = painterResource(id = imageData2.image), // Replace with your image
                contentDescription = "Image description",
                modifier = Modifier
                    .padding(8.dp)
                    .width(200.dp)
                    .height(130.dp)
                    .border(width = 1.dp, color = Color.Gray, shape = RoundedCornerShape(20.dp))
                    .padding(horizontal = 2.dp, vertical = 2.dp)
                    .clip(RoundedCornerShape(20.dp)),
                contentScale = ContentScale.Crop
            )}
        Spacer(modifier = Modifier.height(3.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Spacer(modifier = Modifier.width(10.dp))
            Text(
                text =  stringResource(id=imageData2.text1),
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.SansSerif,
                fontSize = 10.sp,
                color = Color.DarkGray


            )
            Spacer(modifier = Modifier.width(10.dp))

            Icon(
                painter = painterResource(
                    id = R.drawable.star
                ),
                contentDescription = null,
                modifier = Modifier
                    .padding(10.dp),
                tint = Purple40

            )
            Text(
                text =  stringResource(id=imageData2.text2),
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.SansSerif,
                fontSize = 10.sp,
                color = Color.DarkGray


            )}
        Text(
            modifier = Modifier
                .padding(start=8.dp),
            text =  stringResource(id=imageData2.text3),
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.SansSerif,
            fontSize = 10.sp,
            color = Color.DarkGray


        )

    }}
@Preview(showBackground = true)
@Composable
fun Image4Preview() {
    PhoneTheme {
        Column {

            Image1(
                drawable = R.drawable.f4,)
        }


    }}
@Composable
fun ImageLazyRow2(imageDataList: List<ImageData>) {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(horizontal = 8.dp)
    ) {
        items(imageDataList) { imageData2 ->
            Image4(imageData2)
        }
    }
}

// Sample data (same as before)
val imageDataList2 = listOf(
    ImageData(R.drawable.f3, R.string.Y, R.string.a,R.string.c),
    ImageData(R.drawable.f4, R.string.f, R.string.b,R.string.d),
    // ... add more ImageData objects for each item
)
@Preview(showBackground = true)
@Composable
fun ImageLazyRow2Preview() {
    PhoneTheme {
        ImageLazyRow(imageDataList2)
    }
}
@Composable
fun BottomNavigation(modifier: Modifier = Modifier) {





    NavigationBar(
        containerColor = Color.White,
        modifier = modifier
    ) {
        NavigationBarItem(
            icon = {
                Icon(
                    imageVector = Icons.Default.Home,
                    contentDescription = null,
                    tint=Pink80,



                    )

            },
            selected = false,
            onClick = {}

        )
        NavigationBarItem(
            icon = {
                Icon(
                    imageVector = Icons.Default.Favorite,
                    contentDescription = null,
                    )


            },


            selected = false,
            onClick = {}
        )

        NavigationBarItem(
            icon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = null,

                    )
            },

            selected = false,
            onClick = {}
        )
        NavigationBarItem(
            icon = {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = null,

                    )
            },


            selected = false,
            onClick = {}
        )


    }
}
@Preview(showBackground = true, backgroundColor = 0xFFF5F0EE, heightDp = 59)
@Composable
fun BottomNavigationPreview() {
    PhoneTheme {
        BottomNavigation()
    }
}
@Composable
fun FullScreenPreview(content: @Composable Modifier.() -> Unit) {
    PhoneTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) {
            content(Modifier.padding(it)) // Add padding for content
        }
    }
}
@Preview(showBackground = true)
@Composable
fun AppContent() {
    Scaffold(
        bottomBar = { BottomNavigation() }
    ) { innerPadding ->
        Column() {
            TrendText2Preview()
            Top()
            Image1Preview()
            TrendText3Preview()
            CategoryBoxesPreview()
            ImageLazyRow(imageDataList)
            ImageLazyRow2(imageDataList2)
        }
    }
}