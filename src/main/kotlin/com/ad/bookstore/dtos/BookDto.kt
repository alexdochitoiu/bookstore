package com.ad.bookstore.dtos

import java.util.UUID

data class BookDto(val id: UUID, val title: String, val author: String)
