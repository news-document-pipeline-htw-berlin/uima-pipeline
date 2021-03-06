package json

import spray.json._

/**
 * Composes final json String.
 */
object JSONComposer {

  def compose(id: String,
              authors: List[String],
              crawlTime: BigDecimal,
              text: String,
              newsSite: String,
              links: List[String],
              publishedTime: Any,
              keywords: List[String],
              longUrl: String,
              shortUrl: String,
              intro: Any,
              title: String,
              imageLinks: List[String],
              description: Any,
              lemmas: List[String],
              readingTime: Int,
              mostRelevantLemmas: List[String],
              departments: List[String]): String = {

    ExtendedArticle(
      id,
      authors,
      crawlTime,
      text,
      newsSite,
      links,
      publishedTime,
      keywords,
      longUrl,
      shortUrl,
      intro,
      title,
      imageLinks,
      description,
      lemmas,
      readingTime,
      mostRelevantLemmas,
      departments).toJson(ExtendedArticleJsonProtocol.ExtendedArticleJsonFormat).compactPrint
  }

}
