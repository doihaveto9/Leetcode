import { BookWithReviews } from "./model";

/**
 * Parses passed books and reviews arrays to create an array of BookWithReviews object. Each row from books input array
 * should have a corresponding row in resulting array. For example, for following input data:
 *    books = [ { "id" : 101, "title" : "Some book title" } ]
 *    reviews = [ { "bookId" : 101, "author" : "John", "content" : "Great book!" } ];
 * It should return following result:
 *    result = [ { id: 101, title: "Some book title", reviews : [ { author: "John", content: "Great book!" }] } ];
 *
 * @param books - an array of input books, see 'src/app/dataset/books.json' for sample data.
 * @param reviews - an array of input reviews, see 'src/app/dataset/reviews.json' for sample data.
 * @returns {Array} - an array of BookWithReviews objects
 */
export function parseBooksData(books, reviews) {
  
  let booksAndReviewsArray = [];
  let reviewsMap 
  
  books.forEach(book => {
                booksAndReviewsArray.push(new BookWithReviews(book.id, book.title));
  });

  reviews.forEach(review => {
                for(let i = 0; i < booksAndReviewsArray.length; i++){
                  if(booksAndReviewsArray[i].id === review.bookId){
                    booksAndReviewsArray[i].reviews.push(review);
                    break;
                  }
                }
  })
  
  return booksAndReviewsArray;  // TODO: Implement
}

/**
 * Displays data from passed `books` array. For example, if books argument would have following value:
 *    books = [ { id: 101, title: "Some book title", reviews : [ { author: "John", content: "Great book!" }] } ];
 * then, following structure should be created under the parentNode:
 * <ol>
 *    <li>
 *      <span>Some book title</span>
 *      <ul>
 *        <li>Great book! by John</li>
 *      </ul>
 *    </li>
 * </ol>
 * @param parentNode - parent node for all books
 * @param booksWithReviews - an array of BookWithReviews objects.
 */
export function displayBooksWithReviews(parentNode, booksWithReviews) {
  // TODO: Implement
  
  if(booksWithReviews.length){
    const ol = document.createElement('ol');
  
  
    booksWithReviews.forEach(book => {
                      const li = document.createElement('li');
                      const span = document.createElement('span');
                      span.textContent = book.title;

                      li.appendChild(span);



                      if(book.reviews.length > 0){
                        const ul = document.createElement('ul');

                        book.reviews.forEach(review => {
                        const li_book = document.createElement('li');
                        li_book.textContent = review.content + " by " + review.author;
                        ul.appendChild(li_book);
                      })

                        li.appendChild(ul);
                      }


                      ol.appendChild(li);
  })
    
    parentNode.appendChild(ol);
  }
}
