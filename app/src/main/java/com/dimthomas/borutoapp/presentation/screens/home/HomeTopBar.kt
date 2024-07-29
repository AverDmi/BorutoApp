package com.dimthomas.borutoapp.presentation.screens.home

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.dimthomas.borutoapp.R
import com.dimthomas.borutoapp.ui.theme.topAppBarBackgroundColor
import com.dimthomas.borutoapp.ui.theme.topAppBarContentColor

@Composable
fun HomeTopBar(onSearchClicked: () -> Unit) {
    TopAppBar(
        title = {
            Text(
                text = "Explore",
                color = MaterialTheme.colorScheme.topAppBarContentColor
            )
        },
        backgroundColor = MaterialTheme.colorScheme.topAppBarBackgroundColor,
        actions = {
            IconButton(onClick = onSearchClicked) {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = stringResource(R.string.search_icon)
                )
            }
        }
    )
}

@Preview
@Composable
private fun HomeTopBarPreview() {
    HomeTopBar {}
}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun HomeTopBarDarkPreview() {
    HomeTopBar {}
}