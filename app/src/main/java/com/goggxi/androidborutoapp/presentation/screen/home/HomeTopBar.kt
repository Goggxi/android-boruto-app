package com.goggxi.androidborutoapp.presentation.screen.home

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.goggxi.androidborutoapp.ui.theme.topAppBarBackgroundColor
import com.goggxi.androidborutoapp.ui.theme.topAppBarContentColor

@Composable
fun HomeTopBar(onSearchClicked: () -> Unit) {
    TopAppBar(
        title = {
            Text(
                text = "Explore",
                color = MaterialTheme.colors.topAppBarContentColor
            )
        },
        backgroundColor = MaterialTheme.colors.topAppBarBackgroundColor,
        actions = {
            IconButton(onClick =  onSearchClicked) {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "search-icon"
                )
            }
        }
    )
}

@Composable
@Preview
fun HomeTopBarPreview() {
    HomeTopBar {}
}

//@Composable
//@Preview(uiMode = UI_MODE_NIGHT_YES)
//fun HomeTopBarDarkPreview() {
//    HomeTopBar {}
//}