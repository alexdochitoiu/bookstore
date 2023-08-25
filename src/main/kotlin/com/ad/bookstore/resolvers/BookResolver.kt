package com.ad.bookstore.resolvers

import com.ad.bookstore.dtos.BookDto
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller
import java.util.*

@Controller
class BookResolver {

  @QueryMapping
  fun getBooks(): List<BookDto> = listOf(
    BookDto(
      id = UUID.randomUUID(),
      title = "The Mist",
      author = "Stephen King"
    )
  )
}