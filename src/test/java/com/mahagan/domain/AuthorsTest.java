package com.mahagan.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

class AuthorsTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Authors}
     *   <li>{@link Authors#setAuthorEducation(String)}
     *   <li>{@link Authors#setAuthorId(int)}
     *   <li>{@link Authors#setAuthorName(String)}
     *   <li>{@link Authors#setAuthorsEmail(String)}
     *   <li>{@link Authors#setBooks(Set)}
     *   <li>{@link Authors#getAuthorEducation()}
     *   <li>{@link Authors#getAuthorId()}
     *   <li>{@link Authors#getAuthorName()}
     *   <li>{@link Authors#getAuthorsEmail()}
     *   <li>{@link Authors#getBooks()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Authors actualAuthors = new Authors();
        actualAuthors.setAuthorEducation("JaneDoe");
        actualAuthors.setAuthorId(1);
        actualAuthors.setAuthorName("JaneDoe");
        actualAuthors.setAuthorsEmail("jane.doe@example.org");
        HashSet<Books> booksSet = new HashSet<>();
        actualAuthors.setBooks(booksSet);
        assertEquals("JaneDoe", actualAuthors.getAuthorEducation());
        assertEquals(1, actualAuthors.getAuthorId());
        assertEquals("JaneDoe", actualAuthors.getAuthorName());
        assertEquals("jane.doe@example.org", actualAuthors.getAuthorsEmail());
        assertSame(booksSet, actualAuthors.getBooks());
    }
}

