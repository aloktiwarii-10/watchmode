package com.example.watchmode.presentation.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.watchmode.R
import com.example.watchmode.domain.titlesSample
import com.example.watchmode.presentation.uistate.TitleDetailsUiState
import coil.compose.AsyncImage


@Preview
@Composable
private fun TitleDetailsScreenPreview() {
    TitleDetailsScreen(TitleDetailsUiState(title = titlesSample.first()))
}

@Composable
fun TitleDetailsScreen(uiState: TitleDetailsUiState) {
    uiState.title?.let { title ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .verticalScroll(rememberScrollState())
        ) {
            Box(modifier = Modifier.fillMaxWidth()){
                AsyncImage(
                    modifier = Modifier.height(300.dp).align(Alignment.Center),
                    model = title.poster,
                    alignment = Alignment.Center,
                    placeholder = painterResource(id = R.drawable.new_placeholder),
                    contentDescription = title.title
                )
            }

            Text(
                modifier = Modifier.padding(top = 32.dp),
                fontSize = MaterialTheme.typography.titleLarge.fontSize,
                fontWeight = MaterialTheme.typography.titleLarge.fontWeight,
                text = "${title.title}  (${title.year})"
            )
            Text(
                text = title.plot ?: "",
                modifier = Modifier.padding(top = 16.dp),
                fontSize = MaterialTheme.typography.bodyLarge.fontSize
            )

            Text(
                text = ("Genres: " + title.genreNames?.joinToString(", ")),
                modifier = Modifier.padding(top = 16.dp),
                fontSize = MaterialTheme.typography.bodyLarge.fontSize
            )

            title.userRating?.let {
                Text(
                    text = ("Users Rating: " + title.userRating),
                    modifier = Modifier.padding(top = 16.dp),
                    fontSize = MaterialTheme.typography.bodyLarge.fontSize
                )
            }

            title.criticScore?.let {
                Text(
                    text = ("Critics Rating: " + title.criticScore),
                    modifier = Modifier.padding(top = 16.dp),
                    fontSize = MaterialTheme.typography.bodyLarge.fontSize
                )
            }

        }
    }
}
