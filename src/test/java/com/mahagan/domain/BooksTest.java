package com.mahagan.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

class BooksTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Books}
     *   <li>{@link Books#setAuthors(Set)}
     *   <li>{@link Books#setBokName(String)}
     *   <li>{@link Books#setBookEdition(String)}
     *   <li>{@link Books#setBookPublisher(String)}
     *   <li>{@link Books#setId(int)}
     *   <li>{@link Books#getAuthors()}
     *   <li>{@link Books#getBokName()}
     *   <li>{@link Books#getBookEdition()}
     *   <li>{@link Books#getBookPublisher()}
     *   <li>{@link Books#getId()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Books actualBooks = new Books();
        HashSet<Authors> authorsSet = new HashSet<>();
        actualBooks.setAuthors(authorsSet);
        actualBooks.setBokName("Bok Name");
        actualBooks.setBookEdition("Book Edition");
        actualBooks.setBookPublisher("Book Publisher");
        actualBooks.setId(1);
        assertSame(authorsSet, actualBooks.getAuthors());
        assertEquals("Bok Name", actualBooks.getBokName());
        assertEquals("Book Edition", actualBooks.getBookEdition());
        assertEquals("Book Publisher", actualBooks.getBookPublisher());
        assertEquals(1, actualBooks.getId());
    }
}

