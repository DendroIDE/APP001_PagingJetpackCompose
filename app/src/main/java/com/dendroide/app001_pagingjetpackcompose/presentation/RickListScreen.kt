package com.dendroide.app001_pagingjetpackcompose.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.paging.compose.LazyPagingItems
import androidx.paging.compose.collectAsLazyPagingItems
import com.dendroide.app001_pagingjetpackcompose.presentation.model.CharacterModel

@Composable
fun RickListScreen(rickListViewModel: RickListViewModel = hiltViewModel()) {
    val characters = rickListViewModel.characters.collectAsLazyPagingItems()
    CharactersList(characters)
}

@Composable
fun CharactersList(characters: LazyPagingItems<CharacterModel>) {
    LazyColumn {
        items(characters.itemCount) {
            characters[it]?.let { characterModel -> ItemList(characterModel) }
        }
    }
}

@Composable
fun ItemList(characterModel: CharacterModel) {
    Box(modifier = Modifier
        .fillMaxWidth()
        .height(200.dp)
        .background(Color.Black)
        .padding(46.dp)) {
        Text(text = characterModel.name)
    }
}
